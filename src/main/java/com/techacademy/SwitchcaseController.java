package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SwitchcaseController {

    @RequestMapping("/switchcase/{val}/")
    public String switchcase(@PathVariable int val, Model model) {
        model.addAttribute("val", val);
        return "switchcase";
    }
}