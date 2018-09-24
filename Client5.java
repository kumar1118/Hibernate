package com.lara;

import java.sql.Statement;
import java.util.Scanner;

public class Client5
{
	public static void main(String[] args) throws Exception
	{
		Statement stmt = Util.getStatement();
		Scanner sc = new Scanner(System.in);
		String id, name, age, sql, decider;
		do
		{
			System.out.println("enter id");
			id = sc.next();
			System.out.println("enter name");
			name = sc.next();
			System.out.println("enter age");
			age = sc.next();
			sql = "INSERT INTO PERSON VALUES("+id+",'"+name+"',"+age+")";
			stmt.execute(sql);
			System.out.println("do you want to insert one more row(y/n)");
		}
		while("y".equals(sc.next()));
		stmt.close();
		System.out.println("done");
	}
}
