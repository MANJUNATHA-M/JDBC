package com.home.delete;


import java.sql.*;

public class Homedetails_delete {

	public static void main(String[] args) throws Exception
	{

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/homedetails", "root", "root");
		Statement st=conn.createStatement();
		
		int count	=st.executeUpdate("DELETE FROM homemembers WHERE MNAME='NARUTO'");
		
		System.out.println(count + "rowes affected");
		 
		st.close();
		conn.close();

	}

}
