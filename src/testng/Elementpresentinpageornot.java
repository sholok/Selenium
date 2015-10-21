
package testng;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Elementpresentinpageornot {
	FirefoxDriver driver;
	@BeforeMethod
	public void setup()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("seleniumuser");
		driver=new FirefoxDriver();
		driver.get("https://en.wikipedia.org/wiki/Rajinikanth");
		
	}
	@Test
	public void element()
	{
		String str=driver.getPageSource();
		if(str.contains("Rajnikanth"))
		{
			System.out.println("Present");
		
		}
		else
		{
			System.out.println("Not present");
		}
	}


}
