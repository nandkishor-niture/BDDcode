

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	static WebDriver driver;
	@BeforeTest
	public void firstTest() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://whenwise.com/sign-in");
	}
		
		@Test
		public void test4()
		{
			
		
		System.out.println("test2");
		String s1=driver.getCurrentUrl();
		System.out.println(s1);
		Assert.assertEquals("https://whenwise.com/sign-in", s1);
		
	}
	@Test
	public void Test2()
	{
		driver.findElement(By.linkText("Register"));
	
//		driver.findElement(By.id("email")).sendKeys("Test@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Test@1234");
		//driver.findElement(By.id("login-btn")).click();
		
	
	}
	@Test
	public void get()
	{
		System.out.println("Test");
	}
	

}
