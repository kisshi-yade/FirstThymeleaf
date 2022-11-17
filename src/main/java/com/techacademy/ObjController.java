package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ObjController {
    @RequestMapping("obj")
    public ModelAndView obj(ModelAndView mav) {
        mav.setViewName("obj");
        Member mbr = new Member(1, "HOGE山HOGE太郎", "男性", 27);
        mav.addObject("obj", mbr);
        return mav;
    }
}
