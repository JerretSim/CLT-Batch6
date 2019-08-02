package application;
import java.sql.SQLException;

import controller.AdminController;
import pojo.Employee;

public class EmployeeApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		AdminController refAdminController = new AdminController();
		refAdminController.UserUpdate();
		//refAdminController.UserInfo();
	}
}
