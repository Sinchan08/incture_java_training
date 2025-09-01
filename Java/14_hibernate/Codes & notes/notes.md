Day 14 (29th July): Hibernate – get(), load() & Relationships


1. get() vs load()
Aspect	get()	load()
Return Type	Actual object or null if not found	Proxy object (lazy initialization)
When to use	When you need to check if record exists	When you are sure the record exists
Exception	Returns null if not found	Throws ObjectNotFoundException if record doesn’t exist
Example	session.get(Student.class, 1)	session.load(Student.class, 1)

2. Hibernate Relationships
Hibernate supports mapping between Java objects using annotations.

A. One-to-One Relationship
One entity is associated with exactly one other entity.

java
Copy
Edit
@Entity
public class Student {
    @Id
    private int id;
    private String name;

    @OneToOne
    private Address address;
}
java
Copy
Edit
@Entity
public class Address {
    @Id
    private int id;
    private String city;
}
B. One-to-Many Relationship
One entity is related to multiple entities.

java
Copy
Edit
@Entity
public class Department {
    @Id
    private int deptId;
    private String deptName;

    @OneToMany(mappedBy = "department")
    private List<Employee> employees;
}
java
Copy
Edit
@Entity
public class Employee {
    @Id
    private int empId;
    private String name;

    @ManyToOne
    private Department department;
}
C. Many-to-One Relationship
Multiple entities relate to one entity (inverse of One-to-Many).

Already shown in the Employee class above.

D. Many-to-Many Relationship
Both entities can have many references to each other.

java
Copy
Edit
@Entity
public class Student {
    @Id
    private int id;
    private String name;

    @ManyToMany
    private List<Course> courses;
}
java
Copy
Edit
@Entity
public class Course {
    @Id
    private int id;
    private String courseName;

    @ManyToMany(mappedBy = "courses")
    private List<Student> students;
}