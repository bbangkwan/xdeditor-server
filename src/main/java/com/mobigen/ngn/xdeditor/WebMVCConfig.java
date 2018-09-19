package com.mobigen.ngn.xdeditor;

import com.mobigen.ngn.xdeditor.util.interceptor.HTTPInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by Bae B K on 2018. 9. 13.
 */
@Configuration
public class WebMVCConfig implements WebMvcConfigurer {
    @Autowired
    private HTTPInterceptor httpInterceptor;
    
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(httpInterceptor).addPathPatterns("/**").excludePathPatterns("/swagger-ui.html");
        
        //registry.addInterceptor(testInterceptor)
        //                .addPathPatterns("/api/**")
        //                .excludePathPatterns(EXCLUDE_PATHS);
    }
}
