package com.springpractice.store;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String getMethodName() {
        String viewName = getViewName();
        return viewName;
    }

    private String getViewName() {
        return "index.html";
    }
    
}
