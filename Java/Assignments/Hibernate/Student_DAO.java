package com.demo.hibernate_ass;
import org.hibernate.Session;
import java.util.List;

public class Student_DAO {
	public void saveStudent(Student student) {
        Session session = Hibernate_Util.getSessionFactory().openSession();
        session.beginTransaction();
        session.saveOrUpdate(student);
        session.getTransaction().commit();
        session.close();
    }

    public List<Student> getAllStudents() {
        Session session = Hibernate_Util.getSessionFactory().openSession();
        List<Student> students = session.createQuery("from Student", Student.class).list();
        session.close();
        return students;
    }

    public Student getStudentById(int id) {
        Session session = Hibernate_Util.getSessionFactory().openSession();
        Student student = session.get(Student.class, id);
        session.close();
        return student;
    }

    public void deleteStudent(int id) {
        Session session = Hibernate_Util.getSessionFactory().openSession();
        session.beginTransaction();
        Student student = session.get(Student.class, id);
        if (student != null) {
            session.delete(student);
        }
        session.getTransaction().commit();
        session.close();
    }

}
