package Databases;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;

import Properties.DataUser;
import SqlDAO.SQLValidate;
import db.MyConnection1;

public class ClassPractice1 implements SQLValidate {

	public static void main(String []args) throws ClassNotFoundException, SQLException {
		Connection con = (Connection) MyConnection1.prepareConnection();

		System.out.println("Creating table in given database..");
		Statement st = con.createStatement();

		/*
		 * String sql = "Create TABLE Employee " + "(id INTEGER not NULL,"
		 * +"name VARCHAR(25),"+ "password varchar(35),"+ "dob INTEGER (10))";
		 * st.executeUpdate(sql);
		 * System.out.println("Created table in given database....");
		 * 
		 * 
		 * 
		 * //insert record
		 * 
		 * String sql = "INSERT INTO employee "+
		 * "VALUES (67690961, 'stqyj','abc123','20082000')"; st.executeUpdate(sql);
		 * 
		 * System.out.println("Data Inserted Successfully");
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your ID : ");
		String ID = scanner.next();
		
		System.out.println("Enter your name : ");
		String name = scanner.next();
		
		System.out.println("Enter your password : ");
		String password = scanner.next();
		
		System.out.println("Enter your dob : ");
		String dob = scanner.next();
		
		String sql = "INSERT into employee "
					+  "(last_name, first_name, email)" + " values (?, ?, ?)";
		
		java.sql.PreparedStatement myStmt = con.prepareStatement(sql);
	   
		myStmt.setString(1, ID);
		myStmt.setString(2, name);
		myStmt.setString(3, password);
		myStmt.setString(3, dob);

		myStmt.executeUpdate(sql);
	}

	@Override
	public void addPerson(DataUser pRef) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePerson(DataUser pRef) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<DataUser> ListPerson() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getPersonById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removePerson(int id) {
		// TODO Auto-generated method stub
		
	}

}
