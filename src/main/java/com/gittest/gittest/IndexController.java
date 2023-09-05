package com.gittest.gittest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class IndexController {

    @GetMapping("/")
    public String index(Model model) {

        model.addAttribute("test", "CI");

        return "index.html";
    }
}
