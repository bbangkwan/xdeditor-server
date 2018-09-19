package com.mobigen.ngn.xdeditor.util.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;
import java.util.Map;

/**
 * Created by Bae B K on 2018. 9. 13.
 */
@Slf4j
@Component
public class HTTPInterceptor extends HandlerInterceptorAdapter {
    private static final Marker MESSAGE_MARKER = MarkerFactory.getMarker(HTTPInterceptor.class.getSimpleName());
    
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info(MESSAGE_MARKER, "===========================          START         ===========================");
        log.info(MESSAGE_MARKER, "Request URI \t: "+request.getRequestURI());
    
        log.info(MESSAGE_MARKER, request.getMethod());
        
        return super.preHandle(request, response, handler);
    }
    
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        super.postHandle(request, response, handler, modelAndView);
    
        log.info(MESSAGE_MARKER, "===========================          STOP          ===========================");
    }
    
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        super.afterCompletion(request, response, handler, ex);
    
        log.info(MESSAGE_MARKER, "===========================    Method Completed    ===========================");
    }
}
