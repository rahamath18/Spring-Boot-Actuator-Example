## Spring Boot Actuator Example using  SpringBoot 2.2.2


Spring Boot includes a number of additional features to help you monitor and manage your application when you push it to production. You can choose to manage and monitor your application by using HTTP endpoints or with JMX. Auditing, health, and metrics gathering can also be automatically applied to your application.

For more details: https://docs.spring.io/spring-boot/docs/current/reference/html/actuator.html


### Used technology stack in this example

	1. OpenJDK 12
	2. Apache Maven 3.5.4
	3. SpringBoot 2.2.2
	4. springBoot Actuator 2.2.2
	5. Postman Version 7.14.0


### Use following URL to create spring boot initial application structure

	https://start.spring.io/


### Maven initial setup

	$ mvn dependency:tree
	$ mvn eclipse:eclipse


### Run Directly the spring boot application

	$ mvn spring-boot:run
	
	Browse	http://localhost:7001/springboot-actuator-example/


### Build application jar or war

	$ mvn clean package
		

### Deployable war 

	Deploy in Tomcat
	
	Start server
	
	Browse	http://localhost:7001/springboot-actuator-example/


### Executable jar

	$ java -jar target/Account-Microservice-1.0-PROD.jar
	
	Browse	http://localhost:7001/springboot-actuator-example/


### Test following actuator URLs

	http://localhost:7001/springboot-actuator-example/actuator
	http://localhost:7001/springboot-actuator-example/actuator/env
	http://localhost:7001/springboot-actuator-example/actuator/health
	http://localhost:7001/springboot-actuator-example/actuator/beans
	http://localhost:7001/springboot-actuator-example/actuator/auditevents
	http://localhost:7001/springboot-actuator-example/actuator/trace
	http://localhost:7001/springboot-actuator-example/actuator/dump
	http://localhost:7001/springboot-actuator-example/actuator/metrics
	http://localhost:7001/springboot-actuator-example/actuator/info	
	