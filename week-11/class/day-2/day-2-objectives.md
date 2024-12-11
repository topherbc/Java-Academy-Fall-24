1. Dependency Injection
   1. Spring passes objects where needed, rather than instatiation 
2. Inversion of Control
   1. Pass control flow to a framework (spring)
3. Spring v Springboot
   1. Framework build to handle DI with IoC
   2. Springboot is opinionated spring, preconfigured


Today's Objectives

1. Cont. Springboot
2. Beans Injection
3. Configuration
4. Custom Properties

Agenda Today

1. Recap and Intro
2. Let's build a sakila data service with Springboot
3. You do exercise
4. Break
5. Beans Injection
6. You do beans injection exercise
7. Lunch
8. Springboot configuration lesson
9. Practice configuration
10. Break
11. Self learn custom properties
12. exercise
13. Recap and Q&A
    

What did you learn today?

1. Spring beans - Special tools, that could be used as needed
   1. beans
      1. @Component
      2. @Qualifier
      3. @Bean
      4. @Configuration
   2. injecting beans
      1. @Autowired - where you inject the bean
      2. @Value
2. application.properties - key/value pairs for config info
3. ApplicationContext - IoC container
4. CommandLineRunner
   1. .run implementation
5. Singleton pattern
6. mock data is fake data