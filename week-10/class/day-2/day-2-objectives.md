What did you learn yesterday?

1. dependencies - external libraries of required functionality
   1. When setting in the pom.xml
      1. Needs to be within <project>
      2. Then <dependencies><dependency></dependency></dependencies>
2. pom.xml - adding dependencies to this pom
3. arguments
4. setting up n app configuration
5. JDBC - java database connectivity
6. Drivers
7. Statements - handles query execution
8. PreparedStatements - more secure
   1. Use ? placeholder to be replaced later
   2. "SELECT * FROM table WHERE id = ?" setString(1, "value"): 1 is column index, or question mark placement
9.  ResultSet
    1.  Loop over results, use results.next()
10. Home ip address, 127.0.0.1 or localhost
11. mysql port = 3306


Todays Objectives

1. Handling exceptions w/ JDBC
2. finally
3. try-with-resources
4. DataSources


Agenda Today

1. Intro and Recap
2. Finish the exercise from yesterday / Codewars
3. Handling exceptions / Finally demo
4. Break
5. Finally exercise
6. try-with-resources demo
7. exercise
8. Codewars
9. Lunch
10. DataSources
11. Exercises
12. Break
13. Exercise or Codewars
14. Recap and Q&A