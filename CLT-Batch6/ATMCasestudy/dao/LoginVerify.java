package dao;

import pojo.UserData;

public interface LoginVerify {
	boolean LoginValidate(UserData ref);
	boolean AccountValidate(UserData ref);
}
