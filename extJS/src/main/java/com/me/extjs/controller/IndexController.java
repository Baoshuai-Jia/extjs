package com.me.extjs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @GetMapping("start")
    public ModelAndView hello(ModelAndView model){
        // templates下的文件名
        model.setViewName("hello");
        // 添加内容
        model.addObject("name", "ThymeLeaf");
        return model;
    }

    // freemarker
    @GetMapping("/freemarker")
    public String helloFreeMarker(Model model){
        // 添加内容
        model.addAttribute("name", "FreeMarker");
        return "hello";
    }
}
