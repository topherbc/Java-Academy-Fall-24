package com.pluralsight.sakila.dao;

import com.pluralsight.sakila.model.Film;

import java.util.List;

public interface FilmDao {
    public void add(Film film);
    public List<Film> getAll();
}
