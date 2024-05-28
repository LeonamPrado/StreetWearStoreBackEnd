package com.leoproject.StreetWearStoreBackEnd.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.File;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Value("${image.upload.directory}")
    private String uploadDirectory;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // Converte o caminho relativo para absoluto
        String absolutePath = new File(uploadDirectory).getAbsolutePath() + "/";
        registry.addResourceHandler("/images/**")
                .addResourceLocations("file:" + absolutePath);
    }
}

