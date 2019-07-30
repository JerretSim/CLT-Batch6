package service;

import dao.LoginVerify;
import dao.LoginVerifyImpl;
import pojo.UserAccount;;

public class ServiceLoginImpl implements ServiceLogin{
	
	UserAccount refuserAccount;
	LoginVerify refLoginVerify;
	
	@Override
	public void checkStatus(UserAccount ref) {
		refLoginVerify = new LoginVerifyImpl();   
		
		
	}

}
