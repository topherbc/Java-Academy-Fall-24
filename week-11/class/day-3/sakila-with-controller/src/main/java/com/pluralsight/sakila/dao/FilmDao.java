package com.pluralsight.sakila.dao;

import com.pluralsight.sakila.model.Film;

import java.util.List;

public interface FilmDao {
    public void add(Film film);
    public void deleteById(int filmId);
    public List<Film> getAll();
}
