package pojo;

public class UserData {

	private String userID;
	private String password;
	private int bankBal;
	private String securityKey;
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getBankBal() {
		return bankBal;
	}
	public void setBankBal(int bankBal) {
		this.bankBal = bankBal;
	}
	public String getSecurityKey() {
		return securityKey;
	}
	public void setSecurityKey(String securityKey) {
		this.securityKey = securityKey;
	}
	
}
