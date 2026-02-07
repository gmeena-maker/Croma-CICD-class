package Seleniumcode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seepasswordone3 {

	public static void main(String[] args){
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
        String ur1=driver.getCurrentUrl();
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        driver.findElement(By.linkText("Create a Page")).click();
        String ur2=driver.getCurrentUrl();
        System.out.println(ur2);
        System.out.println(ur1);
	}

}

