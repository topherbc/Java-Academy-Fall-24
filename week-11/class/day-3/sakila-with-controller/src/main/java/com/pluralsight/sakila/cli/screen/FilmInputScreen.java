package com.pluralsight.sakila.cli.screen;

import com.pluralsight.sakila.model.Film;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class FilmInputScreen {
    private final Scanner scanner;

    public FilmInputScreen() {
        this.scanner = new Scanner(System.in);
    }

    public Film promptForFilm() {
        System.out.println("\n------------\n--Please enter film info to add--");

        System.out.print("Title: ");
        String title = scanner.nextLine();

        System.out.print("Description: ");
        String description = scanner.nextLine();

        System.out.print("Release Year: ");
        String releaseYear = scanner.nextLine();

        return new Film(0, title, description, releaseYear);
    }

    public int promptForFilmId() {
        System.out.println("\n------------\n--Please enter film info to delete--");

        System.out.print("Film ID: ");
        int filmId = scanner.nextInt();
        scanner.nextLine(); //Consume CRLF

        return filmId;
    }
}
