package com.lara;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class M1 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException
	{
		//1. Driver Registration or loading a driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//2. connection establishment
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "12345");
		
		//3. crate statement object to send commmand to the database
		
		Statement stmt = con.createStatement();
		
		//4. prepared sql comand
		String sql = "CREATE TABLE JDBC_TEST(SNO NUMBER, AGE NUMBER)";
		//TRIGGING sql comand
		stmt.execute(sql);
		
		System.out.println("done");
		//6. close db resource
		stmt.close();
		con.close();

	}

}
