package com.vkmusic.controller;

import com.vkmusic.entity.VKUserBean;
import com.vkmusic.entity.vk.AudioSearchBean;
import com.vkmusic.entity.vk.Track;
import com.vkmusic.entity.vk.TrackParam;
import com.vkmusic.service.api.VKApiManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.vkmusic.datamodel.CommonConstants.PROFILE;

/**
 * Created by Vadym_Vlasenko on 5/9/2016.
 */
@Controller
public class AudioController {

    @Autowired
    private VKApiManager vkApiManager;

    @RequestMapping(value = "/tracks")
    public @ResponseBody List<Track> getTracks(HttpSession session) throws IOException {
        TrackParam trackParam = new TrackParam(15, 0, 0);
        VKUserBean user = (VKUserBean) session.getAttribute(PROFILE);
        List<Track> trackList = new ArrayList<>();
        if (user != null) {
            trackList = vkApiManager.getAudio(user, trackParam);
        }
        return trackList;
    }

    @RequestMapping(value = "/search")
    public @ResponseBody List<Track> searchTracks(HttpSession session, @RequestBody AudioSearchBean searchParam) throws IOException {
        VKUserBean user = (VKUserBean) session.getAttribute(PROFILE);
        List<Track> trackList = new ArrayList<>();
        if (user!= null) {
            trackList = vkApiManager.searchAudio(user, searchParam);
        }
        return trackList;
    }
}
