package com.atos.java.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Callablestmex {
	private static final String url="jdbc:oracle:thin:@localhost:1521:xe";
	private static final String uid="hr";
	private static final String pwd="hr";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con=null;
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection(url,uid,pwd);
		
			//st.executeUpdate("create table Bill_master(bill_no number(4),customer_name varchar2(20),amount number(5))");
			Statement st=con.createStatement();
			System.out.println("\nDisplay bill master");
			ResultSet rs=st.executeQuery("select * from Bill_master");
			while(rs.next())
			{
				System.out.println(rs.getInt("bill_no")+"\t"+rs.getString("Customer_name")+"\t"+rs.getInt("amount"));
			}
			
			CallableStatement cs=con.prepareCall("{call bill_delete(?)}");
			Scanner sc=new Scanner(System.in);
			cs.setInt(1, sc.nextInt());
			sc.close();
			int isert=cs.executeUpdate();
			Statement st1=con.createStatement();
			System.out.println("\nDisplay bill master");
			
			ResultSet rs1=st1.executeQuery("select * from Bill_master");
			ResultSetMetaData rsmd=rs.getMetaData();
			int n=rsmd.getColumnCount();
			System.out.println(n);
			while(rs1.next())
			{
				System.out.println(rs1.getInt("bill_no")+"\t"+rs1.getString("Customer_name")+"\t"+rs1.getInt("amount"));
			}
		}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			catch(ClassNotFoundException e1)
			{
				e1.printStackTrace();
			}
		finally
		{
			try
			{
				con.close();
			}
			catch(SQLException e2)
			{
				e2.printStackTrace();
			}
		}
			
		
	}


}
