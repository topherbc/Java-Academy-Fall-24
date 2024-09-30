package com.pluralsight;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*

            Calculator 1: A mortgage calculator -
            it is used to calculate out how much a monthly payment
            for a loan would be (minus any insurance or taxes),
             as well as how much interest you would pay over the
              life of the loan.


            It would accept the principal, interest rate, and loan length from the user
            It would display the expected monthly payment and total interest paid
            Example: A $53,000 loan at 7.625% interest
            for 15 years would have a $495.09/mo payment
            with a total interest of $36,115.99

         */

        System.out.print("Please enter your principal: ");
        double principal = scanner.nextDouble();

        System.out.print("Please enter your interest rate: ");
        double interestRate = scanner.nextDouble();

        System.out.print("Please enter your current loan length (in months): ");
        int monthlyLoanLength = scanner.nextInt();

        /*
            i = interestRate / 100 / 12

            Monthly Payment = (principal * i * (1 + i)^monthlyLoanLength) / ((1+i)^monthlyLoanLength - 1)

            where n = is the term in number of months,
            PMT = monthly payment,
            i = monthly interest rate as a decimal
            (interest rate per year divided by 100 divided by 12),
            and PV = mortgage amount (present value).
         */

        interestRate /= 100;
        interestRate /= 12;


        double monthlyPayment = (principal * interestRate * Math.pow((1 + interestRate),monthlyLoanLength)) / (Math.pow((1+interestRate),monthlyLoanLength) - 1);

        System.out.printf("Total Monthly Payment: $%.2f \n", monthlyPayment);
        System.out.printf("Total Interest Paid: $%.2f \n", monthlyPayment * monthlyLoanLength - principal);



    }
}
