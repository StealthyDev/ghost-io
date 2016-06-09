package com.stealthydev.open.ghostio.config;

import com.stealthydev.open.ghostio.service.LayoutService;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.io.File;

@Component
class WebConfigurer extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("file:///" + new File(LayoutService.LAYOUTS_FOLDER).getAbsolutePath());
    }
}
