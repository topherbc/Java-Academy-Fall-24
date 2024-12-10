package com.pluralsight.sakila.cli;

import com.pluralsight.sakila.dao.FilmDao;
import com.pluralsight.sakila.model.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class SakilaCLI implements CommandLineRunner {

    private final FilmDao filmDao;
    private final Scanner scanner;

    @Autowired
    public SakilaCLI(FilmDao filmDao) {
        this.filmDao = filmDao;
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void run(String... args) {
        userScreen();
    }

    private void userScreen() {
        displayMenu();
        handleUserOption(getUserInput());
    }

    private void displayMenu() {
        System.out.println("--Sakila Films--");
        System.out.println("View All Films (1)");
        System.out.println("Add a Film     (2)");
        System.out.println("Exit           (0)");
        System.out.print("Enter an Option: ");
    }

    private String getUserInput() {
        return scanner.nextLine();
    }

    private void handleUserOption(String option) {
        switch (option) {
            case "0" -> exitScreen();
            case "1" -> displayAllFilmsAndReturn();
            case "2" -> addFilmAndReturn();
            default -> {
                System.out.println("Invalid option. Please try again.");
                userScreen();
            }
        }
    }

    private void displayAllFilmsAndReturn() {
        displayAllFilms();
        pauseBriefly();
        userScreen();
    }

    private void displayAllFilms() {
        System.out.println("\n------------\n");
        filmDao.getAll().forEach(System.out::println);
    }

    private void addFilmAndReturn() {
        Film newFilm = promptForFilm();
        addFilm(newFilm);
        pauseBriefly();
        userScreen();
    }

    private Film promptForFilm() {
        System.out.println("\n------------\n--Please add film info--");
        System.out.print("FilmID: ");
        int filmID = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        System.out.print("Title: ");
        String title = scanner.nextLine();

        System.out.print("Description: ");
        String description = scanner.nextLine();

        System.out.print("Release Year: ");
        String releaseYear = scanner.nextLine();

        return new Film(filmID, title, description, releaseYear);
    }

    private void addFilm(Film film) {
        filmDao.add(film);
    }

    private void pauseBriefly() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private void exitScreen() {
        System.out.println("Thank you for visiting the Sakila Data Service");
        System.exit(0);
    }

}
