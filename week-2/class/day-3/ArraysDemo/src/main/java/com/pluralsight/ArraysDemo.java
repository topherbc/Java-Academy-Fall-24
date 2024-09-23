package com.pluralsight;
import java.util.Arrays;
import java.util.Collections;

public class ArraysDemo {
    public static void main(String[] args) {

        int[] numericalList = {10, 9, 8, 7, 6, 3, 1};

//        System.out.println(numericalList[numericalList.length - 1]);

        for(int i = 0; i < numericalList.length; i++) {
            System.out.println("index number: " + i + " has value of: " + numericalList[i]);
        }

        int[] numbers = new int[5]; //{0, 0, 0, 0, 0}

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
            System.out.println(numbers[i] + " ");
        }


        String[] studentNames = {"Abigiel", "Aleks", "Christian", "Sing", "Clancy", "Ivan", "Khream", "Rickey", "Steven"};

        Arrays.sort(studentNames);
        //Arrays.sort(studentNames, Collections.reverseOrder());

        for (String student : studentNames) {
            System.out.println(student);
        }

        String[] copiedStudentNames = studentNames;

        for (String student : copiedStudentNames) {
            System.out.println("copy: " + student);
        }






    }
}
