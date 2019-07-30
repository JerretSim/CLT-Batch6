package dao;
import pojo.UserData;

public class LoginVerifyImpl implements LoginVerify {

	@Override
	public boolean LoginValidate(UserData ref) {
		if(ref.getUserID().equals("xyz@gmail.com")) {
			return true;
		}
		else
		return false;
	}

	@Override
	public boolean AccountValidate(UserData ref) {
		if(ref.getUserID().equals("xyz@gmail.com") && ref.getPassword().equals("xyz1234")) {
			return true;
		}
		else
		return false;
	}



}
