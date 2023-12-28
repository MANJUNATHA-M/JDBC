package com.home.create;
import java.sql.*;

// Creation of table

public class Homedetails_create_table
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/homedetails", "root", "root");
		Statement st=conn.createStatement();
		st.executeUpdate("create table homemembers (mid int(3),name varchar(25),msal varchar(25))");
		System.out.println(" TABLE CREATED SACCESSFULLY ");

		st.close();
		conn.close();
	}
}
