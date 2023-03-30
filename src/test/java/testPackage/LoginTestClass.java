package testPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.annotation.PropertyKey;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pompackage1.LogInPage;
import testUtility.ReadFileData;



public class LoginTestClass extends BaseClass{
	LogInPage login;
	ReadFileData r;
	
	@BeforeMethod
	public void beforeMethod()
	{
		 login = new LogInPage(driver);
		System.out.println("beforeMethod of Class1");
		
		
	}
	
	@Test
	public void VerifyLoginFunctionalityWithCorrectData() throws InterruptedException, EncryptedDocumentException, IOException
	{	
		logger= report.createTest("Verify login functionality with correct data");
		SoftAssert s= new SoftAssert();
	
		  login.sendUsername("Admin");
		  
		  login.sendPassword("admin123"); 
		  login.ClickOnLoginButton();
		  
		  Thread.sleep(3000);
//		  String ExpectedURL="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard";
//		  String CurrentURL= driver.getCurrentUrl();
	
		  boolean result=login.CheckVisiblityofAdminTab();
		 // Assert.assertEquals(CurrentURL,ExpectedURL );
		
		 // s.assertEquals(CurrentURL, ExpectedURL);  //fail
		
		System.out.println("Soft Assert is executed");
		
		  Assert.assertTrue(result);  //pass
		
		  System.out.println("Test case ENDED");
		  
		  s.assertAll();
		 //logger.pass("Test case is pass");

	}
	
	@Test
	public void VerifyLoginFunctionalityWithInCorrectData ()
	{
		logger= report.createTest("Verify login functionality with incorrect data");
//		  login.sendUsername("admin");
//		  login.sendPassword("admin1234"); 
//		  login.ClickOnLoginButton();
		
		System.out.println("VerifyLoginFunctionalityWithInCorrectData");
		Assert.fail();
	}
	
	
	
}
