package com.home.select;
import java.sql.*;

public class Homedetails {

	public static void main(String[] args) throws Exception
	{

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/homedetails", "root", "root");
		Statement st=conn.createStatement();
		ResultSet rs	=st.executeQuery("select * from homeMembers ");
		System.out.println("MEMBERID"+"\tMNAME"+"\tMSAL");	
		while(rs.next())
		{

			System.out.println("");
			System.out.println(rs.getInt(1)+"    "+rs.getString(2)+"     "+rs.getString(3));
		}
		rs.close();
		conn.close();

	}

}
