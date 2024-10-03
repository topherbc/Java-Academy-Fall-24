package com.pluralsight;

public class Arrays {
    public static void main(String[] args) {
        String[] villains = getNames();
        String[] villainsUpdated = new String[5];

        for (int i = 0; i < villains.length; i++) {
            villainsUpdated[i] = villains[i];
        }

        villainsUpdated[villainsUpdated.length - 1] = "Stephane Jeudy";

        for (String villain: villainsUpdated) {
            System.out.println(villain);
        }
    }

    public static String[] getNames() {
        String[] names = {"Magneto", "Doctor Doom", "Normon Osborn", "Ozymandias"};
        return names;
    }
}
