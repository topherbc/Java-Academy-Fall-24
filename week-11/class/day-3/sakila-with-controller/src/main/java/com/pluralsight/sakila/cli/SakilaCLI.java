package com.pluralsight.sakila.cli;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SakilaCLI implements CommandLineRunner {

    private final MenuHandler menuHandler;

    @Autowired
    public SakilaCLI(MenuHandler menuHandler) {
        this.menuHandler = menuHandler;
    }

    @Override
    public void run(String... args) {
//        menuHandler.showMainMenu();
    }
}
