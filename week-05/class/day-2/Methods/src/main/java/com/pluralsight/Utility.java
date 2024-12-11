package com.pluralsight;

public class Utility {
    public static void loadingScreen(int countDownStart){
        for (int i = countDownStart; i >= 0; i--) {
            System.out.println("Loading at value " + i);
            try{
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                //ignore error
            }
        }
    }
}
