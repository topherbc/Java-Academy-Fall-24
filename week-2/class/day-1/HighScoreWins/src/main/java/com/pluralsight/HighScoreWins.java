package com.pluralsight;
import java.util.Scanner;

public class HighScoreWins {

    public static void main(String[] args) {

        /*
        Create a new Java application called HighScoreWins
        that prompts the user to enter team and score information of an event.
        The input will be a single string that contains both team names and
        the final score of the match.

        Step 1
            Prompt the user for a game score.
            The user will input a score in the following format:
            Home:Visitor|21:9
            Based on the user input, you should determine which team had the higher score and display the name of the winning team.
            Hint: You will have to split the text multiple times to get all of the information
            - once on the pipe  ( | )
            - once on the colon ( : )
            A sample trace of your program output is shown below.  Bolded code is what the user entered.

            Please enter a game score: Home:Visitor|21:9↵
            Winner: Home
            A different trace would be:

            Please enter a score: Slytherin:Gryffindor|23:59↵
            Winner: Gryffindor
         */

        Scanner myScanner = new Scanner(System.in);

        System.out.print("Please enter a game score: ");
        String input = myScanner.nextLine();

        String[] inputSplit = input.split("\\:");

        String team1 = inputSplit[0];
        int team2Score = Integer.parseInt(inputSplit[2]);

       String[] barInputSplit = inputSplit[1].split("\\|");

       String team2 = barInputSplit[0];
       int team1Score = Integer.parseInt(barInputSplit[1]);

        System.out.print("Winner: ");
       if (team1Score > team2Score) {
           System.out.print(team1);
       } else {
           System.out.print(team2);
       }



    }
}
