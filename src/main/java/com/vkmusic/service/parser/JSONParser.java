package com.vkmusic.service.parser;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vkmusic.datamodel.CommonConstants;
import com.vkmusic.entity.ResponseVK;
import com.vkmusic.entity.Role;
import com.vkmusic.entity.VKResponseBean;
import com.vkmusic.entity.VKUserBean;
import com.vkmusic.entity.vk.Track;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Vadym_Vlasenko on 5/6/2016.
 */
@Service
public class JSONParser {

    public static final String LEFT_SLASH = "\\/";
    public static final String RIGHT_SLASH = "/";
    public static final String RESPONSE = "response";

    @Autowired
    private ObjectMapper objectMapper;

    public VKUserBean getVKUserBean(String response) throws IOException {
        JsonNode jsonNode = objectMapper.readTree(response);
        JsonNode responseNode = jsonNode.get(RESPONSE);
        JsonNode profileNode = responseNode.get(0);
        VKResponseBean vkResponseBean = objectMapper.readValue(String.valueOf(profileNode), VKResponseBean.class);
        return getUserBeanFromProfile(vkResponseBean);
    }

    public ResponseVK getResponseVK(String response) throws IOException {
        return objectMapper.readValue(response, ResponseVK.class);
    }

    public List<Track> getTracks(String response) throws IOException {
        List<Track> tracks = new ArrayList<>();
        JsonNode jsonNode = objectMapper.readTree(response);
        JsonNode trackNodes = jsonNode.get(RESPONSE);
        for (JsonNode trackNode : trackNodes) {
            if (trackNode.isInt()) {
                continue;
            }
            Track track = objectMapper.readValue(trackNode.toString(), Track.class);
            track.setUrl(track.getUrl().replaceAll(LEFT_SLASH, RIGHT_SLASH));
            tracks.add(track);
        }
        return tracks;
    }

    private VKUserBean getUserBeanFromProfile(VKResponseBean vkResponseBean) {
        VKUserBean vkUserBean = new VKUserBean();
        vkUserBean.setId(vkResponseBean.getUid());
        vkUserBean.setFirstName(vkResponseBean.getFirst_name());
        vkUserBean.setLastName(vkResponseBean.getLast_name());
        vkUserBean.setNickName(vkResponseBean.getNickname());
        vkUserBean.setScreenName(vkResponseBean.getScreen_name());
        vkUserBean.setSex(vkResponseBean.getSex());
        vkUserBean.setPhotoUrl(vkResponseBean.getPhoto().replaceAll(LEFT_SLASH, RIGHT_SLASH));
        setUserRole(vkUserBean);
        return vkUserBean;
    }

    private void setUserRole(VKUserBean vkUserBean) {
        Set<Role> roles = new HashSet<>();
        roles.add(CommonConstants.USER_ROLE);
        vkUserBean.setRoles(roles);
    }

}
