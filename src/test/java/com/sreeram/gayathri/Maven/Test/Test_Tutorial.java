package com.sreeram.gayathri.Maven.Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_Tutorial {
	
	
	public Test_Tutorial()
	{}

	@BeforeTest
public void beforetestFirst()
{
System.out.println("Before Test");	
}
	
@Test	
public void test1()
{
	System.out.println("Test1");
}
@Test
public void test2()
{
	System.out.println("Test2");
}
@Test
public void test3()
{
	System.out.println("Test3");
}
@Test
public void test4()
{
	System.out.println("Test4");
}

}
