package com.pluralsight.sakila.cli;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ConsoleUtils {

    private final Scanner scanner;

    public ConsoleUtils() {
        this.scanner = new Scanner(System.in);
    }

    public String getUserInput() {
        return scanner.nextLine();
    }

    public void pauseBriefly() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
