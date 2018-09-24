package com.lara;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.Buffer;
import java.sql.Statement;

public class Client6 {

	public static void main(String[] args) throws Exception
	{
		Statement stmt = Util.getStatement();
		FileReader fin = new FileReader("data.txt");
		BufferedReader bin = new BufferedReader(fin);
		String id, name, age, fields[], record,sql;
		record = bin.readLine();
		while(record != null)
		{
			fields = record.split("\\|");
			id = fields[0];
			name = fields[1];
			age = fields[2];
			sql = "INSERT INTO PERSON VALUES("+id+", '"+name+"', "+age+")";
			stmt.execute(sql);
			record = bin.readLine();	
		}
       stmt.close();
       System.out.println("done");
	}
}
