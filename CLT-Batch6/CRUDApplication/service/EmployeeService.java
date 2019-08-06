package service;

import java.util.List;

import db.Connectionn;
import pojo.Employee;


public interface EmployeeService {
	public void checkStatus(Connectionn ref);
	public void CallAddEmployee(Employee refEmployee);
	public void CallUpdateEmployee(Employee refEmployee);
	public  List<Employee> ListEmployee();
	public void CallGetEmployeeID(Employee refEmployee);
	public void CallRemoveEmployeeID(Employee refEmployee);
}
