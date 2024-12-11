package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        HashMap<String, String> statesAndCapitals = new HashMap<String, String>();

        statesAndCapitals.put("NY", "Albany");
        statesAndCapitals.put("TX", "Albany");
        statesAndCapitals.put("NC", "Albany");
        statesAndCapitals.put("TN", "Albany");

//        statesAndCapitals.remove("TN");

        statesAndCapitals.putIfAbsent("TN", "Memphis");

        //If only wanted values
        for (String v : statesAndCapitals.values()) {
//            System.out.println(v);
        }

        //If wanted key and values
        for (String k : statesAndCapitals.keySet()) {
            System.out.println("State: " + k + " and Capital: " + statesAndCapitals.get(k));
        }

//
//        ArrayList<String> states = new ArrayList<>();
//        ArrayList<String> capitals = new ArrayList<>();
//
//        states.add("NY");
//        capitals.add("Albany");
//
//        states.add("TX");
//        capitals.add("Austin");
//
//        states.add("NC");
//        capitals.add("Raleigh");
//
//        states.add("WA");
//        capitals.add("Olympia");
//
////        Collections.sort(states);
////        Collections.sort(capitals);
//
//        for(int i = 0; i < states.size(); i++) {
////            System.out.printf("State: %s, Capital: %s \n", states.get(i), capitals.get(i));
//        }

    }
}
