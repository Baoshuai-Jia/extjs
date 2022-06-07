package com.me.extjs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PreviewFileController {

    @GetMapping("previewPdf")
    public ModelAndView previewPdf(ModelAndView mav){
        mav.setViewName("file/previewPdf");

        return mav;
    }
}
