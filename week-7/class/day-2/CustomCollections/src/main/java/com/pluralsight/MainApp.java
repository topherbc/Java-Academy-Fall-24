package com.pluralsight;

import java.time.LocalDate;

public class MainApp {
    public static void main(String[] args) {
        FixedList<Integer> numbers = new FixedList<>(3);
        numbers.add(100);
        numbers.add(33);
        numbers.add(94);
        numbers.add(42); // this line should fail
        System.out.println(numbers.getItems().size());

        FixedList<LocalDate> dates = new FixedList<>(3);
        dates.add(LocalDate.now());
        dates.add(LocalDate.now());
//        dates.add(15); // this line should fail
    }
}
