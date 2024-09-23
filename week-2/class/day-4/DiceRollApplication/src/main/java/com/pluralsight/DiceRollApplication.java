package com.pluralsight;

public class DiceRollApplication {

    /*
    You will program the application will roll a pair of dice 20 times.
    Display the value of the two dice each time they are rolled.
    Count how many times the numbers 2, 4, 6 and 7 are rolled and display the result.

    To make this work, you need to create a class named Dice and add a method named roll()
    that generates a random number between 1 and 6.
    You can generate a random number within a range using the following algorithm:

    int randomNumber = minValue + (int)(Math.random() * maxValue);



    Now switch back to your main() function:

    Create an instance of Dice named dice.
    Also create integer variables for roll1, roll2,
     and four different counters for the number of times 2, 4, 6 and 7 are rolled

    Create a loop that executes 100 times.
    Within the loop, call your dice's roll() method two times:

    roll1 = dice.roll();
    roll2 = dice.roll();

    Print the value of each roll of the dice formatted like this:
    Roll 1:   4  -  6   Sum:  10

    Determine if the sum of roll1 and roll2 is 2, and if so increment the twoCounter.

    Determine if the sum of roll1 and roll2 is 4, and if so increment the fourCounter.

    Determine if the sum of roll1 and roll2 is 6, and if so increment the sixCounter.

    Determine if the sum of roll1 and roll2 is 7, and if so increment the sevenCounter.

    When the loop terminates, display your counters!

     */

    public static void main(String[] args) {
        Dice dice = new Dice();

        int roll1, roll2, sum;
        int twoCounter = 0, fourCounter = 0, sixCounter = 0, sevenCounter = 0;

        for(int i = 1; i <= 100; i++) {
            roll1 = dice.roll();
            roll2 = dice.roll();
            sum = roll1 + roll2;

            System.out.printf("Roll %d:  %d   -  %d   Sum: %d\n", i, roll1, roll2, sum);

            switch(sum) {
                case 2:
                    twoCounter++;
                    break;
                case 4:
                    fourCounter++;
                    break;
                case 6:
                    sixCounter++;
                    break;
                case 7:
                    sevenCounter++;
                    break;
            }

        }

        System.out.println("\nCounters:");
        System.out.println("Sum of 2: " + twoCounter);
        System.out.println("Sum of 4: " + fourCounter);
        System.out.println("Sum of 6: " + sixCounter);
        System.out.println("Sum of 7: " + sevenCounter);




        //For workshop today, Oct 13, 2023

//        while(true) {
//            System.out.println("Show available books: A");
//            System.out.println("Show available books: B");
//            scanner.nextLine();
//
//            System.out.println("Would this run?");

//        }



    }
}
