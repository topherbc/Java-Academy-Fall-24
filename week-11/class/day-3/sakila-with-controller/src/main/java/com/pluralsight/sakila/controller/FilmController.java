package com.pluralsight.sakila.controller;

import com.pluralsight.sakila.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilmController {

    private final FilmService filmService;

    @Autowired
    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    @RequestMapping(path="/", method=RequestMethod.GET)
    public String index(@RequestParam(defaultValue="World!") String name) {
        return "Hello " + name;
    }


}
