package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> myFamily = new ArrayList<>();
        myFamily.add(new Person("Dana", "Wyatt", 63));
        myFamily.add(new Person("Zachary", "Wyatt", 31));
        myFamily.add(new Person("Elisha", "Wyatt", 14));
        myFamily.add(new Person("Ian", "Auston", 16));
        myFamily.add(new Person("Zephaniah", "Hughes", 9));
        myFamily.add(new Person("Ezra", "Aiden", 17));

        // Sort the list
        Collections.sort(myFamily);

        // Display sorted list
        for (Person p : myFamily) {
            System.out.println(p);
        }
    }
}
