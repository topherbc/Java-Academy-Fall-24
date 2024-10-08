package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        try{
            FileReader fileReader = new FileReader("src/main/resources/employees.csv");
            // create a BufferedReader to manage input stream
            BufferedReader bufReader = new BufferedReader(fileReader);
            String input;
            Employee[] employees = new Employee[8];
            int count = 0;

            // read until there is no more data
            while((input = bufReader.readLine()) != null) {
                if(input.startsWith("id")) {
                    continue;
                }

                String[] lineSplit = input.split(Pattern.quote("|"));
                employees[count++] = new Employee(Integer.parseInt(lineSplit[0]), lineSplit[1], Double.parseDouble(lineSplit[2]), Double.parseDouble(lineSplit[3]));
            }



            for(Employee em : employees) {
//                System.out.println(em); // Calls toString() on employee
                System.out.printf("""
                        EmployeeID: %d
                        Employee Name: %s
                        Gross Pay: $%.2f
                        %n
                        """, em.getEmployeeId(), em.getName(), em.getGrossPay());
            }

            // close the stream and release the resources
            bufReader.close();
        } catch(IOException e) {
            e.printStackTrace();
        }

    }
}
