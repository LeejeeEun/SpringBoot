package com.codepresso.controllerexcercise.config;

import com.codepresso.controllerexcercise.Service.PostService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public PostService postService() {
        return new PostService();
    }
}
