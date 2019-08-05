package dao;
import pojo.UserData1;

public class LoginVerifyImpl implements LoginVerify {

	@Override
	public boolean LoginValidate(UserData1 ref) {
		if(ref.getUserID().equals("xyz@gmail.com")) {
			return true;
		}
		else
		return false;
	}

	@Override
	public boolean AccountValidate(UserData1 ref) {
		if(ref.getUserID().equals("xyz@gmail.com") && ref.getPassword().equals("xyz1234")) {
			return true;
		}
		else
		return false;
	}



}
