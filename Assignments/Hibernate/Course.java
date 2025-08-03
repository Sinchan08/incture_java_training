package com.demo.hibernate_ass;
import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "courses")
public class Course {
	  @Id
	    private int id;

	    private String courseName;
	    private int creditHours;

	    @ManyToMany(mappedBy = "courses",fetch = FetchType.EAGER)
	    private List<Student> students = new ArrayList<>();

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getCourseName() {
			return courseName;
		}

		public void setCourseName(String courseName) {
			this.courseName = courseName;
		}

		public int getCreditHours() {
			return creditHours;
		}

		public void setCreditHours(int creditHours) {
			this.creditHours = creditHours;
		}

		public List<Student> getStudents() {
			return students;
		}

		public void setStudents(List<Student> students) {
			this.students = students;
		}

		public Course() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "Course [id=" + id + ", courseName=" + courseName + ", creditHours=" + creditHours + ", students="
					+ students + "]";
		}
	    

}
