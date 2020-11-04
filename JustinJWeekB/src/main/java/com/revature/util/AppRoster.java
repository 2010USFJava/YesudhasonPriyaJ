package com.revature.util;

import java.util.ArrayList;
import java.util.List;

import com.revature.Bean.Student;
//import com.revature.menu.Menu;

public class AppRoster {
	public static List<Student> studentList= new ArrayList<Student>();
	
	public static Student findStudentByName(String inputName) {
		for (int i = 0; i < studentList.size(); i++) {
			String name= studentList.get(i).getName();
			if(inputName.equals(name)) {
				return studentList.get(i);
			}
		}
		
		System.out.println("Student not found");
	//AppMenu.startMenu();
		return null;
	}
}