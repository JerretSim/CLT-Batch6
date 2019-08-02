package controller;

import java.util.Scanner;

import pojo.UserData;
import service.LoginServiceImpl;
import service.ServiceLogin;

public class ControllerLogin {

	ServiceLogin refServiceLogin;
	UserData refUserData;
	
	public void userLoginController() {
		userInput();
		
	}

	private void userInput() {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User ID : ");
		int userID = sc.nextInt();
		
		System.out.println("Enter Password : ");
		String password = sc.next();
		
		
	}
}
