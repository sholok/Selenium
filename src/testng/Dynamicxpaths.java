package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Dynamicxpaths {
	FirefoxDriver  driver;
	@BeforeMethod
	public void setUp()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("seleniumuser");
		driver=new FirefoxDriver(fp);
		driver.get("http://yahoo.com");
	}
	
	@Test
	public void xpathTest()
	{
		//driver.findElement(By.xpath("//*[starts-with(@id,'yui_3_12_0_1_14315')]/div/ol/li[6]/a")).click();
		driver.findElement(By.xpath("//*[starts_with(@id,'yui_3_8_1_1_144415')]/1310")).click();
	}

}


