package com.vkmusic.service.api;

import com.vkmusic.entity.AuthenticationConfig;
import com.vkmusic.entity.ResponseVK;
import com.vkmusic.entity.VKUserBean;
import com.vkmusic.entity.vk.Track;
import com.vkmusic.entity.vk.TrackParam;
import com.vkmusic.exception.VKIntegrationException;
import com.vkmusic.service.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.util.List;

import static com.vkmusic.datamodel.CommonURLs.REDIRECT_URL_VK;
import static com.vkmusic.datamodel.VKApiURLs.REDIRECT_URL_VK_FORMAT;
import static com.vkmusic.datamodel.VKApiURLs.USER_GENERAL_INFO_URL;

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
        String userGeneralURL = String.format(USER_GENERAL_INFO_URL, responseVK.getUser_id(), responseVK.getAccess_token());
        String responseWithUserInfo = connector.sendGet(userGeneralURL);
        VKUserBean vkUserBean = parser.getVKUserBean(responseWithUserInfo);
        return vkUserBean;

    }

    public List<Track> getAudio(VKUserBean userBean, TrackParam trackParam) throws IOException {
        URI uriAudio = queryBuilder.getURIAudio(userBean, trackParam);
        String response = connector.sendGet(uriAudio);
        System.out.println(response);
        List<Track> tracks = parser.getTracks(response);
        System.out.println(tracks);
        return tracks;
    }

    private String getVKAccessTokenURL(String code) {
        return String.format(REDIRECT_URL_VK_FORMAT, config.getVkClientID(), config.getVkClientSecret(), REDIRECT_URL_VK, code);
    }

}
