package com.pluralsight.sakila.dao;

import com.pluralsight.sakila.model.Film;
import com.pluralsight.sakila.util.Loggable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class FilmDaoJdbcImpl extends Loggable implements FilmDao  {
    private List<Film> films;
    private DataSource dataSource;

    @Autowired
    public FilmDaoJdbcImpl(DataSource dataSource) {
        this.films = new ArrayList<>();
        this.dataSource = dataSource;
    }

    @Override
    public void add(Film film) {
        String sql = "INSERT INTO film (title, description, release_year, language_id) VALUES (?, ?, ?, 1)";
        try(Connection connection = dataSource.getConnection()){
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, film.getTitle());
            statement.setString(2, film.getDescription());
            statement.setString(3, film.getReleaseYear());

            statement.executeUpdate();
        }
        catch (SQLException e) {
            logger.error("Error inserting film: {}", film, e);
        }
    }

    @Override
    public void deleteById(int filmId) {
        String sql = "DELETE FROM film WHERE film_id=?";
        try(Connection connection = dataSource.getConnection()){
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setInt(1, filmId);

            statement.executeUpdate();
        }
        catch (SQLException e) {
            logger.error("Error deleting film by id: ", filmId, e);
        }
    }

    @Override
    public List<Film> getAll() {
        this.films.clear();
        String sql = "SELECT film_id, title, description, release_year FROM film;";
        try(Connection connection = dataSource.getConnection()){
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rows = statement.executeQuery();
            while(rows.next()){
                this.films.add(new Film(rows.getInt(1), rows.getString(2), rows.getString(3),rows.getString(4)));
            }
        }
        catch (SQLException e){
            logger.error("Error getting all films: ", e);
        }
        return this.films;
    }
}
