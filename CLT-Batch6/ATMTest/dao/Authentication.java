package dao;

import pojo.UserAccount;

public interface Authentication {

	public boolean checkLogin(UserAccount ref);
	public boolean checkPassword(UserAccount ref);
}
