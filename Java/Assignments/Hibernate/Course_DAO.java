package com.demo.hibernate_ass;

import org.hibernate.Session;
import java.util.List;

public class Course_DAO {

    public void saveCourse(Course course) {
        Session session = Hibernate_Util.getSessionFactory().openSession();
        session.beginTransaction();
        session.saveOrUpdate(course);
        session.getTransaction().commit();
        session.close();
    }

    public List<Course> getAllCourses() {
        Session session = Hibernate_Util.getSessionFactory().openSession();
        List<Course> courses = session.createQuery("from Course", Course.class).list();
        session.close();
        return courses;
    }

    public Course getCourseById(int id) {
        Session session = Hibernate_Util.getSessionFactory().openSession();
        Course course = session.get(Course.class, id);
        session.close();
        return course;
    }

    public void deleteCourse(int id) {
        Session session = Hibernate_Util.getSessionFactory().openSession();
        session.beginTransaction();
        Course course = session.get(Course.class, id);
        if (course != null) {
            session.delete(course);
        }
        session.getTransaction().commit();
        session.close();
    }
}
