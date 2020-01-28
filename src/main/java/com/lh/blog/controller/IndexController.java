package com.lh.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author lanhu
 * @create 2020-01-28 16:40
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        int i = 9/0;
        return "index";
    }

    @GetMapping("/blog")
    public String blog() {
        return "blog";
    }
}

