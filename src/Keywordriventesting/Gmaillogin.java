package Keywordriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Gmaillogin {
	FirefoxDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("http://gmail.com");
	}
	
	@Test
	public void gmail() throws IOException, InterruptedException
	{
		FileInputStream f1=new FileInputStream("C:\\Users\\Shobha\\workspace\\Selenium webdriver\\Login.properties");
		Properties p=new Properties();
		p.load(f1);
		driver.findElement(By.id(p.getProperty("txt_username"))).sendKeys("sholok7");
		driver.findElement(By.id(p.getProperty("btn_next"))).click();
		Thread.sleep(3000);
		driver.findElement(By.id(p.getProperty("txt_password"))).sendKeys("1234");
		driver.findElement(By.id(p.getProperty("btn_signin"))).click();
	}

}
