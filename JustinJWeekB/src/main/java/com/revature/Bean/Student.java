package com.revature.Bean;
import java.io.Serializable;
import com.revature.util.AppRoster;
import com.revature.util.Files;

public class Student implements Serializable {

	private static final long serialVersionUID = -2924357592842566142L;

	//private static final long serialVersionUID = 1L;
	public static void main(String[] args) 
	
	{
		    private String name;
			private int age;
			private int gpa;
			private String school;
			
			//constructors
			
			public Student() {
				super();
				AppRoster.studentList.add(this);
				Files.writeStudentFile(AppRoster.studentList);
			}
			
			// Constructor with arguments..
			
			public Student(String name, int age, int gpa, String school) {
				super();
				this.name = name;
				this.age = age;
				this.gpa = gpa;
				this.school=school;
				AppRoster.studentList.add(this);
		    }
			
			public void setName(String name) {
				this.name = name;
			}
			
			public String getName() {
				return name;
			}
			
			
			public int getAge() {
				return age;
			}
						
			public void setAge(int age) {
				this.age =age;
			}
			
			public int getgpa() {
				return gpa;
			}
			
			public void setGpa(int gpa) {
				this.gpa = gpa;
			}
			
			public String getSchool() {
				return school;
			}
			
			public void setSchool(String school) {
				this.school = school;
			}
						
			@Override
			public String toString() {
				return "Student [name=" + name + ", Age =" + age + ", gpa=" + gpa + " School = " + school + "]";
			}
	
	
	}