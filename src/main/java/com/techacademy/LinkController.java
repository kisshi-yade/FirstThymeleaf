package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LinkController {
    @RequestMapping("link")
    public String link(Model model) {
        model.addAttribute("id", "123");
        return "link";
    }
}
