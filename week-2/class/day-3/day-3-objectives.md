What did you learn yesterday?

1. String methods
   1. .trim() - removes whitespace beginning and end of string
   2. .toLowerCase()
   3. .toUpperCase()
   4. .startsWith() - returns boolean based on if value starts with value
   5. .endsWith() - returns boolean if value ends with value
   6. .split(regex) - splits string on character
      1. "Home|Visitor|Guest".split("\\|");
      2. returns String[]
      3. string[1] //Visitor
   7. .equals())
   8. .equalsIgnoreCase()
   9.  String.compare() - compares two values 
   10. .contains() - 
   11. .indexOf("c") - returns position/index of any character within string
   12. .substring(startIndex, endIndex) - extract portion of a string
       1.  "example string".substring(8); //string
       2.  "example string".substring(0, 8); //example
   13. .length() - integer value counting all characters
2. INDEX STARTS AT 0
3. Pattern.quote()
4. String is a collection of characters
5. Stringbuilder
   1. .append() to concat values on stringbuilder
   2. .toString()
   3. .reverse() - reverses character sequence
6. Escape Characters
   1. \
   2. \n - new line
   3. \r - return
7. Parsing - taking values type and converting to another
   1. Integer.parseInt(String) //"100" -> 100
   2. Double.parseDouble(String)
   3. Float.parseFloat(String)


Today's Objectives

1. Classes
2. Encapsulation
3. Methods
4. Getters and Setters
5. Object intro

Agenda Today

1. Recap
2. Classes and Encapsulation lesson
3. Exercise
4. Break
5. Exercise, cont. lesson
6. Lunch
7. Getters and Setters
8. Break
9. Classes cont.
10. Recap and Q&A 


What did you learn today?

1. classes
   1. constructor method
      1. same name as class
      2. invoked on instantiation
   2. this - referring to instance object
   3. getters
   4. setters
   5. instantiating an object from class using new
   6. encapsulation
      1. private - not accessible outside of instance
      2. public - accessible outside of instance
   7. Starts with Upper Cased letter - PasCal/UpperCamelCase
2. OOP - Object Oriented Programming
3. Package private - default access specifier
   1. by default our instance variables/methods are private
4. String.endsWith()
5. Integer.ParseInt(String)