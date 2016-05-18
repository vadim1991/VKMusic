package com.vkmusic.controller;

import com.vkmusic.datamodel.CommonConstants;
import com.vkmusic.entity.VKUserBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * Created by Vadym_Vlasenko on 12.08.2015.
 */
@Controller
public class MainController {

    public static final String LOGIN_PAGE = "login";
    public static final String MY_TRACKS = "my-tracks";
    public static final String HOME_URL = "/my-tracks";
    public static final String LOGIN_URL = "/login";
    public static final String ROOT_URL = "/";

    @RequestMapping(value = HOME_URL)
    public String getIndexPage() {
        return MY_TRACKS;
    }

    @RequestMapping(value = ROOT_URL)
    public String getHomePage(HttpSession session) {
        VKUserBean profile = (VKUserBean) session.getAttribute(CommonConstants.PROFILE);
        String page = profile == null ? LOGIN_PAGE : MY_TRACKS;
        return page;
    }

    @RequestMapping(value = LOGIN_URL)
    public String login() {
        return LOGIN_PAGE;
    }

}
