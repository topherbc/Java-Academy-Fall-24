package com.pluralsight.sakila.controller;

import com.pluralsight.sakila.model.Film;
import com.pluralsight.sakila.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @RequestMapping(path="/films", method=RequestMethod.GET)
    public List<Film> films() {
        return filmService.getAllFilms();
    }

    @RequestMapping(path="/films", method=RequestMethod.POST)
    public int addProduct(@RequestBody Film film) {
        filmService.addFilm(film);
        return 0;
    }

    @RequestMapping(path="/films/{id}", method=RequestMethod.DELETE)
    public boolean deleteProduct(@PathVariable int id) {
        filmService.deleteFilmById(id);
        return true;
    }
    
}
