package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) throws Exception {
		String driver="oracle.jdbc.OracleDriver";
		String jdbc_url="jdbc:oracle:thin:@localhost:1521:XE";
		String user="ankit";
		String pwd="ankit";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(jdbc_url,user,pwd);
		Statement st = con.createStatement();
		String sqlQuery="select * from first ";
		boolean flag= false;
		ResultSet rs =st.executeQuery(sqlQuery);
		System.out.println("ENAME\tAGE");
		System.out.println("--------------------------------------");
		while(rs.next())
		{
			flag=true;
			System.out.println(rs.getString(1)+"\t"+rs.getInt(2));
		}
		if(flag==false)
		{
			System.out.println("No Records found");
		}
		con.close();
		}

}
