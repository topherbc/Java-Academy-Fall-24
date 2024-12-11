package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a game score");
        System.out.print("in the following format (Team1:Team2|Team1Score:Team2Score) \n: ");
        String score = keyboard.nextLine();
        //Home:Visitor|21:9

        String[] colonSplit = score.split(Pattern.quote(":"));

        String homeTeam = colonSplit[0];
        int visitorScore = Integer.parseInt(colonSplit[2]);

        String[] barSplit = colonSplit[1].split("\\|");

        String visitorTeam = barSplit[0];
        int homeScore = Integer.parseInt(barSplit[1]);

        if(homeScore > visitorScore) {
            System.out.printf("Winner: %s", homeTeam);
        } else if(homeScore < visitorScore) {
            System.out.printf("Winner: %s", visitorTeam);
        } else {
            System.out.println("Draw!");
        }
    }
}
