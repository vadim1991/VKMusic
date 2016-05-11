package com.vkmusic.datamodel;

/**
 * Created by Vadym_Vlasenko on 5/6/2016.
 */
public class VKApiURLs {

    public static final String USER_GENERAL_INFO_URL = "https://api.vk.com/method/users.get?uids=%s&fields=uid,first_name,last_name,nickname,screen_name,sex,bdate,city,country,timezone,photo&access_token=%s";
    public static final String REDIRECT_URL_VK_FORMAT = "https://oauth.vk.com/access_token?client_id=%s&client_secret=%s&redirect_uri=%s&code=%s";
    public static final String VK_TOKEN_URL = "https://accounts.google.com/o/oauth2/token";
    public static final String VK_OAUTH_URL = "https://oauth.vk.com/access_token";

}
