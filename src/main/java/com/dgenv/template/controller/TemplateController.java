package com.dgenv.template.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TemplateController {
    @RequestMapping("/")
    public String home(Model model,HttpSession session) {
    	model.addAttribute("pageName","메인");
        return "layouts/layout_main";
    }
    
    
    @RequestMapping("/tmp")
    public String tmp(Model model,HttpSession session) {
    	model.addAttribute("pageName","메인");
        return "tmp";
    }
}