package Testngadvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Capchacodeautomation {
	FirefoxDriver  driver;
	@BeforeMethod
	public void setUp()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("SeleniumUser");
		driver=new FirefoxDriver(fp);
		driver.get("http://www.harvard.edu/feedback");
	}
	
	@Test
	public void capcha() throws InterruptedException
	{
		driver.findElement(By.id("edit-submitted-name")).sendKeys("test1");
		driver.findElement(By.id("edit-submitted-email")).sendKeys("test123@gmail.com");
		driver.findElement(By.id("edit-submitted-comment")).sendKeys("simple msg");
		String eqa=driver.findElement(By.xpath(".//*[@id='webform-client-form-1884']/div/fieldset/div/div[2]/span")).getText();
		String [] a=eqa.split(" ") ;
		int x=Integer.parseInt(a[0]);
		int y=Integer.parseInt(a[1]);
		int z=x+y;
		String str=Integer.toString(z);
		driver.findElement(By.id("edit-captcha-response")).sendKeys(str);
		Thread.sleep(3000);
		
	}
}
