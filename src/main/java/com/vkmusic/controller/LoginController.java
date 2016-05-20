package com.vkmusic.controller;

import com.vkmusic.datamodel.CommonURLs;
import com.vkmusic.entity.ResponseVK;
import com.vkmusic.entity.VKUserBean;
import com.vkmusic.service.api.VKApiManager;
import com.vkmusic.service.autentication.CustomAuthenticationManager;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.io.IOException;

import static com.vkmusic.datamodel.CommonConstants.PROFILE;

/**
 * Created by Vadym_Vlasenko on 5/6/2016.
 */
@Controller
public class LoginController {

    @Autowired
    private VKApiManager apiManager;
    @Autowired
    private CustomAuthenticationManager authenticationManager;

    @RequestMapping(value = CommonURLs.VKLOGIN_URL, method = RequestMethod.GET)
    public String loginWithVK(@RequestParam(required = false) String code, @RequestParam(required = false) String error, HttpSession session) throws IOException {
        if (StringUtils.isNotBlank(error)) {
            return CommonURLs.REDIRECT_ROOT;
        }
        ResponseVK responseVK = apiManager.authentication(code);
        VKUserBean vkUserBean = apiManager.getGeneralInfo(responseVK);
        vkUserBean.setResponseVK(responseVK);
        if (vkUserBean != null) {
            session.setAttribute(PROFILE, vkUserBean);
            authenticationManager.authenticateUser(vkUserBean);
        } else {
            return CommonURLs.REDIRECT_ROOT;
        }
        return CommonURLs.REDIRECT_MY_TRACKS_URL;
    }

}
