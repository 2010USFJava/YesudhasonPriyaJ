package com.revature.util;

  import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.ObjectInputStream;
	import java.io.ObjectOutputStream;
	import java.util.ArrayList;
	import java.util.List;

	import com.revature.Bean.Student;

	public class Files {
		public static final String studentFile = "studentList.txt";

		// write method
		public static void writeStudentFile(List<Student> sList) {
			try {
				ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream(studentFile));
				objectOut.writeObject(sList);
				objectOut.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// read method
		@SuppressWarnings("unchecked")
		public static void readStudentFile() {
			try {
				ObjectInputStream objectIn= new ObjectInputStream(new FileInputStream(studentFile));
				AppRoster.studentList=(ArrayList<Student>)objectIn.readObject();
				objectIn.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	

}
