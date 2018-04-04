package TestPack;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test2 {
	
	@BeforeSuite(groups= {"QA", "UAT"})
	public static void test1()
	{
		System.out.println("First11111111");
	}
	
	@AfterSuite(groups={"QA", "UAT"})
	public static void test2()
	{
		System.out.println("First22222222222222");
	}
	
	@Test(groups="UAT")
	public static void test3()
	{
		System.out.println("First3333333333333333");
	}

}
