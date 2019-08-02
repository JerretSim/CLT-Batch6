package controller;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.Set;
import pojo.Employee;
import service.EmployeeService;
import service.EmployeeServiceImpl;

public class AdminController {

	Employee refEmployee = new Employee();
	EmployeeService refEmployeeService = new EmployeeServiceImpl();
	
	public void UserInfo() throws ClassNotFoundException, SQLException {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Employee ID : ");
	String ID = sc.next();
	System.out.println("Enter Employee Name: ");
	String name = sc.next();
	System.out.println("Enter Employee Password : ");
	String password = sc.next();
	System.out.println("Enter Employee Date of Birth : ");
	String dob = sc.next();
	
	refEmployee.setDob(dob);
	refEmployee.setId(ID);
	refEmployee.setName(name);
	refEmployee.setPassword(password);
	
	refEmployeeService.CallAddEmployee(refEmployee);
	
	}
	public void UserUpdate() throws ClassNotFoundException, SQLException {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Employee ID : ");
	String ID = sc.next();
	System.out.println("Enter Employee Name: ");
	String name = sc.next();
	System.out.println("Enter Employee Password : ");
	String password = sc.next();
	System.out.println("Enter Employee Date of Birth : ");
	String dob = sc.next();
	
	refEmployee.setDob(dob);
	refEmployee.setId(ID);
	refEmployee.setName(name);
	refEmployee.setPassword(password);
	
	refEmployeeService.CallUpdateEmployee(refEmployee);
	
}

}