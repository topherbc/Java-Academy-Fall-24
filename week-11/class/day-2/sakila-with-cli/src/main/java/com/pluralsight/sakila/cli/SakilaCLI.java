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

    @Autowired
    public SakilaCLI(FilmDao filmDao) {
        this.filmDao = filmDao;
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("--Sakila Films--\n\nView All Films (1)\nAdd a Film     (2)\nExit           (0)\n\nEnter an Option: ");
        String option = scanner.nextLine();

        switch (option) {
            case "0" -> {
                System.out.println("Thank you for visiting the Sakila Data Service");
                System.exit(0);
            }
            case "1" -> {
                System.out.println("\n------------\n");
                filmDao.getAll().stream().forEach(film -> System.out.println(film));

                try{Thread.sleep(1500);} catch(InterruptedException e) { /*ignore*/ };
                run();
            }
            case "2" -> {
                System.out.println("\n------------\n--Please add film info--");
                System.out.print("FilmID: ");
                int filmID = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Title: ");
                String title = scanner.nextLine();

                System.out.print("Description: ");
                String description = scanner.nextLine();

                System.out.print("Release Year: ");
                String releaseYear = scanner.nextLine();

                filmDao.add(new Film(filmID, title, description, releaseYear));

                try{Thread.sleep(1500);} catch(InterruptedException e) { /*ignore*/ };
                run();
            }
        }
    }
}
