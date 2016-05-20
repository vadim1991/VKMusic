package com.vkmusic.service.handler;

import com.vkmusic.exception.VKInvalidTokenException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Vadym_Vlasenko on 5/20/2016.
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(VKInvalidTokenException.class)
    public ModelAndView handleInvalidTokenException(HttpServletRequest request, Exception exception) {
        LOGGER.info("EventNotFoundException Occurred:: URL=" + request.getRequestURL());
        return new ModelAndView("login");
    }

//    private ModelAndView getModelForException(String view, String message) {
//        ModelAndView modelAndView = new ModelAndView(view);
//        modelAndView.addObject(MSG_ATTRIBUTE, message);
//        return modelAndView;
//    }

}
