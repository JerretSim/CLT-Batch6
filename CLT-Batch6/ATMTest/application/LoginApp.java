package application;

import java.util.Scanner;
import controller.LoginRequest;
import pojo.UserAccount;

public class LoginApp {
	public static void main(String[] args) {
		LoginRequest toLogin = new LoginRequest(); toLogin.sendLoginRequest();
	
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * UserAccount refUserAccount = new UserAccount(); refUserAccount.getLoginID();
		 * System.out.println(refUserAccount.getLoginID());
		 * System.out.println("Please enter Login ID: "); String UserID = sc.next();
		 * refUserAccount.setLoginID(UserID);
		 * System.out.println(refUserAccount.getLoginID());
		 */
	}
}
	