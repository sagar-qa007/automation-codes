import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainClass {

	public static void main(String[] args) {
		
		try {
			
			  // declaration and instantiation of objects/variables
	    	System.setProperty("webdriver.gecko.driver","geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			//comment the above 2 lines and uncomment below 2 lines to use Chrome
			//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
			//WebDriver driver = new ChromeDriver();
	    	
	        String baseUrl = "https://www.mailinator.com";
	       // String expectedTitle = "Welcome: Mercury Tours";
	       // String actualTitle = "";

	        // launch Fire fox and direct it to the Base URL
	        driver.get(baseUrl);

	        driver.findElement(By.id("inboxfield")).sendKeys("DMS19591671@mailinator.com");
	        
	        driver.findElement(By.xpath("/html/body/section[1]/div/div[3]/div[2]/div[2]/div[1]/span/button")).click();
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("//*[text()='Activate your CreditLane account']")).click();
	        
	        Thread.sleep(2000);
	        
	        driver.switchTo().frame("msg_body");
	        
	        driver.findElement(By.xpath("//a[text()='click here']")).click();
	        
	        Thread.sleep(20000);
	        
	        driver.switchTo().defaultContent();

	        //close Fire fox
	        driver.close();
	       
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
