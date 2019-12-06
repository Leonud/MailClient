package com.cko.sampleSpringProject.controller;

import com.cko.sampleSpringProject.dao.FilmDAO;
import com.cko.sampleSpringProject.model.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/films")
public class FilmController {
    @Autowired
    FilmDAO filmDAO;
    @GetMapping("/allFilms")
    public String all() {
        return "FilmsAll/allFilms";
    }

    @GetMapping("/editFilm")
    public ModelAndView ShowEditFilmsPage(@RequestParam Long id) {
        ModelAndView modelAndView = new ModelAndView();
        Optional<Film>  optional = filmDAO.findById(id);
        Film film = optional.get();
        modelAndView.addObject("film",film);
        modelAndView.setViewName("FilmsAll/editFilm");
         return modelAndView;
    }

    @PostMapping("/editFilm")
    public RedirectView editFilm(Film film) {
        filmDAO.save(film);
        return new RedirectView("/films/allFilm");
    }

    @GetMapping("/deleteFilm")
    public RedirectView deleteFilm(@RequestParam Long id) {
        filmDAO.deleteById(id);
        return new RedirectView("/films/all");
    }

    @GetMapping("/createFilms")
    public String create() {
        return "FilmsAll/createFilm";
    }

    @PostMapping("/createFilms")
    public RedirectView createFilms(Film film) {
        filmDAO.save(film);
        return new RedirectView("/films/allFilm");
    }

    @GetMapping("/all")
    public  ModelAndView all(Film film){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("FilmsAll/allFilms");
        List<Film> filmList = filmDAO.findAll();
        modelAndView.addObject("films",filmList);
        return modelAndView;
    }

    @GetMapping("/te")
    public ModelAndView ShowFilmsPage(@RequestParam Long id) {
        ModelAndView modelAndView = new ModelAndView();
        Optional<Film>  optional = filmDAO.findById(id);
        Film film = optional.get();
        modelAndView.addObject("film",film);
        modelAndView.setViewName("te");
        return modelAndView;
    }
}

