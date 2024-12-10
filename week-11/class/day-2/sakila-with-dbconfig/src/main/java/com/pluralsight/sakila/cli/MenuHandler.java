package com.pluralsight.sakila.cli;

import com.pluralsight.sakila.cli.screen.FilmInputScreen;
import com.pluralsight.sakila.cli.screen.FilmListScreen;
import com.pluralsight.sakila.cli.screen.MenuScreen;
import com.pluralsight.sakila.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MenuHandler {

    private final MenuScreen menuScreen;
    private final FilmListScreen filmListScreen;
    private final FilmInputScreen filmInputScreen;
    private final FilmService filmService;
    private final ConsoleUtils consoleUtils;

    @Autowired
    public MenuHandler(MenuScreen menuScreen,
                       FilmListScreen filmListScreen,
                       FilmInputScreen filmInputScreen,
                       FilmService filmService,
                       ConsoleUtils consoleUtils) {
        this.menuScreen = menuScreen;
        this.filmListScreen = filmListScreen;
        this.filmInputScreen = filmInputScreen;
        this.filmService = filmService;
        this.consoleUtils = consoleUtils;
    }

    public void showMainMenu() {
        menuScreen.displayMenu();
        String option = consoleUtils.getUserInput();
        handleUserOption(option);
    }

    private void handleUserOption(String option) {
        switch (option) {
            case "0" -> exitScreen();
            case "1" -> showAllFilms();
            case "2" -> addNewFilm();
            default -> {
                System.out.println("Invalid option. Please try again.");
                showMainMenu();
            }
        }
    }

    private void showAllFilms() {
        filmListScreen.displayAllFilms(filmService.getAllFilms());
        consoleUtils.pauseBriefly();
        showMainMenu();
    }

    private void addNewFilm() {
        filmService.addFilm(filmInputScreen.promptForFilm());
        consoleUtils.pauseBriefly();
        showMainMenu();
    }

    private void exitScreen() {
        System.out.println("Thank you for visiting the Sakila Data Service");
        System.exit(0);
    }
}
