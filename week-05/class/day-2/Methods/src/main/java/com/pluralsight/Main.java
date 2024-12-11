package com.pluralsight;


public class Main {
    public static void main(String[] args) {


        Car mustang = new Car("Ford", "Mustang");

        Car spark = new Car("Chevy", "Spark");

        Car civic = new Car("Honda", "Civic Sport");

        Car outback = new Car("Subaru");

        outback.setModel("Outback");

        Car corvette = new Car();

        corvette.setMake("Chevy");
        corvette.setModel("corvette");

        mustang.accelerate(10);

        System.out.println(civic.getSpeed());

        String ex = "Something interesting";
        Utility.loadingScreen(1);

        System.out.println(exampleMethod("Class", 1));
        Utility.loadingScreen(2);

        System.out.println(exampleMethod("Timothy", 100));

        Utility.loadingScreen(10);


        add("Name", "last name");
        add(1, 2);
        add("Stephane");
    }

    public static void add(int x, int y) {
        System.out.println(x + y);
    }

    //Overloaded method - add
    public static void add(String x, String y) {
        System.out.println(x + y);
    }

    //Overloaded method - add
    public static void add(String x) {
        System.out.println(x + "last name not found");
    }

    public static String exampleMethod(String s, int age) {
        System.out.println(age);
        return "Hello " + s;
    }


}
