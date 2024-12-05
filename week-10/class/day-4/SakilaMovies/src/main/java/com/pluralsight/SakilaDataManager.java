package com.pluralsight;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SakilaDataManager {

    private BasicDataSource dataSource;

    public SakilaDataManager(String username, String password) {
        this.dataSource = new BasicDataSource();
        this.dataSource.setUrl("jdbc:mysql://localhost:3306/sakila");
        this.dataSource.setUsername(username);
        this.dataSource.setPassword(password);
    }

    public List<Actor> getActorByName(String name) {
        List<Actor> actors = new ArrayList<>();
        String query = "SELECT actor_id, first_name, last_name FROM actor WHERE first_name LIKE ? OR last_name LIKE ?";
        try(
                Connection connection = this.dataSource.getConnection();
                PreparedStatement statement = connection.prepareStatement(query);
        ) {

            statement.setString(1, "%" + name + "%");
            statement.setString(2, "%" + name + "%");

//            System.out.println(statement);

            try(ResultSet results = statement.executeQuery()) {
                while(results.next()) {
                    String actorId = results.getString("actor_id");
                    String firstName = results.getString("first_name");
                    String lastName = results.getString("last_name");
                    actors.add(new Actor(actorId, firstName, lastName));
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch(SQLException e) {
            e.printStackTrace();
        }

        return actors;
    }


    public List<Film> getFilmsByActorID(String actorId) {
        List<Film> films = new ArrayList<>();
        String query = """  
                    SELECT
                    	f.*, fa.actor_id
                    FROM
                    	film f
                    	JOIN film_actor fa ON (f.film_id = fa.film_id)
                    WHERE fa.actor_id = ?;
                    """;
        try(
                Connection connection = this.dataSource.getConnection();
                PreparedStatement statement = connection.prepareStatement(query);
        ) {

            statement.setString(1, actorId);

//            System.out.println(statement);

            try(ResultSet results = statement.executeQuery()) {
                while(results.next()) {
                    String filmId = results.getString("film_id");
                    String title = results.getString("title");
                    String description = results.getString("description");
                    String releaseYear = results.getString("release_year");
                    String length = results.getString("length");
                    films.add(new Film(filmId, title, description, releaseYear, length));
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch(SQLException e) {
            e.printStackTrace();
        }

        return films;



    }


}
