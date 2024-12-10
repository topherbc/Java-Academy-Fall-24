package com.pluralsight.sakila;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class SakilaApplication {

	private static FilmDao filmDao;

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SakilaApplication.class, args);
		filmDao = context.getBean(SimpleFilmDao.class);
		runScreen();
	}

	public static void runScreen() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter 1 to view all films, 2 to add a film: ");
		String option = scanner.nextLine();
		switch (option) {
			case "1" -> filmDao.getAll().stream().forEach(film -> System.out.println(film));

			case "2" -> { //ask user later
				}
		}
	}

}
