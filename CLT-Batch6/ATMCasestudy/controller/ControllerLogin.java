package controller;

import java.util.Scanner;

import pojo.UserData1;
import service.LoginServiceImpl;
import service.ServiceLogin;
import service.ServiceLoginImpl;

public class ControllerLogin {

	ServiceLogin refServiceLogin  = new ServiceLoginImpl();
	 UserData1 refUserData = new UserData1(); 
	
	public void userLoginController() {
		System.out.println("User Home Page: \n1.Register \n2.Login \n3.Forget Password \n4.Logout");
		System.out.println("Select your choice");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch (choice) {
		case 1 : 
			userRegistration();
			break;
		case 2 : 
			userLogin();
			break;
		case 3 : 
			forgetPassword();
			break;
		case 4 :
			userLogout();
			break;
			default : 
				System.out.println("Invalid Choice");
//				userLoginController();
		}
	}

	

	private void forgetPassword() {
		// TODO Auto-generated method stub
		
	}

	private void userRegistration() {
		// TODO Auto-generated method stub
		
	}
	
	private void userLogout() {
			System.out.println("Logout");
			
		}
	
	private void userLogin() {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User ID : ");
		String userID = sc.next();
		
		System.out.println("Enter Password : ");
		String password = sc.next();
		
		refUserData.setUserID(userID);
		refUserData.setPassword(password);
		refServiceLogin.checkLogin(refUserData);
		BalanceOption();
		
		
		
	}	
	
	public void BalanceOption() {
		System.out.println("1.Check Available Bank Balance \n2.Deposit Amount \n3.Withdraw Amount");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice) {
		case 1 : 
			refServiceLogin.checkBalance(refUserData);
			break;
		case 2 : 
			refServiceLogin.checkDeposit(refUserData);
			break;
		case 3 : 
			refServiceLogin.checkWithdraw(refUserData);
			break;
			default : 
				System.out.println("Invalid Choice");
				
		}
	}
}

