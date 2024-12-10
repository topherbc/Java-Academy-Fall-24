package com.pluralsight.sakila.dao;

import com.pluralsight.sakila.model.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Component
public class FilmDaoJdbcImpl implements FilmDao {
    private List<Film> films;
    private DataSource dataSource;

    @Autowired
    public FilmDaoJdbcImpl(DataSource dataSource) {
        this.films = new ArrayList<>();
        this.dataSource = dataSource;
    }

    @Override
    public void add(Film film) {
        this.films.add(film);
    }

    @Override
    public List<Film> getAll() {
        String sql = "SELECT film_id, title, description, release_year FROM film;";
        try(Connection connection = dataSource.getConnection()){
            Statement statement = connection.createStatement();
            ResultSet rows = statement.executeQuery(sql);
            while(rows.next()){
                this.films.add(new Film(rows.getInt(1), rows.getString(2), rows.getString(3),rows.getString(4)));
            }
        }
        catch (SQLException e){
            System.out.println(e);
        }
        return this.films;
    }
}
