package TestPack;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class login {
	
	
	WebDriver dri=null;
	setup s1=new setup();
	String expurl="http://diecastcarsales.yourwebsites.com.au/";
	
	@BeforeClass
	public void beforeclassLogin()
	{
	 
		try {
			dri=setup.getDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	@Test(priority=1)
	public void login()
	{
		
	try {
		dri.get("http://diecastcarsales.yourwebsites.com.au/");
		WebElement login=s1.getDriver().findElement(By.linkText("Log in"));
		login.click();
	} catch (Exception e) {
		e.printStackTrace();
	}
		
		
	}
	
	@Test(priority=2)
	public void blanklogin()
	{
		WebElement email=dri.findElement(By.name("Email"));
		email.sendKeys(" ");
		
		WebElement password=dri.findElement(By.name("Password"));
		password.sendKeys(" ");
		
		WebElement save=dri.findElement(By.className("login-button"));
		save.click();
		
		String currenturl=dri.getCurrentUrl();
		
		if(currenturl.equals(expurl))
		{
			Assert.assertTrue(false);
		}
		else
		{
			Assert.assertFalse(true);
		}
		
	}
	
	@Test(priority=3)
	public void blankemail()
	{
		WebElement email=s1.getDriver().findElement(By.name("Email"));
		email.clear();
		email.sendKeys(" ");
		
		WebElement password=s1.getDriver().findElement(By.name("Password"));
		password.clear();
		password.sendKeys("123456");
		
		WebElement save=s1.getDriver().findElement(By.className("login-button"));
		save.click();
		
		String currenturl=s1.getDriver().getCurrentUrl();
		
		if(currenturl.equals(expurl))
		{
			Assert.assertTrue(false);
		}
		else
		{
			Assert.assertFalse(true);
		}
		
	}
	@Test(priority=4)
	public void blankpass()
	{
		WebElement email=s1.getDriver().findElement(By.name("Email"));
		email.clear();
		email.sendKeys("soni.rutvi+15@tristonsoft.com");
		
		WebElement password=s1.getDriver().findElement(By.name("Password"));
		password.clear();
		password.sendKeys(" ");
		
		WebElement save=s1.getDriver().findElement(By.className("login-button"));
		save.click();
		
		String currenturl=s1.getDriver().getCurrentUrl();
		
		if(currenturl.equals(expurl))
		{
			Assert.assertTrue(false);
		}
		else
		{
			Assert.assertFalse(true);
		}
		
	}
	@Test(priority=5)
	public void invaliddata()
	{
		WebElement email=s1.getDriver().findElement(By.name("Email"));
		email.clear();
		email.sendKeys("sdfsdfd");
		
		WebElement password=s1.getDriver().findElement(By.name("Password"));
		password.clear();
		password.sendKeys("1fdfd");
		
		WebElement save=s1.getDriver().findElement(By.className("login-button"));
		save.click();
		
		String currenturl=s1.getDriver().getCurrentUrl();
		
		if(currenturl.equals(expurl))
		{
			Assert.assertTrue(false);
		}
		else
		{
			Assert.assertFalse(true);
		}
		
	}
	@Test(priority=6)
	public void validdata()
	{
		WebElement email=s1.getDriver().findElement(By.name("Email"));
		email.clear();
		email.sendKeys("soni.rutvi+15@tristonsoft.com");
		
		WebElement password=s1.getDriver().findElement(By.name("Password"));
		password.clear();
		password.sendKeys("creative2000");
		
		WebElement save=s1.getDriver().findElement(By.className("login-button"));
		save.click();
		
		String currenturl=s1.getDriver().getCurrentUrl();
		
		if(currenturl.equals(expurl))
		{
			
			assertEquals(currenturl, expurl);
			s1.getDriver().manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			WebElement myaccount=s1.getDriver().findElement(By.linkText("My Account"));
			myaccount.click();
			
			
		}
		
	
	}
	
	
	
	

}
