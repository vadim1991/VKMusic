package com.vkmusic.service.api;

import com.vkmusic.datamodel.CommonConstants;
import com.vkmusic.entity.VKUserBean;
import com.vkmusic.entity.vk.TrackParam;
import com.vkmusic.exception.HttpConnectionException;
import org.apache.http.client.utils.URIBuilder;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.URISyntaxException;

import static com.vkmusic.datamodel.CommonConstants.*;

/**
 * Created by Vadym_Vlasenko on 5/6/2016.
 */
@Service
public class VKQueryBuilder {

    public URI getURIAudio(VKUserBean userBean, TrackParam trackParam) {
        URIBuilder builder = new URIBuilder();
        builder.setScheme(HTTPS_SCHEME).setHost(API_VK_COM_HOST).setPath(METHOD_AUDIO_GET)
                .setParameter(OWNER_ID, userBean.getId())
                .setParameter(NEED_USER, String.valueOf(trackParam.getNeedUser()))
                .setParameter(COUNT, String.valueOf(trackParam.getCount()))
                .setParameter(OFFSET, String.valueOf(trackParam.getOffset()))
                .setParameter(ACCESS_TOKEN, userBean.getResponseVK().getAccess_token());
        URI uri;
        try {
            uri = builder.build();
        } catch (URISyntaxException e) {
            throw new HttpConnectionException(e.getCause());
        }
        return uri;
    }

}
