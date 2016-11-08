# Hello JHipster - Server Only
Sample microservice created using [JHipster Generator](https://jhipster.github.io/creating-an-app/). Basically this is a Spring Boot applications that runs as [Eureka Client](https://github.com/spring-cloud/spring-cloud-netflix/blob/master/docs/src/main/asciidoc/spring-cloud-netflix.adoc#service-discovery-eureka-clients). 
This example is for server app only.

## !!! Source Code in This Repository
This source code repository is meant only for example purpose. When creating a new project, it is recommended that you use create new JHipster application using latest JHispter release.

## Installation
To start with microservice, [create a jhipster application](https://jhipster.github.io/creating-an-app/).
This example will generate only server side app, generated using `yo jhipster:server`
In this example, I use JHipster 3.10 with following combination (my answer in **bold**) during JHipster generation:

1. (1/10) What is the base name of your application? **hello_server**
2. (2/10) What is your default Java package name? **com.springms.hello_server**
3. (3/10) Which *type* of authentication would you like to use? **JWT authentication (stateless, with a token)**
4. (4/10) Which *type* of database would you like to use? **SQL (H2, MySQL, MariaDB, PostgreSQL, Oracle)**
5. (5/10) Which *production* database would you like to use? **MySQL**
6. (6/10) Which *development* database would you like to use? **H2 with disk-based persistence**
7. (7/10) Do you want to use Hibernate 2nd level cache? **No**
8. (8/10) Would you like to use Maven or Gradle for building the backend? **Maven**
9. (9/10) Which other technologies would you like to use? **None**
10. (10/10) Would you like to enable internationalization support? **No**

## Run The Example
1. Make sure that service registry up and running on port 8761
2. (Optional) Make sure that API gateway up and running on port 8080
3. Run this project using `mvn spring-boot:run`
4. Check on http://localhost:8082/ping/{your_name} or http://localhost:8081/list. If you turn on API gateway, change address to http://localhost:8080/hello_server/ping/{your_name} or http://localhost:8080/hello_server/list

If you need basic technical explanation about microservice using Spring Cloud, seet [my other repo](https://github.com/timpamungkas/base-microservice)

