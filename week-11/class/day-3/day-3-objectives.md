What did you learn yesterday?

1. Spring Framework
2. Springboot
3. Spring beans
   1. @Bean - method/field/property
   2. @Component - class level/object
   3. @Configuration
4. DI - dependency injection
   1. @Autowired
   2. @Value
5. CommandLineRunner interface
   1. .run() Override method to handle the cli response
6. mock data - fake data / placeholder data
7. IoC - inversion of control
8. properties set in application.properties in resources directory
   1. object.key=value - uses dot notation to set key


Today's Objectives

1. DNS
2. Request/Response
3. REST api's
4. Postman
5. Web servers
6. MVC pattern
7. GET requests

Today's Agenda

1. Recap and Intro
2. DNS/RR/Rest Lesson
3. Break
4. We build REST controller
5. You build a REST controller
6. Lunch
7. Postman
8. MVC lesson
9. Break
10. You build API
11. Recap and Q&A

What did  you learn today?

1. postman - tests all request methods, super browser
   1. Raw is real response
   2. Preview interprets 
   3. pretty - 
2. MVC - model view control design pattern
3. Controller classes
4. URL
   1. path
   2. Request parameters - set after ? param=value
      1. EX. youtube.com/watch?v=something - v=something is the query param
5. REST api - representational state transfer application programming interface
6. HTTP Method
   1. GET: retrieving / read R
   2. POST: creates/inserts / create C
   3. PUT: updates / update U
   4. DELETE: deletes / delete D
7. JSON - Javascript Object Notation - format
   1. Similar to List / Hashmap
   2. [{ "key": "value" }]
8. Path Variables 
   1. localhost:8080/categories/2 - 2 is a id, dynamic variable we can change
9.  @RequestMapping
10. @RequestBody - expects raw json
11. UDP and TCP