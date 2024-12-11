package com.pluralsight;

public class UNO extends Card implements PlayableInterface {

    public UNO(String description, String type) {
        super(description, type);
    }

    @Override
    public void play() {
        System.out.println("Played first card!");
    }

    @Override
    public double getValue() {
        return 0;
    }
}
