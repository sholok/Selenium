package Pageobjectmodel;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Pomcontrol1 {
	
	@Test
	public void pomtest()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("seleniumuser");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://newtours.demoaut.com");
		WelcomemercuryTours wm=PageFactory.initElements(driver, WelcomemercuryTours.class);
		wm.findAflight("admin", "123");
		driver.navigate().back();
		wm.menu.register();
	}

}
