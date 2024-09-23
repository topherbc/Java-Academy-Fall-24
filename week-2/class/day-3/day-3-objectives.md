What did you learn yesterday?

1. StringBuilder - mutate a string without creating a new string on updates
   1. helps save memory
   2. Allows concatenation without memory loss
   3. append("") - concat method
   4. toString()
2. String methods
   1. trim() - cuts/removes whitespace from either side of string
   2. .substring(int startIndex, int endIndex) - grab a portion of a String based on the passed in indexes
   3. .toUpperCase() - makes string characters upper cased 
   4. .toLowerCase() -  make string characters lower cased
   5. .split(delimiter - regular expression) - returns an array, each value is contained based off of it's location/proximity to the delimiter
   6. .length() - returns how many characters are in the String
   7. .indexOf("") - returns position/index of character in String
   8. .charAt() - gives index based off of character
   9.  returns bool
      1. .startsWith()
      2. .endsWith()
      3. .equals()
      4. .contains("") - check if string exists in the String
3. OOP - Object Oriented Programming
4. Objects are instantiated classes
5. classes - package data, categorization, associations, structures for section of data
   1. Encapsulation - contained data
       1. public
       2. private
   2. constructors - builds starting data for classes based off of instantiated values
      1. can set initial values without using passed in values from instantiation
   3. the 'this' keyword points to the class it is within
   4. getters
      1. retrieving data - typically the 'hidden'/private data
   5. setters
      1. updates a internal class/object value
6. Instantiation of a class - 'new' keyword, creates object based off of a class

Today's Objectives
1. Arrays
2. Loops


Agenda Today
1. Recap
2. Codewars
3. Break
4. Arrays
5. Lunch
6. While and For loops
7. Break
8. for each loop
9. recap and Q&A


What did you learn today?

1. Infinite loops == DANGER
2. Loops
   1. do while
      1. runs once, then until the condition is false, will run
   2. while
      1. until the condition is false, will run
      2. must end, or falsify condition
   3. for loop
      1. for iterating values
      2. (initializing variable value, condition to be met, updating the variable)
3. Arrays - Lists of values
   1. Index starts with 0
   2. Values separated by a comma (,)
   3. Arrays are defined with type ex. String[]
   4. int[] nums = new int[5] - define 5 empty int's
   5. Arrays.sort()
   6. Arrays.clone()
   7. for each
      1. for (Type variable_representing_array_value : array)
