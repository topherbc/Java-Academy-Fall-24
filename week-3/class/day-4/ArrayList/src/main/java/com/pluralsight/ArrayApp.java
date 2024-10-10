package com.pluralsight;
import java.util.*;

public class ArrayApp {
    public static void main(String[] args) {

//        String[] sesameStreetCharacters = {"Big Bird", "Elmo", "Cookie Monster", "Oscar"};
//
//        System.out.println(sesameStreetCharacters[2]);

        ArrayList<String> sesameStreetCharacters = new ArrayList<String>();

        sesameStreetCharacters.add("Big Bird");
        sesameStreetCharacters.add("Elmo");
        sesameStreetCharacters.add("Cookie Monster");
        sesameStreetCharacters.add("Oscar");
        sesameStreetCharacters.add("Mr. Snuffleupagus");
        sesameStreetCharacters.add("The count");
        sesameStreetCharacters.add("Ernie");
        sesameStreetCharacters.add("Bert");


        sesameStreetCharacters.set(3, "Oscar the Grouch");

        sesameStreetCharacters.remove(5);

        Collections.sort(sesameStreetCharacters);

        System.out.println(sesameStreetCharacters);
    }
}
