package dao;

import java.util.List;

import pojo.Employee;

public interface EmployeeDAO {

	public void addEmployee(Employee refEmployee);
	public void updateEmployee(Employee refEmployee);
	public List<Employee> ListEmployee();
	public void getEmployeeID(String id);
	public void removeEmployeeID (String id);
	
	
	
}
