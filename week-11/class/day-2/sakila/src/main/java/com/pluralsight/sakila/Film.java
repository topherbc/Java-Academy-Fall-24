package com.pluralsight.sakila;

public class Film {
    private int filmId;
    private String title, description, releaseYear;

    public Film(int filmId, String title, String description, String releaseYear) {
        this.filmId = filmId;
        this.title = title;
        this.description = description;
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "FilmID: " + this.filmId + "\nTitle: " + this.title + "\nDescription: " + this.description + "\nRelease Year: " + this.releaseYear + "\n\n------------\n";
    }

    public int getFilmId() {
        return filmId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getReleaseYear() {
        return releaseYear;
    }
}
