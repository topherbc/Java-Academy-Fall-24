package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        actionsLogger("launch");

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Enter a search term (X to exit): ");
            String input = scanner.nextLine().trim();

            if(input.equalsIgnoreCase("X")) {
                actionsLogger("exit");
                System.exit(0);
            } else {
                actionsLogger("search - " + input);
            }
        }
    }

    public static void actionsLogger(String action) {

        try {
            FileWriter fw = new FileWriter("action-logger.txt", true);
            BufferedWriter logger = new BufferedWriter(fw);
            LocalDateTime today = LocalDateTime.now();
            DateTimeFormatter fmt =
                    DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

            String formattedDate = today.format(fmt);
            logger.write(formattedDate + " " + action);
            logger.newLine();

            logger.close();
        } catch(IOException e) {
            e.printStackTrace();
        }


    }
}
