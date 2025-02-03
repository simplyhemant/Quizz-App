package com.simply.Quiz_app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Webconfig implements WebMvcConfigurer {

    public void addCorsMappings(CorsRegistry registry)
    {
        registry.addMapping("/**")  // Allows all endpoints
                .allowedOrigins("http://127.0.0.1:5500")   // allow for fronted origin
                .allowedMethods("GET", "POST", "PUT", "OPTIONS")
                .allowedHeaders("*")
                .allowCredentials(true);
    }

}
