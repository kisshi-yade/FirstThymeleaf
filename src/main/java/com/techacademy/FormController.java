package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
    @RequestMapping(value = "form", method = RequestMethod.GET)
    public String dispFirstPage(Model model) {
        model.addAttribute("msg", "値を入力してください。");
        return "form";
    }

    @RequestMapping(value = "form", method = RequestMethod.POST)
    public String dispNextPage(@RequestParam("val") String str, Model model) {
        model.addAttribute("msg", "入力された値は「" + str + "です。");
        model.addAttribute("val", str);
        return "form";
    }
}
