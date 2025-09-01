Spring Framework – Loose Coupling & Tight Coupling
1. What is Coupling?
Coupling is the degree of dependency between two classes or modules.

It defines how much one class knows about another.

In software design, loose coupling is preferred because it improves flexibility, scalability, and maintainability.

2. Tight Coupling
Definition:
When one class is directly dependent on another class, it is called tight coupling.

Characteristics:

A class creates an object of another class using the new keyword.

Changes in one class may require changes in the dependent class.

Less flexible and harder to test.

Example (Tight Coupling in Java):

java
Copy
Edit
class Bike {
    void ride() {
        System.out.println("Riding the bike...");
    }
}

class Person {
    Bike bike = new Bike(); // Direct dependency

    void startJourney() {
        bike.ride();
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.startJourney();
    }
}
Problem: If we want to replace Bike with Car, we must modify the Person class.

3. Loose Coupling
Definition:
When a class depends on an interface or abstraction rather than a concrete class, it is called loose coupling.

Characteristics:

Achieved using interfaces or Spring Dependency Injection (DI).

Reduces interdependency between classes.

Easier to test and extend.

Example (Loose Coupling in Java):

java
Copy
Edit
interface Vehicle {
    void ride();
}

class Bike implements Vehicle {
    public void ride() {
        System.out.println("Riding the bike...");
    }
}

class Car implements Vehicle {
    public void ride() {
        System.out.println("Driving the car...");
    }
}

class Person {
    private Vehicle vehicle;

    // Dependency is injected via constructor
    Person(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    void startJourney() {
        vehicle.ride();
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle bike = new Bike();
        Person p = new Person(bike); // Injecting dependency
        p.startJourney();

        // Switching to car without modifying Person class
        Vehicle car = new Car();
        Person p2 = new Person(car);
        p2.startJourney();
    }
}
Advantage:

No need to change Person class when changing the vehicle type.

4. Loose Coupling in Spring
Spring achieves loose coupling using:

Dependency Injection (DI): Injecting dependencies from outside instead of creating them inside a class.

Inversion of Control (IoC) Container: Manages object creation and wiring.

Configuration Options:

XML-based Configuration

Annotation-based Configuration (@Autowired, @Component, @Configuration)

Java-based Configuration (using @Bean)

Example (Spring XML-based DI)
xml
Copy
Edit
<!-- beans.xml -->
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="
           http://www.springframework.org/schema/beans
           https://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="bike" class="com.demo.Bike"/>
    <bean id="person" class="com.demo.Person">
        <constructor-arg ref="bike"/>
    </bean>
</beans>
java
Copy
Edit
// Person.java
public class Person {
    private Vehicle vehicle;
    public Person(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public void startJourney() {
        vehicle.ride();
    }
}
java
Copy
Edit
// Main.java
ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
Person p = context.getBean("person", Person.class);
p.startJourney();
5. Key Differences
Aspect	Tight Coupling	Loose Coupling
Dependency	Classes are directly dependent	Classes depend on abstractions
Flexibility	Low	High
Testability	Hard to test	Easy to test (mocking is possible)
Maintenance	Difficult	Easy
Achieved By	new keyword	Interfaces, DI (Spring IoC)

✅ Conclusion:
Always prefer loose coupling in Spring applications using Dependency Injection and IoC container, as it makes your application modular, testable, and easier to maintain.