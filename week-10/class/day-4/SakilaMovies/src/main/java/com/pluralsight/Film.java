package com.pluralsight;

public class Film {
    private String filmId, title, description, releaseYear, length;

    public Film(String filmId, String title, String description, String releaseYear, String length) {
        this.filmId = filmId;
        this.title = title;
        this.description = description;
        this.releaseYear = releaseYear;
        this.length = length;
    }

    @Override
    public String toString() {
        return "FilmID: " + this.filmId + "\nTitle: " + this.title + "\nDescription: " + this.description + "\nRelease Year: " + this.releaseYear + "\n\n------------\n";
    }

    public String getFilmId() {
        return filmId;
    }

    public void setFilmId(String filmId) {
        this.filmId = filmId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }
}
