package com.techacademy;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NowController {
    @RequestMapping("now")
    public String dispTime(Model model) {
        String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        model.addAttribute("msg", "現在時刻：" + now);
        return "now";
    }
}
