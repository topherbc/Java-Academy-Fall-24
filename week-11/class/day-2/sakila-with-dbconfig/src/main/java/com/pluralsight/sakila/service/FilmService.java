package com.pluralsight.sakila.service;

import com.pluralsight.sakila.dao.FilmDao;
import com.pluralsight.sakila.model.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmService {

    private final FilmDao filmDao;

    @Autowired
    public FilmService(FilmDao filmDao) {
        this.filmDao = filmDao;
    }

    public void addFilm(Film film) {
        filmDao.add(film);
    }

    public void deleteFilmById(int filmId) {
        filmDao.deleteById(filmId);
    }

    public List<Film> getAllFilms() {
        return filmDao.getAll();
    }
}
