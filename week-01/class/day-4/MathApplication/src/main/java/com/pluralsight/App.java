package com.pluralsight;

public class App {
    public static void main(String[] args) {

        /*
            1. Create two variables to represent the salary for Bob and Gary,
            name them bobSalary and garySalary.
            Create a new variable named highestSalary.
            Determine whose salary is greater using Math.max()
            and store the answer in highestSalary.
            Set the initial salary variables to any value you want.
            Print the answer (i.e "The highest salary is ...")
         */

        int bobSalary = 45000;
        int garySalary = 55000;
        int highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("Question 1. The highest salary is " + highestSalary);

        /*
            3. Find and display the area of a circle whose radius is 7.25
        */

        final float radius = 7.25f;
        double areaOfCircle = Math.PI * Math.pow(radius, 2);
        System.out.println("Question 3. The area of a circle with a radius of " + radius + " is " + areaOfCircle);
        System.out.println("Question 3. The rounded version is " + Math.round(areaOfCircle));

        /*
            4.Find and display the square root a variable after it is set to 5.0
       */

        float variable = 5.0f;
        double sqrtOfVariable = Math.sqrt(variable);
        System.out.println("Question 4. The square root of a variable: " + sqrtOfVariable);

        /*
            7. Find and display a random number between 0 and 1
         */

        double random = Math.random();

        System.out.println("Question 7. Random number: " + random);

    }
}
