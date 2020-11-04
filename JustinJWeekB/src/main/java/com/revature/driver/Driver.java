package com.revature.driver;

import com.revature.menu.AppMenu;
import com.revature.util.Files;

public class Driver {

		static {Files.readStudentFile();}
		public static void main(String[] args) {
			AppMenu.startMenu();	

	}

}
