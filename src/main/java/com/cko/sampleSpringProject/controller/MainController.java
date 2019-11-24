package com.cko.sampleSpringProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/loginPage")
    public String showLoginPage(){
        return "login";
    }

    @GetMapping("/")
    public String main(){
        return "main";
    }

    @GetMapping("/game")
    public String game()
    {
        return "MyProject";
    }

    @GetMapping("/test")
    public String testing(@RequestParam String name)
    {
        System.out.println(name);
        return "test";
    }

    @GetMapping("/allFilms")
    public String all()
    {
        return "FilmsAll/allFilms";
    }

    @GetMapping("/createFilms")
    public String create()
    {
        return "FilmsAll/createFilm";
    }

    @GetMapping("/editFilm")
    public String edit()
    {
        return "FilmsAll/editFilm";
    }
}

