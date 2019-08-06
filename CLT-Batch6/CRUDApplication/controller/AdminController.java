package controller;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import pojo.Employee;
import service.EmployeeService;
import service.EmployeeServiceImpl;

public class AdminController {
	
	Employee refEmployee = new Employee();
	EmployeeService refEmployeeService = new EmployeeServiceImpl();
	
	public void UserControll() throws ClassNotFoundException, SQLException {
		
		try {
			System.out.println("Select Your Choice: \n1.Register \n2.Update Info \n3.Employee List \n4.Employee Info \n5.Remove Employee");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
		switch(choice) {
		case 1 : 
			UserInfo();
			break;
		case 2 : 
			UserUpdate();
			break;
		case 3 :
			ListEmployee();
			break;
		case 4 : 
			UserGet();
			break;
		case 5 : 
			UserRemove();
			break;
			default :
				System.out.println("Invalid Input");
          	UserControll();
          
		}
		}
		catch (InputMismatchException e) {
            System.out.println("\nINVALID INPUT!");
            UserControll();
	}
	}
	
		
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
	
	public List<Employee> ListEmployee() {
		
		List<Employee> list;
		list= refEmployeeService.ListEmployee();
		  System.out.println("User ID \tName \t\tPassword\tDOB "); for(int
		  i=0;i<list.size();i++){
		
		  System.out.println(list.get(i).getId() + "\t\t" +
		 list.get(i).getName() + "\t\t" + list.get(i).getPassword() + "\t\t" +
		  list.get(i).getDob());
		  
		  } refEmployeeService.ListEmployee();
		 
		return refEmployeeService.ListEmployee();
		
	}
	
	public void UserGet() throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee ID : ");
		String ID = sc.next();
		System.out.println("Enter Employee Name : ");
		String name = sc.next();
		
		refEmployee.setId(ID);
		refEmployee.setName(name);
		refEmployeeService.CallGetEmployeeID(refEmployee);
	}
	
	public void UserRemove() throws ClassNotFoundException, SQLException {
	
		
	
		refEmployeeService.CallRemoveEmployeeID(refEmployee);
	}
}
