package com.pluralsight;
import java.io.*;
import java.util.Scanner;

public class App {

    public static void main(String args[])
    {

        //Input / Output
        try
        {
            // create a FileInputStream object pointing to
            // a specific file
            FileInputStream fis = new FileInputStream("src/main/resources/poem.txt");
            // create a Scanner to reference the file to be read
            Scanner scanner = new Scanner(fis);
            String input;

            // read until there is no more data
            while(scanner.hasNextLine()) {
                input = scanner.nextLine();
                System.out.println(input);
            }
            // close the scanner and release the resources
            scanner.close();
        }
        catch(IOException e) {
            // display stack trace if there was an error
            e.printStackTrace();
        }
    }
}
