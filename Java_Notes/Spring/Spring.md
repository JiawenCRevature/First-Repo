# Spring

## what is Spring?
Spring is an incredibly popular Java Framework that streamlines the development proess and allows you as a developer to focus on solutions and features while not worrying about things like implementation or writing boilerplate code. As a framework, spring has a lot to offer:
-Inversion of Control (IoC)
    - Spring takes the idea of a framework (code is provided, you just need to supply the data) and takes it to a whole new level. With Spring, you can set up your web service and database connection, and upon doing so, have the majority of your application ready to go: you may need to provide novel code implementation here and there, but Spring will handle the majority of the setup for your application for you.
- Opinionated Framework
    -Spring Boot, the implementation of Spring we will be working with, is known as an "opinionated" framework:
    it takess the little amount of input Spring normally requires from the developer and "makes decisions" for us.
- Dependency Injection
    -Spring handels providing the correct dependencies to your objects, further allowing you to focus soley on the features you need to implement
- Spring has a huge support famework
    -there are a platform of resources available on the web you can utilize if you want to learn more about Spring or if you need help solving a problem. [Baeldung](https://www.baeldung.com/) is a resource , along with the main [Spring](https://spring.io/) website

## Spring boot
If Spring is a framework that handles the majority of boilerplate code for you, Spring Boot is the framework implemenation that goes even further. As an opinionated framework, Spring Boot upon initialization handles most configurations for you. We will be using Spring Boot to configure three modules for us: Spring Web, Srping Data, and Spring Acuator.
- Spring Web
    - This is the module that will handle setting up our web server for your application. It also handles mapping our routes to our controller methods, and it even handles crafting the http reponse body from our java objects
- Spring Data
    -This is the module that will handle creating a connection to our Postgres database and it will handle sending queries and getting their result sets back.
-Spring Actuator
    - This module handles exposing endpoints for our web application that will contain useful metrics for our application. There are performance metrics exposed, but we will focus on the metrics that allow us to observe the status of the application.