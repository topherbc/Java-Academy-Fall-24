package com.pluralsight;

public class MethodsApp {
    public static void main(String[] args) {

        String s1 = "ABC";

        String s2 = "abc";

        String s3 = "A" + "b" + "c";


        String name = "            Bruce Wayne       ";


//        System.out.println(name.trim()); //Bruce Wayne - removes whitespace

//        System.out.println(name.toUpperCase()); //BRUCE WAYNE
//        System.out.println(name.toLowerCase()); //bruce wayne

        String discountCode = "FAIR-15OFF";

//        System.out.println(discountCode.startsWith("FAIR")); //true
//        System.out.println(discountCode.endsWith("15OFF")); //true

//        System.out.println(discountCode.indexOf("F")); //returns placement value
        int indexVal = discountCode.indexOf("-"); //4
//        System.out.println(discountCode.substring(0, indexVal)); //FAIR, returns portion of string based on index values
//        System.out.println(discountCode.substring(indexVal + 1));

        String input = "Dallas|Ft. Worth|Austin|Mesquite|Irving";

//        String[] cities = input.split("\\|"); //Splits on |
//        String[] cities = input.split(Pattern.quote("|")); //Splits on |

//        System.out.println(cities[4]); //Irving

    }

}
