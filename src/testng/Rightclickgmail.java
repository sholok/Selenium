package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Rightclickgmail {
FirefoxDriver driver;	
@BeforeMethod
public void setup()
{
	ProfilesIni pr=new ProfilesIni();
	FirefoxProfile fp=pr.getProfile("seleniumuser");
	driver=new FirefoxDriver(fp);
	driver.get("http://google.com");
	
}

@Test
public void Rightclick()
{
	Actions action=new Actions(driver);
	WebElement event=driver.findElement(By.linkText("Gmail"));
	action.contextClick(event).sendKeys("L").build().perform();
			
}
}
