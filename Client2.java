package com.lara;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Client2 {

	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "12345");
		Statement stmt = con.createStatement();
		String s1 = "CREATE TABLE PERSON (ID NUMBER, NAME VARCHAR2(90), AGE NUMBER)";
		stmt.execute(s1);
		System.out.println("done");
		stmt.close();
		con.close();
		

	}

}
