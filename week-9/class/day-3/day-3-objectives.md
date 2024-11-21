What did you learn yesterday?

1. USE database; -- allows every query after to reference this db
2. AS alias
   1. provide alias for value or table
3. SELECT
   1. column, column 2
   2. * -- all columns
4. FROM
   1. table
   2. other tables
5. WHERE - filtering on condition
   1. Comparison Operators
      1. < 
      2. >
      3. <=
      4. >=
      5. =
      6. != OR <>
      7. ANY()
      8. BETWEEN value AND value -- compares range within value set
         1. used for numbers and date types
      9.  LIKE
         1. uses % wildcard
         2. EX. value LIKE '%a%' -- looks for value with 'a' within it
         3. _ wildcard for single character
         4. EX. value LIKE 'a_' -- starts with a, has addtional character
   2. Logical operator
      1. AND 
      2. OR
6. GROUP BY column -- groups results based  on specified column
   1. results in collapsing of all entries collected by the specified column
7. HAVING
   1. condition on grouping/aggregate
8. ORDER BY column -- sorts
   1. ordering by more than one column, uses , to seperate
   2. ASC -- default
   3. DESC (descending)
9.  LIMIT -- limits how many rows are displayed
10. aggregate functions
   1. MIN()
   2. MAX()
   3. AVG()
   4. SUM()
   5. COUNT()
   6. DISTINCT - gets rid of duplicates, shows distinct entries
11. datetime format: yyyy-MM-dd HH:mm:ss


Today's Objectives

1. Subqueries / Nested queries
2. JOINS

Agenda Today

1. Intro and Recap
2. Subquery lesson
3. Break
4. Subquery exercise
5. Lunch
6. JOINS
7. break
8. JOINS
9. Recap and Q&A


What did you learn today?

1. Functions
   1. TRUNCATE()
   2. CONCAT() - string manipulation
   3. ROUND() - rounds
   4. FLOOR() - rounds down
   5. CEIL() - round up
2. JOINs - combing table data
   1. INNER JOINS - Matches tables on data
      1. JOIN
   2. OUTER JOINS - Matches table data and includes nulls
      1. LEFT JOIN
      2. RIGHT JOIN
      3. FULL OUTER JOIN
3. ON - how to connect table to another, uses the key relationship
4. Primary Key - Unique identifier for a row of data on the primary table
5. Foreign Key - Primary key that belongs to a different table
6. subqueries / nested queries - query inside another query
7. RANK()
8. operator - IN - looks for values in list 
