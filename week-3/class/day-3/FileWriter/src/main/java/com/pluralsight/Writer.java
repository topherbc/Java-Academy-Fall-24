package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) {
        try {
            // create a FileWriter
            FileWriter fileWriter = new FileWriter("src/main/resources/text.txt", true);
            // create a BufferedWriter
            BufferedWriter bufWriter = new BufferedWriter(fileWriter);
            // write to the file
            String text;
            for(int i = 22; i <= 30; i++) {
                text = String.format("Counting %d\n", i);
                bufWriter.write(text);
            }
            // close the writer
            bufWriter.close();
        }
        catch (IOException e) {
            System.out.println("ERROR:  An unexpected error occurred");
            e.getStackTrace();
        }
    }
}
