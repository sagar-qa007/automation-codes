import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test(groups={"QA", "UAT"}, dataProvider = "Authentication")
	public static void test1(String sUsername, String sPassword)
	{
		System.out.println("First111"+sPassword);
	}
	
	@Test(groups="QA")
	public static void test2()
	{
		System.out.println("First2222");
	}
	
	@Test(groups="UAT")
	public static void test3()
	{
		System.out.println("First3333");
	}

	 @DataProvider(name = "Authentication")
	 
	  public static Object[][] credentials() {
	 
	        return new Object[][] { { "testuser_1", "Test@123" }, { "testuser_1", "Test@123" }};
	 
	  }
	 
}
