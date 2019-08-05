package service;

import java.util.List;

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
	
	
		
	}

