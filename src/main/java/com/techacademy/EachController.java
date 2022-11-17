package com.techacademy;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EachController {

    @RequestMapping("each")
    public ModelAndView obj(ModelAndView mav) {
        mav.setViewName("each");
        List<Member> member = new ArrayList<>();
        member.add(new Member(1, "taro", "男性", 27));
        member.add(new Member(2, "jiro", "男性", 22));
        member.add(new Member(3, "hanako", "女性", 25));
        mav.addObject("obj", member);
        return mav;
    }
}
