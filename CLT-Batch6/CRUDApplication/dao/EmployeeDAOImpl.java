package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import dao.EmployeeDAO;

import db.Connectionn;
import dbconnection.DBConnection2;
import pojo.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
		

		Connection conRef;
		PreparedStatement psRef;
		
		public  Connection prepareConnection() throws SQLException, ClassNotFoundException{

			String connectionURL = "jdbc:mysql://localhost:3306/clt6";

			String uname = "root";
			String pwd = "root";

			//Register JDBC Driver

			Class.forName("com.mysql.jdbc.Driver");

			//open a connection

			Connection ref = DriverManager.getConnection(connectionURL, uname, pwd);
			return ref;
		}
		
		void getConnection() {
			conRef = DBConnection2.myConnection();
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
			List<Employee> myList = new ArrayList<>();
			Statement st;
			try {
				st = prepareConnection().createStatement();
				String sql = "SELECT * FROM Employee";
				ResultSet rs = st.executeQuery(sql);
				while(rs.next()) {
					Employee pu = new Employee();
					pu.setName(rs.getString(2));
					pu.setId(rs.getString(1));
					pu.setPassword(rs.getString(3));
					pu.setDob(rs.getString(4));
					myList.add(pu);
				}
				} catch (SQLException | ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				return myList;
	    
		}


		



		@Override
		public void getEmployeeID(String id) {
			Statement st;
			try {
				st = prepareConnection().createStatement();
				String sql = "SELECT * FROM Employee WHERE ID = " + id +""; 
				ResultSet rs = st.executeQuery(sql);
				while(rs.next()) {
					Employee pu = new Employee();
					System.out.println("ID : "+rs.getString(1)+" Name : "+rs.getString(2));
				}
			}catch (ClassNotFoundException e) {
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

				
			
		

		@Override
		public void removeEmployeeID(String id) {
			Statement st;
			try {
				st = prepareConnection().createStatement();
				String sql = "DELETE  FROM Employee WHERE ID = " + id +""; 
				st.executeUpdate(sql);
			System.out.println("Delete Successful");
				
			}catch (ClassNotFoundException e) {
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	
			
		
			
		}
	


