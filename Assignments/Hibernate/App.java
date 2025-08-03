package com.demo.hibernate_ass;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
    	Scanner sc = new Scanner(System.in);
        Student_DAO studentDAO = new Student_DAO();
        Course_DAO courseDAO = new Course_DAO();
        while (true) {
            System.out.println("\n=== Student Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Delete Student");
            System.out.println("4. Add Course");
            System.out.println("5. View Courses");
            System.out.println("6. Assign Course to Student");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            if (ch == 1) {
                System.out.print("Student ID: ");
                int id = sc.nextInt();
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Age: ");
                int age = sc.nextInt();

                Student s = new Student();
                s.setId(id);
                s.setName(name);
                s.setAge(age);
                studentDAO.saveStudent(s);
                System.out.println("Student added!");
            }
            else if (ch == 2) {
                studentDAO.getAllStudents().forEach(System.out::println);
            }
            else if (ch == 3) {
                System.out.print("Student ID to delete: ");
                int id = sc.nextInt();
                studentDAO.deleteStudent(id);
                System.out.println("Student deleted!");
            }
            else if (ch == 4) {
                System.out.print("Course ID: ");
                int id = sc.nextInt();
                System.out.print("Course Name: ");
                String cname = sc.next();
                System.out.print("Credit Hours: ");
                int hours = sc.nextInt();

                Course c = new Course();
                c.setId(id);
                c.setCourseName(cname);
                c.setCreditHours(hours);
                courseDAO.saveCourse(c);
                System.out.println("Course added!");
            }
            else if (ch == 5) {
                courseDAO.getAllCourses().forEach(System.out::println);
            }
            else if (ch == 6) {
                System.out.print("Student ID: ");
                int sid = sc.nextInt();
                System.out.print("Course ID: ");
                int cid = sc.nextInt();

                Student s = studentDAO.getStudentById(sid);
                Course c = courseDAO.getCourseById(cid);

                if (s != null && c != null) {
                    s.getCourses().add(c);
                    studentDAO.saveStudent(s);
                    System.out.println("Course assigned!");
                } else {
                    System.out.println("Invalid IDs!");
                }
            }
            else if (ch == 7) {
                System.out.println("Exiting...");
                break;
            }
            else {
                System.out.println("Invalid choice!");
            }
        }
        sc.close();
    
        
    }
    
}
