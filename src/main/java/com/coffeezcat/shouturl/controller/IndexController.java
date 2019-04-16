package com.coffeezcat.shouturl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author coffezcat
 * @title: IndexController
 * @projectName shout-url
 * @description: 首页
 * @date 2019/4/16 18:08
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String jump(){

    }

    @RequestMapping("/index")
    public String index(){

    }

    @RequestMapping("/post")
    public String generateCode(String url,int bit){
        
    }
}
