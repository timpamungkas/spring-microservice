# Hello JHipster
Sample microservice created using [JHipster Generator](https://jhipster.github.io/creating-an-app/). Basically this is a Spring Boot applications that runs as [Eureka Client](https://github.com/spring-cloud/spring-cloud-netflix/blob/master/docs/src/main/asciidoc/spring-cloud-netflix.adoc#service-discovery-eureka-clients). 

## !!! Source Code in This Repository
This source code repository is meant only for example purpose. When creating a new project, it is recommended that you use create new JHipster application using latest JHispter release.

## Installation
To start with microservice, [create a jhipster application](https://jhipster.github.io/creating-an-app/).
In this example, I use JHipster 3.10 with following combination (my answer in **bold**) during JHipster generation:

1. (1/13) Which *type* of application would you like to create? **Microservice application**
2. (2/13) What is the base name of your application? **hello**
3. (3/13) As you are running in a microservice architecture, on which port would like your server to run? It should be u nique to avoid port conflicts. **8081**
4. (4/13) What is your default Java package name? **com.springms.hello**
5. (5/13) Which *type* of authentication would you like to use? **JWT authentication (stateless, with a token)**
6. (6/13) Which Service Discovery and Configuration solution would you like to use? **JHipster Registry (using Eureka and Spring Cloud Config)**
7. (7/13) Which *type* of database would you like to use? **No database**
8. (8/13) Would you like to use Maven or Gradle for building the backend? **Maven**
9. (9/13) Which other technologies would you like to use? **None**
10. (10/13) Would you like to enable internationalization support? **No**
11. (11/13) Which testing frameworks would you like to use? **None**

## Features
* [Hello World REST](https://github.com/timpamungkas/spring-microservice/tree/master/spring-ms-hello/src/main/java/com/springms/hello/web/rest/hello)
* [JPA repository](https://github.com/timpamungkas/spring-microservice/tree/master/spring-ms-hello/src/main/java/com/springms/hello/repository/hello)
* Dummy data injector [here](https://github.com/timpamungkas/spring-microservice/tree/master/spring-ms-hello/src/main/java/com/springms/hello/injector)

## Run The Example
1. Make sure that service registry up and running on port 8761
2. (Optional) Make sure that API gateway up and running on port 8080
3. Run this project using `mvn spring-boot:run`
4. Check on http://localhost:8081/ping/{your_name} or http://localhost:8081/list. If you turn on API gateway, change address to http://localhost:8080/hello/ping/{your_name} or http://localhost:8080/hello/list

If you need basic technical explanation about microservice using Spring Cloud, seet [my other repo](https://github.com/timpamungkas/base-microservice)
