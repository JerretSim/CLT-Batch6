package service;

import java.util.List;
import java.util.Scanner;

import dao.EmployeeDAO;
import dao.EmployeeDAOImpl;
import db.Connectionn;
import pojo.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDAO refEmployeeDAO;
	
	public void CallAddEmployee(Employee refEmployee) {
		refEmployeeDAO = new EmployeeDAOImpl();
		refEmployeeDAO.addEmployee(refEmployee);
	}

	@Override
	public void checkStatus(Connectionn ref) {
	
		
	}

	@Override
	public void CallUpdateEmployee(Employee refEmployee) {
		refEmployeeDAO = new EmployeeDAOImpl();
		refEmployeeDAO.updateEmployee(refEmployee);
	}

	@Override
	public List<Employee> ListEmployee() {
		refEmployeeDAO = new EmployeeDAOImpl();
		return refEmployeeDAO.ListEmployee();
	}

	@Override
	public void CallGetEmployeeID(Employee refEmployee) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your ID");
		String id = sc.next();
		refEmployeeDAO = new EmployeeDAOImpl();
		refEmployeeDAO.getEmployeeID(id);
		
	}

	@Override
	public void CallRemoveEmployeeID(Employee refEmployee) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee ID : ");
		String ID = sc.next();
	
		
		refEmployeeDAO = new EmployeeDAOImpl();
		refEmployeeDAO.removeEmployeeID(ID);
		
	}
	
	
		
	}

