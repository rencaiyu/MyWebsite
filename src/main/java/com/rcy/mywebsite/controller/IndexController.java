package com.rcy.mywebsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: RCY
 * @Date: 2019/4/17 14:42
 * @Description: 主界面
 * @Email: 18600820674@163.com
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
