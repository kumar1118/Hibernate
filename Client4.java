package com.app1;

import java.sql.Statement;

public class Client4 
{
	public static void main(String[] args) throws Exception
	{
		Statement stmt = Util.getStatement();
		String s1 = "INSERT INTO PERSON VALUES(2, 'RAMU', 45)";
		String s2 = "INSERT INTO PERSON VALUES(3, 'MAMU', 25)";
		String s3 = "INSERT INTO PERSON VALUES(4, 'RAMESH', 24)";
		stmt.execute(s1);
		stmt.execute(s2);
		stmt.execute(s3);
		System.out.println("done");
		stmt.close();
	}
}
