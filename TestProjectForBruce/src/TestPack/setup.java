package TestPack;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class setup {
public static WebDriver driver;
	
	public static WebDriver getDriver() {
		return driver;
	}

	@BeforeSuite
	public void setup() 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("disable extension");
		driver=new ChromeDriver(option);
	 	driver.manage().window().maximize();
	 	
	 	
	}
	
}
