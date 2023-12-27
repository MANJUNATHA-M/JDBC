package com.home.prepareStatement;


import java.sql.*;

public class Homedetails_prepareStatement {

	public static void main(String[] args) throws Exception
	{

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/homedetails", "root", "root");
		
		PreparedStatement st=conn.prepareStatement("insert into homemembers values(?,?,?) ");
		
		st.setInt(1, 9);
		st.setString(2, "chocho");
		st.setString(3, "700000");
		
		int count =st.executeUpdate();
		
		System.out.println(count+ "rowes affected");

		st.close();
		conn.close();

	}

}
