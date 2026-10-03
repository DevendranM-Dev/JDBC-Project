package com.rc.jdbc_stpes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

	public static void main(String[] args) {
		//com.mysql.cj.jdbc.Driver.class
		
		String url="jdbc:mysql://localhost:3306/rc_jdbc";
		String userName="root";
		String password="devendran";
		Connection con=null;
		Statement stmt=null;
		
		
		try {
			//load and register driver
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Step 1: load and register Driver class");
			
			//2.Establish connection between JAVA AND MYSQL
			con=DriverManager.getConnection(url, userName, password);
			System.out.println(con.getClass().getName());
			System.out.println("step 2: Successfully Established Connection");
			
			
			//3.Create Platform
			stmt=con.createStatement();
			System.out.println("Step 3 : Platform Created Succesfully");
			
			
			//4.Execute Query
			String query= "INSERT INTO STUDENT (SID,SNAME,EMAIL,MARKS) VALUES(6,'DHONI','msd@gmail.com',99)";
			
			int res=stmt.executeUpdate(query);
			
			if(res>0) {
				System.out.println("Record Inserted Succesfully");
				
			}
			else {
				System.out.println("Failed to Insert Succesfully");
			}
				
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
		finally {
			//close costly resource  Connection
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
			
			//close costly resource  Statement
			if(stmt!=null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
						
		}
		
	}
}
