package com.vkmusic.controller;

import com.vkmusic.datamodel.CommonConstants;
import com.vkmusic.entity.VKUserBean;
import com.vkmusic.entity.vk.Track;
import com.vkmusic.entity.vk.TrackParam;
import com.vkmusic.service.api.VKApiManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Created by Vadym_Vlasenko on 5/9/2016.
 */
@Controller
public class AudioController {

    @Autowired
    private VKApiManager vkApiManager;

    @RequestMapping(value = "/tracks")
    public ModelAndView getTracks(HttpSession session) throws IOException {
        Map<String, Object> model = new HashMap<>();
        TrackParam trackParam = new TrackParam(15, 0, 0);
        VKUserBean user = (VKUserBean) session.getAttribute(CommonConstants.PROFILE);
        List<Track> trackList = vkApiManager.getAudio(user, trackParam);
        model.put("tracks", trackList);
        return new ModelAndView("play", model);
    }

}
