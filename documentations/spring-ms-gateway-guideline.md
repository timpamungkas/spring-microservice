# API Gateway
API Gateway using [JHipster API Gateway](https://jhipster.github.io/microservices-architecture/#gateway), which is based on [Spring Cloud Zuul](https://github.com/spring-cloud/spring-cloud-netflix/blob/master/docs/src/main/asciidoc/spring-cloud-netflix.adoc#router-and-filter-zuul). 

## !!! Source Code in This Repository
JHipster gateway in this source code repository is meant only for example purpose. When creating a new project, it is recommended that you use create new JHipster gateway using latest JHispter release.

## Installation
To start with API Gateway, [create a jhipster application](https://jhipster.github.io/creating-an-app/).
In this example, I use JHipster 3.10 with following combination (my answer in **bold**) during JHipster generation:

1. (1/13) Which *type* of application would you like to create? **Microservice gateway**
2. (2/13) What is the base name of your application? **gateway**
3. (3/13) As you are running in a microservice architecture, on which port would like your server to run? It should be unique to avoid port conflicts. **8080**
4. (4/13) What is your default Java package name? **com.springms.gateway**
5. (5/13) Which *type* of authentication would you like to use? **JWT authentication (stateless, with a token)**
6. (6/13) Which Service Discovery and Configuration solution would you like to use? **JHipster Registry (using Eureka and Spring Cloud Config)**
7. (7/13) Which *type* of database would you like to use? **SQL (H2, MySQL, MariaDB, PostgreSQL, Oracle)**
8. (8/13) Which *production* database would you like to use? **MySQL**
9. (9/13) Which *development* database would you like to use?**H2 with disk-based persistence**
10. (10/13) Do you want to use Hibernate 2nd level cache? **No**
11. (11/13) Would you like to use Maven or Gradle for building the backend? **Maven**
12. (12/13) Which other technologies would you like to use? **None**
13. (13/13) Would you like to use the LibSass stylesheet preprocessor for your CSS? **No**
14. (14/13) Would you like to enable internationalization support? **No**
15. (15/13) Which testing frameworks would you like to use? **None**
