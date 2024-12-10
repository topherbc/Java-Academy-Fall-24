package com.pluralsight.sakila.cli.screen;

import org.springframework.stereotype.Component;

@Component
public class MenuScreen {
    public void displayMenu() {
        System.out.println("--Sakila Films--");
        System.out.println("View All Films (1)");
        System.out.println("Add a Film     (2)");
        System.out.println("Exit           (0)");
        System.out.print("Enter an Option: ");
    }
}
