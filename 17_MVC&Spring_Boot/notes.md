MVC Architecture & Spring Boot
1. MVC Architecture
MVC stands for Model-View-Controller. It is a design pattern used to separate concerns in an application.

1.1 Components
Component	Description
Model	Represents data and business logic. Handles database operations and rules.
View	Displays data to the user (UI layer).
Controller	Handles incoming requests, processes data using Model, and updates View.

1.2 Workflow
Client Request → Controller

Controller processes the request, interacts with the Model.

Model returns data to the Controller.

Controller sends data to View.

View renders response to the client.

1.3 Advantages
Separation of Concerns – Easy to maintain and scale.

Reusability – Components can be reused across applications.

Testability – Logic, UI, and control can be tested independently.

1.4 MVC in Spring
Model: Java objects, Services, DAO (Data Access Layer).

View: JSP, Thymeleaf, or Frontend frameworks.

Controller: Spring @Controller or @RestController classes.

2. Spring Boot
Spring Boot is a framework that simplifies building production-ready Spring applications.

2.1 Features
Auto-configuration – Automatically configures beans based on dependencies.

Embedded Server – No need for external Tomcat/Jetty server.

Starter Dependencies – Predefined Maven/Gradle dependencies.

Production Ready – Includes Actuator for monitoring and metrics.

Opinionated Defaults – Reduces boilerplate setup.

2.2 Spring Boot Workflow
Create a Spring Boot application with @SpringBootApplication.

Define controllers using @RestController or @Controller.

Define services and repositories using @Service and @Repository.

Use application.properties or application.yml for configuration.

Run the app using the embedded server.

2.3 Key Annotations
Annotation	Description
@SpringBootApplication	Combines @Configuration, @EnableAutoConfiguration, @ComponentScan.
@RestController	Marks a class as a RESTful controller.
@RequestMapping	Maps HTTP requests to handler methods.
@Autowired	Injects dependencies automatically.
@Service	Marks a service class for business logic.
@Repository	Marks a data access layer (DAO).
@Entity	Defines a JPA entity (model).


2.5 Example Controller
java
Copy code
@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Spring Boot!";
    }
}
Advantages of Spring Boot
No XML configuration required.

Quick setup and development.

Built-in Tomcat server.

Rich ecosystem (Spring Data, Spring Security, etc.).