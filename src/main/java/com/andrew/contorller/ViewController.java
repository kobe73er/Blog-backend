package com.andrew.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dengpengfei on 2017/7/8.
 */
@Controller
@CrossOrigin
public class ViewController {
    @RequestMapping({"/blog", "/wb"})
    public String index() {
        return "forward:/index.html";
    }
}
