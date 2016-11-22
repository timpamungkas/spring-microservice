# Spring Microservice Guideline

## Purpose
Provides a guideline for building basic microservice architecture.

## Prerequisites
### Man Power 
* Understand microservice concept. 
Read [here](https://www.nginx.com/blog/introduction-to-microservices) or [here](https://jhipster.github.io/microservices-architecture/) for reference
* Understand intermediate Java & Java IDE
* Understand basic usage of Java Spring. See [here]( https://www.udemy.com/courses/search/?q#java%20spring&src#ukw&lang#en) for tutorial
* Familiar with [Maven](http://maven.apache.org/) or [Gradle](https://gradle.org/)
* Understanding REST concept:  GET, POST, PUT, etc, HTTP Headers, JSON

If you need basic technical explanation about microservice using Spring Cloud, seet [my other repo](https://github.com/timpamungkas/base-microservice)

### Technology Stack
* Java (JDK)
* Spring MVC
* Spring Cloud Netflix (see [here](http://projects.spring.io/spring-cloud/) & [here](https://github.com/spring-cloud/spring-cloud-netflix/))
* [JHipster](http://jhipster.github.io/)
* Tomcat
* Swagger + Springfox for API Documentation

Please note that jhipster does **NOT** support [lombok](http://projectlombok.org/) and they don't want to use it. See [this issue](https://github.com/jhipster/generator-jhipster/issues/398). **Adding lombok library to your project will cause error when running the project!**.

All technologies will be based on latest technology version. By the time this document was written, it were :

* Java 8
* Spring Boot 1.4.1.RELEASE
* Spring Cloud Camden.SR2
* Springfox 2.5. Currently Springfox has 2.6.0 release, but it has [issue with Eureka](https://github.com/spring-cloud/spring-cloud-netflix/issues/1398).

## Overview
### Installation
To start, you need following tools installed:

* [Java 8 (JDK)](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
* IDE of your choice. I  use [Eclipse STS](https://spring.io/tools)
* Maven or Gradle. I use [Maven] (http://maven.apache.org/)

### JHipster on Docker
Not yet supported by this project

### API Gateway
API Gateway using [JHipster API Gateway]( https://jhipster.github.io/microservices-architecture/#gateway), which is based on [Spring Cloud Zuul](https://github.com/spring-cloud/spring-cloud-netflix/blob/master/docs/src/main/asciidoc/spring-cloud-netflix.adoc#router-and-filter-zuul). This will be covered on project gateway.

### Service Registry
API Gateway using [JHipster Service Registry](https://jhipster.github.io/microservices-architecture/#jhipster-registry), which is based on [Spring Cloud Eureka]( https://github.com/spring-cloud/spring-cloud-netflix/blob/master/docs/src/main/asciidoc/spring-cloud-netflix.adoc#service-discovery-eureka-server). This will be covered on project registry.

### Your Own Service
Create your own microservice using [JHipster Generator](https://jhipster.github.io/creating-an-app/). Basically this is a Spring Boot applications that runs as [Eureka Client](https://github.com/spring-cloud/spring-cloud-netflix/blob/master/docs/src/main/asciidoc/spring-cloud-netflix.adoc#service-discovery-eureka-clients). Sample of this will be on project hello.

## How To Start Microservice Project
1. Create a JHipster Service Registry
2. Create a JHipster API Gateway
3. Create microservice application

## Run The Example Project
Example project in this repository can runs basic microservice on development environment. If you want to see what microservice infrastructure looks like, here is the guide:

1. Make sure that you have required tools above installed. Because this sample project use maven, I'll use maven syntax for running project.
2. Clone this repository
3. Go to folder spring-ms-registry and starts it. As spring boot app, you can run it via shell with following command: `mvn spring-boot:run`
4. Go to folder spring-ms-gateway and starts it. As spring boot app, you can run it via shell with following command: `mvn spring-boot:run`
5. Make sure that Service registry is online, go to http://localhost:8761
6. Make sure that API Gateway is online, go to http://localhost:8080
7. Run the example app. Go to folder spring-ms-hello and starts it. As spring boot app, you can run it via shell with following command: `mvn spring-boot:run`
8. At this point, if you access the Gateway, you will see that JHipster (Zuul) Gateway automatically routes hello app into **/hello** endpoint. Try it. Go to your web browser and enter http://localhost:8080/hello/ping/{your_name} and the browser should show your name 

## Development Guideline
Detailed development guidelines will be provided on each project documentation:

* [Main documentation](https://github.com/timpamungkas/spring-microservice/blob/master/documentations/spring-ms-main-guideline.md) (this document)
* [Service Registry documentation](https://github.com/timpamungkas/spring-microservice/blob/master/documentations/spring-ms-registry-guideline.md)
* [API Gateway documentation](https://github.com/timpamungkas/spring-microservice/blob/master/documentations/spring-ms-gateway-guideline.md)
* Sample microservice app documentation
  * [Hello world client + server](https://github.com/timpamungkas/spring-microservice/blob/master/documentations/spring-ms-hello-guideline.md)
  * Sample jhipster app with entity : [Employee](https://github.com/timpamungkas/spring-microservice/blob/entity/documentations/spring-ms-employee-guideline.md)
