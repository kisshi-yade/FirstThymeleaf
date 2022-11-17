package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IfunlessController {

    @RequestMapping("/ifunless/{val1}/{val2}/")
    public String ifunless(@PathVariable int val1, @PathVariable int val2, Model model) {
        model.addAttribute("val1", val1);
        model.addAttribute("val2", val2);
        return "ifunless";
    }
}
