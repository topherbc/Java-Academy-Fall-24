package com.pluralsight.sakila.cli.screen;

import com.pluralsight.sakila.model.Film;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FilmListScreen {
    public void displayAllFilms(List<Film> films) {
        System.out.println("\n------------\n");
        films.forEach(System.out::println);
    }
}
