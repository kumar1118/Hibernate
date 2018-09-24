package com.app1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Client3 {

	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "12345");
		Statement stmt = con.createStatement();
		String s1 = "INSERT INTO PERSON VALUES(1, 'VIJAY ', 23)";
		stmt.execute(s1);
		System.out.println("done");
		stmt.close();
		con.close();
	}

}
