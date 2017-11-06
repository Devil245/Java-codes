package com.atos.java.jdbc;

import java.sql.*;

public class Jdbcdemo {
	private static final String url="jdbc:oracle:thin:@localhost:1521:xe";
	private static final String uid="hr";
	private static final String pwd="hr";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con=null;
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection(url,uid,pwd);
			Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY,ResultSet.CLOSE_CURSORS_AT_COMMIT);
			//ResultSet rs=st.executeQuery("Select * from countries");
			st.executeUpdate("Update countries set COUNTRY_NAME='USA' where Country_id='US' ");
			ResultSet rs1=st.executeQuery("Select * from countries");
//			while(rs1.next())
//			{
//				String id=rs1.getString("COUNTRY_ID");
//				String name=rs1.getString("COUNTRY_NAME");
//				System.out.println(id+" "+name);
//			}			
			
			
			//st.executeUpdate("create table Bill_master(bill_no number(4),customer_name varchar2(20),amount number(5))");
//		rs1.first();
//		String id=rs1.getString("COUNTRY_ID");
//		String name=rs1.getString("COUNTRY_NAME");
//		System.out.println(id+" "+name);
//			rs1.last();
//			String id=rs1.getString("COUNTRY_ID");
//			String name=rs1.getString("COUNTRY_NAME");
//			System.out.println(id+" "+name);
//			rs1.previous();
//			String id=rs1.getString("COUNTRY_ID");
//			String name=rs1.getString("COUNTRY_NAME");
//			System.out.println(id+" "+name);
//			rs1.beforeFirst();
//			String id=rs1.getString("COUNTRY_ID");
//			String name=rs1.getString("COUNTRY_NAME");
//			System.out.println(id+" "+name);
//			rs1.afterLast();
//			String id=rs1.getString("COUNTRY_ID");
//			String name=rs1.getString("COUNTRY_NAME");
//			System.out.println(id+" "+name);

			rs1.next();
			rs1.relative(3);
			String id=rs1.getString("COUNTRY_ID");
			String name=rs1.getString("COUNTRY_NAME");
			System.out.println(id+" "+name);
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
