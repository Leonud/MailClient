package com.cko.sampleSpringProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/mail")
public class popmail {

    @GetMapping("/post")
    public String post() {
        return "index";
    }

    @GetMapping("/sent")
    public String sent() {
        return "sent";
    }

    @GetMapping("/basket")
    public String basket() {
        return "basket";
    }

    @GetMapping("/favorites")
    public String favorites() {
        return "favorites";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
