package com.atos.java.jdbc;

import java.sql.*;
import java.util.Scanner;

public class Preparedexample {
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
			PreparedStatement pst=con.prepareStatement("insert into Bill_master values(?,?,?)");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Values : ");
			pst.setInt(1, sc.nextInt());
			pst.setString(2,sc.next());
			pst.setInt(3, sc.nextInt());
			sc.close();
			int insertCount=pst.executeUpdate();
			System.out.println(insertCount);
			Statement st=con.createStatement();
			System.out.println("\nDisplay bill master");
			ResultSet rs=st.executeQuery("select * from Bill_master");
			ResultSetMetaData rsmd=rs.getMetaData();
			int n=rsmd.getColumnCount();
			System.out.println(n);
			for(int i=1;i<=n;i++)
			{
				System.out.println(rsmd.getCatalogName(i)+" "+rsmd.getColumnName(i)+" "+rsmd.getColumnTypeName(i));
			}
			while(rs.next())
			{
				System.out.println(rs.getInt("bill_no")+"\t"+rs.getString("Customer_name")+"\t"+rs.getInt("amount"));
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

