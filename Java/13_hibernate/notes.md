Day 13 (28th July): JDBC Advanced + Hibernate + Maven

1. CallableStatement (Stored Procedures)

What?

Used to execute stored procedures in the database.

Syntax:
CallableStatement cs = con.prepareCall("{call procedure_name(?, ?)}");
cs.setInt(1, value);
cs.registerOutParameter(2, Types.INTEGER);
cs.execute();
int result = cs.getInt(2);

2. Batch Updates

What?

Used to execute multiple SQL queries in a batch to improve performance.

Example:
Statement stmt = con.createStatement();
stmt.addBatch("INSERT INTO student VALUES (1, 'John')");
stmt.addBatch("INSERT INTO student VALUES (2, 'Alice')");
stmt.executeBatch();


3. Transaction Management

What?

Ensures ACID properties (Atomicity, Consistency, Isolation, Durability).

Manual Commit Example:
con.setAutoCommit(false);

Statement stmt = con.createStatement();
stmt.executeUpdate("UPDATE account SET balance = balance - 100 WHERE id = 1");
stmt.executeUpdate("UPDATE account SET balance = balance + 100 WHERE id = 2");

con.commit();

Rollback:
con.rollback();

4. Hibernate Basics

What?

Hibernate is a Java ORM (Object Relational Mapping) framework.

Helps map Java classes to DB tables without writing much SQL.

Benefits:

Reduces boilerplate JDBC code

Supports HQL (Hibernate Query Language)

Caching, Lazy loading, Annotations supported

Configuration:

hibernate.cfg.xml: Contains DB connection and Hibernate settings.

hibernate.cfg.xml needs:
<hibernate-configuration>
  <session-factory>
    <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/demo</property>
    <property name="hibernate.connection.username">root</property>
    <property name="hibernate.connection.password">password</property>
    <mapping class="com.demo.model.Student"/>
  </session-factory>
</hibernate-configuration>

5. Maven

What?

Build and dependency management tool.

Helps manage .jar files and build lifecycle.

Files:

pom.xml: Contains dependencies, build plugins, project metadata.

Example Dependency:
<dependencies>
  <dependency>
    <groupId>org.hibernate</groupId>
    <artifactId>hibernate-core</artifactId>
    <version>5.4.32.Final</version>
  </dependency>
</dependencies>