package pompackage1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pomUtility.ElementWait;

public class LogInPage 
{
	static WebDriver driver;
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginButton;
	
	@FindBy(xpath="//span[contains(.,'Admin')]")
	private WebElement admin;
	
	
	public LogInPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void sendUsername(String uName) throws InterruptedException
	{
		
		//ElementWait.waitForElement("//input[@name='username']", 20, driver);
		
		Thread.sleep(2000);
		username.sendKeys(uName);
	}
	
	public void sendPassword(String pwd)
	{
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
		password.sendKeys(pwd);
	}
	
	public void ClickOnLoginButton()
	{
		loginButton.click();
	}
	
	public boolean compareCurrentURL()
	{
		String ExpectedURL="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard";
		String url= driver.getCurrentUrl();
		boolean result = ExpectedURL.equals(url);
		return result;
	}
	
	public boolean CheckVisiblityofAdminTab()
	{
		boolean result = admin.isDisplayed();
		return result;
		
	}
}
