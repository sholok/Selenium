package Grid;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Grid1 {

	 
		FirefoxDriver driver;
		
		@BeforeMethod
		public void setup()
		{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		}
		@Test
		public void logintest()
		{
			driver.findElement(By.name("userName")).sendKeys("admin");
			driver.findElement(By.name("password")).sendKeys("admin");
			driver.findElement(By.name("login")).click();
		}
		



}
