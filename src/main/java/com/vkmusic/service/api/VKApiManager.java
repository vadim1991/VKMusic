package com.vkmusic.service.api;

import com.vkmusic.datamodel.CommonConstants;
import com.vkmusic.entity.AuthenticationConfig;
import com.vkmusic.entity.ResponseVK;
import com.vkmusic.entity.VKUserBean;
import com.vkmusic.entity.vk.AudioSearchBean;
import com.vkmusic.entity.vk.FriendParamBean;
import com.vkmusic.entity.vk.Track;
import com.vkmusic.entity.vk.TrackParam;
import com.vkmusic.exception.VKIntegrationException;
import com.vkmusic.exception.VKInvalidTokenException;
import com.vkmusic.service.parser.JSONParser;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.util.Collections;
import java.util.List;

import static com.vkmusic.datamodel.VKApiURLs.REDIRECT_URL_VK;
import static com.vkmusic.datamodel.VKApi.FIELD_VALUES;
import static com.vkmusic.datamodel.VKApiURLs.REDIRECT_URL_VK_FORMAT;

/**
 * Created by Vadym_Vlasenko on 5/6/2016.
 */
@Service
public class VKApiManager {

    @Autowired
    private HttpConnector connector;
    @Autowired
    private JSONParser parser;
    @Autowired
    private AuthenticationConfig config;
    @Autowired
    private VKQueryBuilder queryBuilder;

    public ResponseVK authentication(String code) {
        String vkAccessTokenURL = getVKAccessTokenURL(code);
        try {
            String response = connector.sendGet(vkAccessTokenURL);
            ResponseVK responseVK = parser.getResponseVK(response);
            return responseVK;
        } catch (IOException e) {
            throw new VKIntegrationException(e);
        }
    }

    public VKUserBean getGeneralInfo(ResponseVK responseVK) throws IOException {
        URI generalInfoURI = queryBuilder.getGeneralInfo(responseVK, FIELD_VALUES);
        String responseWithUserInfo = getResponseByURI(generalInfoURI);
        VKUserBean vkUserBean = parser.getVKUserBean(responseWithUserInfo);
        return vkUserBean;
    }

    public List<VKUserBean> getFriends(VKUserBean userBean, FriendParamBean friendParamBean) throws IOException {
        URI friendsURI = queryBuilder.getFriendsURI(userBean, friendParamBean);
        String response = getResponseByURI(friendsURI);
        List<VKUserBean> vkUserBeanList = parser.getVKUserBeanList(response);
        return getFinalList(vkUserBeanList);
    }

    public List<Track> getAudio(VKUserBean userBean, TrackParam trackParam) throws IOException {
        URI uriAudio = queryBuilder.getURIAudio(userBean, trackParam);
        String response = getResponseByURI(uriAudio);
        List<Track> tracks = parser.getTracks(response);
        return getFinalList(tracks);
    }

    public List<Track> searchAudio(VKUserBean userBean, AudioSearchBean searchBean) throws IOException {
        URI uriBySearchAudio = queryBuilder.getURIBySearchAudio(userBean, searchBean);
        String response = getResponseByURI(uriBySearchAudio);
        List<Track> tracks = parser.getTracks(response);
        return getFinalList(tracks);
    }

    public List<Track> getAudiosByID(VKUserBean userBean, String id) throws IOException {
        URI audioByIDURI = queryBuilder.getAudioByIDURI(userBean, id);
        String response = getResponseByURI(audioByIDURI);
        List<Track> tracks = parser.getTracks(response);
        return getFinalList(tracks);
    }

    private String getResponseByURI(URI uri) throws IOException {
        String response = connector.sendGet(uri);
        if (response.contains(CommonConstants.ERROR)) {
            throw new VKInvalidTokenException("Invalid token or userID");
        }
        return response;
    }

    private <T extends Object> List<T> getFinalList(List<T> list) {
        return CollectionUtils.isEmpty(list) ? Collections.<T>emptyList() : list;
    }

    private String getVKAccessTokenURL(String code) {
        return String.format(REDIRECT_URL_VK_FORMAT, config.getVkClientID(), config.getVkClientSecret(), REDIRECT_URL_VK, code);
    }

}
