Day 12 (26th July): JDBC Basics + Eclipse to Workbench Connection

1. What is JDBC?

JDBC stands for Java Database Connectivity.

It is an API that allows Java programs to connect, interact, and manipulate databases (like MySQL, Oracle, etc).

2. JDBC Architecture

Driver Manager: Loads the database driver.

Connection Interface: Connects Java app to DB.

Statement Interface: Used to run SQL queries.

ResultSet Interface: Holds results of SQL queries.

Steps to Connect Java (Eclipse) to MySQL (Workbench)

✅ Prerequisites:

Install MySQL Server + Workbench

Download MySQL Connector/J (JDBC driver)

Add the .jar to your Eclipse project build path

🪜 Steps:

1.Import the Packages
import java.sql.*;

2.Register the Driver
Class.forName("com.mysql.cj.jdbc.Driver");

3.Establish Connection
Connection con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/database_name", "username", "password");

4.Create Statement
Statement stmt = con.createStatement();

5.Execute Query
ResultSet rs = stmt.executeQuery("SELECT * FROM tablename");

6.Process Results
while(rs.next()) {
    System.out.println(rs.getInt(1) + " " + rs.getString(2));
}

7.Close Connection
con.close();

Basic Program Example

import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/demo", "root", "password");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            while(rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2));
            }
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

