package com.pluralsight;

public class StringBuilderDemo {

    public static void main(String[] args) {

        StringBuilder skills = new StringBuilder();

        skills.append("Git \n");
        skills.append("Java \n");
        skills.append("SQL \n");
        skills.append("BASH\n");
        skills.append("Intellij\n");
        skills.append("Repos\n");

        String appendedSkills = skills.toString();
        System.out.println(appendedSkills);


    }


}
