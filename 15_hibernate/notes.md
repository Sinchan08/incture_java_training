Day 15 (30th July): Hibernate – Lazy Loading vs Eager Loading

1. Lazy Loading
Definition: Objects are fetched only when needed (on-demand).

Default behavior for collections (@OneToMany, @ManyToMany).

Saves memory and improves performance by avoiding unnecessary queries.

Example:
java
Copy
Edit
@Entity
public class Department {
    @Id
    private int deptId;
    private String name;

    @OneToMany(mappedBy = "department", fetch = FetchType.LAZY)
    private List<Employee> employees;
}
What happens:

Hibernate fetches only Department details initially.

When getEmployees() is called, Hibernate fires another query to fetch employees.

2. Eager Loading
Definition: Objects are fetched immediately along with the parent object.

Used when associated data is always required.

Can result in extra queries and memory usage if data is not used.

Example:
java
Copy
Edit
@Entity
public class Department {
    @Id
    private int deptId;
    private String name;

    @OneToMany(mappedBy = "department", fetch = FetchType.EAGER)
    private List<Employee> employees;
}
What happens:

Hibernate fetches Department and its Employee list in one query (using join).

3. Comparison
Aspect	Lazy Loading	Eager Loading
Query Execution	When accessed (on demand)	Immediately
Performance	Faster initial load	Slower initial load
Memory Usage	Lower	Higher
Use Case	Large collections, rarely accessed	Small collections, frequently needed

4. Best Practices
Prefer Lazy Loading for collections to avoid unnecessary DB hits.

Use Eager Loading only when data is always required.

Combine with JOIN FETCH in HQL/JPQL for selective eager loading.