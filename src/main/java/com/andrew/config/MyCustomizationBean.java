package com.andrew.config;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.stereotype.Component;

/**
 * Created by dengpengfei on 2017/7/7.
 */
@Component
public class MyCustomizationBean implements EmbeddedServletContainerCustomizer {
    /**
     * @param container
     * @see EmbeddedServletContainerCustomizer#customize(ConfigurableEmbeddedServletContainer)
     */
    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
//        container.setContextPath("/sprintboot");
        container.setPort(8082);
        container.setSessionTimeout(30);
    }

}