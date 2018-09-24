package com.lara;
class Hi
{
	public Hi()
	{
		System.out.println("Hi()");
	}
	public Hi(String st)
	{
		System.out.println("Hi(string)");
	}
	static
	{
		System.out.println("SIIB-I");
	}
}
public class Hello extends Hi
{
	public Hello() 
	{
		System.out.println("Hello()");
	}
	static
	{
		System.out.println("SIB-II");
	}
	public Hello(String s1) 
	{
		System.out.println("Hello(string)");
	}
	public static void main(String[] args) 
	{
		new Hello("hello");
	}
}
//SIB-I