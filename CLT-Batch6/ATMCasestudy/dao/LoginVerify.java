package dao;

import pojo.UserData1;

public interface LoginVerify {
	boolean LoginValidate(UserData1 ref);
	boolean AccountValidate(UserData1 ref);
}
