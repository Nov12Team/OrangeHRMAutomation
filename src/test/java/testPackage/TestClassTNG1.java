package testPackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testUtility.StaticBrowser;

public class TestClassTNG1 {
	
	@BeforeClass
	public void beforeClass()
	{
		
		System.out.println("beforeClass of Class1");   
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("beforeMethod of Class1");
	}
	
	@Test
	public void test1() throws InterruptedException
	{		System.out.println("test1 of of Class1");	}
	@Test
	public void test2 ()
	{		System.out.println("test2 of Class1"); }
	
	@Test
	public void test3 ()
	{		System.out.println("test3 of Class1"); }
	
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("afterClass of Class1");
	}
	

}
