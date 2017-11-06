package com.atos.java.jdbc;
import java.sql.*;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
public class Rowsetex {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stu

				//Connection con=null;
				try{
					//Class.forName("oracle.jdbc.OracleDriver");
					//con=DriverManager.getConnection(url,uid,pwd);
				
					//st.executeUpdate("create table Bill_master(bill_no number(4),customer_name varchar2(20),amount number(5))");
					JdbcRowSet rs=RowSetProvider.newFactory().createJdbcRowSet();
					rs.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
					rs.setUsername("hr");
					rs.setPassword("hr");
					rs.setCommand("Select * from countries");
					
					rs.execute();
					while(rs.next())
					{
						System.out.println(rs.getString("Country_id")+"\t"+rs.getString("Country_name"));
					}
				}
					catch(SQLException e)
					{
						e.printStackTrace();
					}
//					catch(ClassNotFoundException e1)
//					{
//						e1.printStackTrace();
//					}
//				finally
//				{
//					try
//					{
//						con.close();
//					}
//					catch(SQLException e2)
//					{
//						e2.printStackTrace();
//					}
//				}
					
				
			}

		



	}

