package service;
import pojo.UserData1;

public interface ServiceLogin {
	
	public void checkStatus(UserData1 ref);
	public void checkBalance(UserData1 ref);
	public void checkDeposit(UserData1 ref);
	public void checkWithdraw(UserData1 ref);
	public void forgetPin(UserData1 ref);
	public void checkLogin(UserData1 ref);
}
