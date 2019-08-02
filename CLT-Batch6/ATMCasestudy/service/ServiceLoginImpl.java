package service;

import dao.LoginVerify;
import pojo.UserData;

public class ServiceLoginImpl implements ServiceLogin {
	
	LoginVerify refLoginVerify;
	
	@Override
	public void checkStatus(UserData ref) {
		
		if(refLoginVerify.LoginValidate(ref)==true) {
			System.out.println("Login Validate");
		}
		else
		{
			System.out.println("Login Failed..");
		}
		
		
		
		
	}

}
