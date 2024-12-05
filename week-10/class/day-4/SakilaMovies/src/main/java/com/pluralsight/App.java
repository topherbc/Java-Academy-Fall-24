package com.pluralsight;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println(
                    "Application needs two arguments to run: " +
                            "java com.hca.jdbc.UsingDriverManager <username> " +
                            "<password>");
            System.exit(1);
        }

        // Get the username and password
        String username = args[0];
        String password = args[1];

        SakilaDataManager dataManager = new SakilaDataManager(username, password);


        userScreen(dataManager);

    }

    public static void userScreen(SakilaDataManager dataManager) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("00 to cancel or Please enter actors first name or last name to search: ");
            String name = scanner.nextLine();
            if (name.equals("00")) break;

            List<Actor> matchedActors = dataManager.getActorByName(name.trim());
            matchedActors.stream().forEach(actor -> {System.out.println(actor);});

            System.out.print("00 to cancel or Meow, search for films by actor_id: ");
            String actorId = scanner.nextLine().trim();
            if (actorId.equals("00")) break;

            List<Film> matchedFilms = dataManager.getFilmsByActorID(actorId);
            matchedFilms.stream().forEach(film -> {System.out.println(film);});
        }
        scanner.close();
    }
}
