package com.pluralsight;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //DOGS
        //Scottish Terrier - Chief - 7 years old - Black hair
        //Dachshund - Bandit - 12 years - Black fur
        //Perro Aguacatero - Aldo - 4 years - White
        //Bully - Roxy - 2 years - Grayish
        //French Bulldog - Bash - 3 years - Dark brown
        //German Shephard - Hannah - 1 year - Brown

//        Scanner whatever = new Scanner(System.in);

        Dog chiefObject = new Dog("Scottish Terrier", "Chief", 7, "Black");
        Dog bashDog = new Dog("French Bulldog", "Bash", 3, "Dark Brown");

        System.out.println(chiefObject.getAge());
//        System.out.println(bashDog.getName());





    }
}
