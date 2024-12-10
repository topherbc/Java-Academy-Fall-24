package com.pluralsight.sakila;

import java.util.List;

public interface FilmDao {
    public void add(Film film);
    public List<Film> getAll();
}
