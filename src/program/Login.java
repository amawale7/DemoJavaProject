package program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login 
{

	@Test
	public void test()
	{
		
		System.out.println("Start the test");
		System.out.println("Start the test");
		System.setProperty("webdriver.chrome.driver","E:\\Selenium All Driver\\chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		System.out.println("End the test");
		driver.quit();
	}
	
	
}
