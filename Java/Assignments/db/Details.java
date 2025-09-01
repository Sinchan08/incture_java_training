package com.demo.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Details {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		  Class.forName("com.mysql.jdbc.Driver");
			
			String user_name="root";
			String password="*****";
			String url="jdbc:mysql://localhost:3306/Student_DB";
			
			Connection con=DriverManager.getConnection(url,user_name,password);
			Statement st=con.createStatement();
			
			Scanner sc=new Scanner(System.in);
			while(true) {
			System.out.println("\n---Student Management Menu ---");
			System.out.println("1.Add Student");
			System.out.println("2.View Student");
			System.out.println("3.Update Student");
			System.out.println("4.Delete Student");
			System.out.println("5.Exit");
			System.out.println("Enter your choice");
			int choice =sc.nextInt();
			switch(choice) {
			case 1:
				addStudent(con,sc);
				break;
			case 2:
				viewStudent(con);
				break;
			case 3:
				updateStudent(con,sc);
				break;
			case 4:
				deleteStudent(con,sc);
				break;
			case 5:
				System.out.println("Exiting.......");
				con.close();
				return;
			default:
				System.out.println("Invalid choice");
			}
			}
	    }
		public static void addStudent(Connection con,Scanner sc)throws SQLException{
			System.out.println("Enter Student ID: ");
		    int id = sc.nextInt();
		    sc.nextLine();
		    System.out.println("Enter Student Name: ");
		    String name = sc.nextLine();
		    System.out.print("Enter Student Age: ");
		    int age = sc.nextInt();
		    String query = "INSERT INTO Student (id, name, age) VALUES (" + id + ", '" + name + "', " + age + ")";
		    Statement st = con.createStatement();
		    int rows = st.executeUpdate(query);
		    if (rows > 0) {
		        System.out.println("Student added successfully!");
		    }
		}
		public static void viewStudent(Connection con) throws SQLException {
		    String query = "SELECT * FROM Student";
		    Statement st = con.createStatement();
		    var rs = st.executeQuery(query);
		    System.out.println("\n--- Student Records ---");
		    while (rs.next()) {
		        System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Age: " + rs.getInt("age"));
		    }
		}
		public static void updateStudent(Connection con, Scanner sc) throws SQLException {
		    System.out.print("Enter Student ID to update: ");
		    int id = sc.nextInt();
		    sc.nextLine();
		    System.out.print("Enter new name: ");
		    String name = sc.nextLine();
		    System.out.print("Enter new age: ");
		    int age = sc.nextInt();

		    String query = "UPDATE Student SET name='" + name + "', age=" + age + " WHERE id=" + id;
		    Statement st = con.createStatement();
		    int rows = st.executeUpdate(query);
		    if (rows > 0) {
		        System.out.println("Student updated successfully!");
		    } else {
		        System.out.println("Student not found!");
		    }
		}
		public static void deleteStudent(Connection con, Scanner sc) throws SQLException {
		    System.out.print("Enter Student ID to delete: ");
		    int id = sc.nextInt();

		    String query = "DELETE FROM Student WHERE id=" + id;
		    Statement st = con.createStatement();
		    int rows = st.executeUpdate(query);
		    if (rows > 0) {
		        System.out.println("Student deleted successfully!");
		    } else {
		        System.out.println("Student not found!");
		    }
		}
		
		    
		    
	
	}
	


