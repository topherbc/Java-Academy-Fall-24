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
}
