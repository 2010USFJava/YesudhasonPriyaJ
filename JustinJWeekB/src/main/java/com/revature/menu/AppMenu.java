package com.revature.menu;

	import java.util.Scanner;
	import com.revature.Bean.Student;
	
	import com.revature.util.Logthis;
	import com.revature.util.AppRoster;

	public class AppMenu {
		static Scanner scan = new Scanner(System.in);
		
		public static void startMenu() {
			System.out.println("Welcome to Student info!");
			System.out.println("Please enter a choice:");
			System.out.println("\t[S]reate a new Student");
			System.out.println("\t[A]age!");
			System.out.println("\t[G]gpa");
			
			String choice=scan.nextLine();
			
			if(choice.equalsIgnoreCase(choice)) {
				
					System.out.println("Student infor entered perfectly");
					
					startMenu();
					//break;			
			}
		}
		
		public static void createMenu() {
			System.out.println("Create a new Student!");
			System.out.println("Please enter a name for your Student");
			String studentName=scan.nextLine();
			System.out.println("Please enter your Student's Age:");
			int studentAge= Integer.parseInt(scan.nextLine());
			System.out.println("Please enter your Student's GPA");
			int studentGpa= Integer.parseInt(scan.nextLine());
			System.out.println("Please enter your Student's GPA");
			System.out.println("Please enter a name for your Student");
			String studentSchool=scan.nextLine();
			
			Student a= new Student(studentName,studentAge, studentGpa ,studentSchool);
			Logthis.LogIt("info", a.getName() + " was created!");
			System.out.println(AppRoster.studentList.toString());
			
			System.out.println(a.getName());
			
			}
	}
			
			
		

	
	
	

