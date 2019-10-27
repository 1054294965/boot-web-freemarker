package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
	@RequestMapping("/index2")
    public String index2(Model model){
        return "/static/index2.html";
    }
}
