package com.vkmusic.controller;

import com.vkmusic.datamodel.CommonConstants;
import com.vkmusic.entity.ResponseVK;
import com.vkmusic.entity.VKUserBean;
import com.vkmusic.service.api.VKApiManager;
import com.vkmusic.service.autentication.CustomAuthenticationManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.io.IOException;

import static com.vkmusic.datamodel.CommonConstants.*;

/**
 * Created by Vadym_Vlasenko on 5/6/2016.
 */
@Controller
public class LoginController {

    @Autowired
    private VKApiManager apiManager;
    @Autowired
    private CustomAuthenticationManager authenticationManager;

    @RequestMapping(value = "/vklogin", method = RequestMethod.GET)
    public String loginWithVK(@RequestParam("code") String code, HttpSession session) throws IOException {
        ResponseVK responseVK = apiManager.authentication(code);
        VKUserBean vkUserBean = apiManager.getGeneralInfo(responseVK);
        vkUserBean.setResponseVK(responseVK);
        if (vkUserBean != null) {
            session.setAttribute(PROFILE, vkUserBean);
            authenticationManager.authenticateUser(vkUserBean);
        } else {
            return "redirect:/";
        }
        return "redirect:/my-tracks";
    }

}
