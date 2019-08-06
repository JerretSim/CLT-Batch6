package application;
import java.sql.SQLException;
import java.util.List;

import controller.AdminController;
import controller.ControllerLogin;
import pojo.Employee;

public class EmployeeApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		AdminController refAdminController = new AdminController();
		refAdminController.UserControll();
		// refAdminController.UserUpdate();
		//refAdminController.UserInfo();
		//refAdminController.UserGet();
		//refAdminController.UserRemove();
	

		 //List method 
		/*
		 * List<Employee> list; list= refAdminController.ListEmployee();
		 * System.out.println("User ID \tName \t\tPassword\tDOB "); for(int
		 * i=0;i<list.size();i++){
		 * 
		 * System.out.println(list.get(i).getId() + "\t\t" + list.get(i).getName() +
		 * "\t\t" + list.get(i).getPassword() + "\t\t" + list.get(i).getDob());
		 * 
		 * } refAdminController.ListEmployee();
		 */
	}
}
