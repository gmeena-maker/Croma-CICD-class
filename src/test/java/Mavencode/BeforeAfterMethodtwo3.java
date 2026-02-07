package Mavencode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethodtwo3 {
	WebDriver driver;
	WebElement userId;
	WebElement password;
	@BeforeMethod
	public void browserOpen()
	{
	     driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	    userId = driver.findElement(By.name("email"));
	    password = driver.findElement(By.name("pass"));
	}
@Test
public void testcase1()
{
	 userId.sendKeys("valid@gmail.com");
	  password.sendKeys("123@123");
}

@Test
public void testcase2()
{
	 userId.sendKeys("valid@gmail.com");
	  password.sendKeys("123@123");
}

@Test
public void testcase3()
{
	 userId.sendKeys("valid@gmail.com");
	  password.sendKeys("123@123");
}
@AfterMethod
public void browserClose()
{
	driver.close();
}
}
