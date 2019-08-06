package service;

import java.util.Scanner;

import controller.ControllerLogin;
import dao.LoginVerify;
import dao.LoginVerifyImpl;
import pojo.UserData1;

public class ServiceLoginImpl implements ServiceLogin {
	LoginVerify refLoginVerify = new LoginVerifyImpl();
	/* ControllerLogin refControllerLogin */
	
	
	
	@Override
	public void checkStatus(UserData1 ref) {
		
		if(refLoginVerify.LoginValidate(ref)==true) {
			System.out.println("Login Validate");
		}
		else
		{
			System.out.println("Login Failed..");
		}
	}

	@Override
	public void checkBalance(UserData1 ref) {
		
		System.out.println(ref.getBankBal());
		ControllerLogin refControllerLogin = new ControllerLogin();
		refControllerLogin.BalanceOption(ref);
		
	}
	


	@Override
	public void checkDeposit(UserData1 ref) {
		ControllerLogin refControllerLogin = new ControllerLogin();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Amount : ");
		int amount = input.nextInt();
		if(amount >= 0) {
		int total = ref.getBankBal() + amount;
		ref.setBankBal(total);
		System.out.println(amount + " Deposited succesfully");
		System.out.println(ref.getBankBal());
		System.out.println("Do you wish to continue? Y/N ");
		String choice = input.next();
		if(choice.equals("Y")){
			checkDeposit(ref);
		} else {
			
			refControllerLogin.BalanceOption(ref);
		}
	
		
		} else {
			System.out.println(amount + " Amount cannot be negative!!");
			checkDeposit(ref);
		}
	}

	@Override
	public void checkWithdraw(UserData1 ref) {
		ControllerLogin refControllerLogin = new ControllerLogin();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Amount : ");
		int amount = input.nextInt();
		if (amount>ref.getBankBal() || amount<0) {
			System.out.println("Sorry! Insuficient Balance!!");
			System.out.println("Do you wish to continue? Y/N");
			String choice = input.next();
			if(choice.equals("Y")){
				checkWithdraw(ref);
			} else {
				
				refControllerLogin.BalanceOption(ref);
			}
		} else {
			
			int total = ref.getBankBal() - amount;
			ref.setBankBal(total);
			
			System.out.println("Transaction Successfull!!");
			System.out.println("Do you wish to continue? Y/N");
			String choice = input.next();
			if(choice.equals("Y")){
				checkWithdraw(ref);
			} else {
				refControllerLogin.BalanceOption(ref);
			}
			}
		}
	

	@Override
	public void forgetPin(UserData1 ref) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkLogin(UserData1 ref) {
		if(refLoginVerify.AccountValidate(ref) == true) {
			System.out.println("Login Successfull");
			
		}else {
			System.out.println("Invalid Login");
		}
		
	}
}
