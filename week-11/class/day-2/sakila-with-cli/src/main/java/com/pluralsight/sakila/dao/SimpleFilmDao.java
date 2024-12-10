package com.pluralsight.sakila.dao;

import com.pluralsight.sakila.model.Film;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SimpleFilmDao implements FilmDao {
    private List<Film> films;

    public SimpleFilmDao() {
        this.films = new ArrayList<>();
        this.films.add(new Film(1, "Dune 2", "big sandy worms", "2024"));
        this.films.add(new Film(2, "Kill Bill vol. 1", "Uma Thurman with swords", "2003"));
        this.films.add(new Film(3, "Super Bad", "McLovin does bad things", "2007"));
    }


    @Override
    public void add(Film film) {
        this.films.add(film);
    }

    @Override
    public List<Film> getAll() {
        return this.films;
    }
}
