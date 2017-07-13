package com.andrew.entity;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

/**
 * Created by dengpengfei on 2017/7/13.
 */
@Configuration
public class GsonObject {
//    private Gson gson = null;

    @Bean
    public Gson getGson() {
        return new Gson();
    }


}
