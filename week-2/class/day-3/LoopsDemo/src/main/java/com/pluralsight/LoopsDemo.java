package com.pluralsight;

public class LoopsDemo {

    public static void main(String[] args) {
        int count = 0;

        do {
            System.out.println(count);

            count++;
        }
        while (count < 10);


        for(int i = 6; i >= 0; i -= 2) {
//            int iteration = i+1;
            System.out.println("For loop iteration: " + i);
        }





    }
}
