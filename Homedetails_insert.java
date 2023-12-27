package com.home.insert;


import java.sql.*;

public class Homedetails_insert {

	public static void main(String[] args) throws Exception
	{

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/homedetails", "root", "root");
		Statement st=conn.createStatement();
		
		int count	=st.executeUpdate("insert into homemembers values(6,'NARUTO','00000') ");
		
		System.out.println(count + "rowes affected");
		
		st.close();
		conn.close();

	}

}
