package com.pluralsight;


public class Main {
    public static void main(String[] args) {


        Car mustang = new Car("Ford", "Mustang");

        Car spark = new Car("Chevy", "Spark");

        Car civic = new Car("Honda", "Civic Sport");

        mustang.accelerate(10);

        System.out.println(civic.getSpeed());

        String ex = "Something interesting";
        Utility.loadingScreen(1);

        System.out.println(exampleMethod("Class", 1));
        Utility.loadingScreen(2);

        System.out.println(exampleMethod("Timothy", 100));

        Utility.loadingScreen(10);
    }

    public static String exampleMethod(String s, int age) {
        System.out.println(age);
        return "Hello " + s;
    }
}
