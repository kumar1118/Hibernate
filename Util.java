package com.app1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Util 
{
	public static Statement getStatement() throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "12345");
		Statement stmt = con.createStatement();
		return stmt;
	}
}
