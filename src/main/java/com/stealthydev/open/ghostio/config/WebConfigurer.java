package com.stealthydev.open.ghostio.config;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Component
class WebConfigurer extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //TODO: change it to /root/layouts
        registry.addResourceHandler("/static/**").addResourceLocations("file:///C:/sen/projects/work/java/ghost-io/layouts");
    }
}
