package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.EmployeeDAO;

import db.Connectionn;
import pojo.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
		

		Connection conRef;
		PreparedStatement psRef;
		
		void getConnection() {
			try {
				conRef = Connectionn.prepareConnection();
			} catch(ClassNotFoundException | SQLException e) {
				System.out.println("DB Connection Error.. ");
			}
		}

		@Override
		public void addEmployee(Employee refEmployee) {
			getConnection();
			
			try {
				psRef = conRef.prepareStatement("insert into employee (id, name, password, dob) values (?,?,?,?)");
				psRef.setString(1, refEmployee.getId());
				psRef.setString(2, refEmployee.getName());
				psRef.setString(3,refEmployee.getPassword());
				psRef.setString(4, refEmployee.getDob());
					
				psRef.executeUpdate();
				
				System.out.println("Record Added Successfully..");
			} catch (Exception e) {
				System.out.println("Exception caught.. Not able to update record..");
			
			}
			finally {
				try {
					conRef.close();
				} catch(SQLException e) {
					System.out.println("Exeception caught.. Not able to clone connection");
				}
				
			}
		}

		@Override
		public void updateEmployee(Employee refEmployee) {
			getConnection();
			
			try {
				psRef = conRef.prepareStatement("update employee set name = ?, password = ?, dob = ? where id = ?");
				psRef.setString(1, refEmployee.getName());
				psRef.setString(2,refEmployee.getPassword());
				psRef.setString(3, refEmployee.getDob());
				psRef.setString(4, refEmployee.getId());	
				
				
				psRef.executeUpdate();
				
				System.out.println("Updated Successfully..");
			} catch (Exception e) {
				System.out.println("Exception caught.. Not able to update record..");
			
			}
			finally {
				try {
					conRef.close();
				} catch(SQLException e) {
					System.out.println("Exeception caught.. Not able to clone connection"); 
				
		}
			}
		}
		  
		@Override
		public List<Employee> ListEmployee() {
			 getConnection();
			  ArrayList<Employee> personlist = new ArrayList<Employee>();
		        //List<Person> personlist = new List<Person>();
		        try {
		        	psRef = conRef.prepareStatement("update employee set name = ?, password = ?, dob = ? where id = ?");
		
					
		            while (srs.next()) {
		                Employee person = new Employee();
		                person.setName(srs.getString("name"));
		                person.setId(srs.getString("Id"));
		                person.setPassword(srs.getString("password"));
		                person.setDob(srs.getString("dob"));
		                personlist.add(person);
		            }
		 
		            System.out.println(personlist.size());
		            System.out.println(personlist.get(1).getName());
		            System.out.println(personlist.get(2).getName());
		            System.out.println(personlist.get(3).getName());
		            System.out.println(personlist.get(4));
		 
		        //System.out.println(namelist.);
		        } catch (Exception e) {
		            System.err.println("Got an exception! ");
		            System.err.println(e.getMessage());
		        }
			  }
			 
		}

		@Override
		public void getEmployeeById(int id) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void removeEmployee(int id) {
			// TODO Auto-generated method stub
			
		}
	}


