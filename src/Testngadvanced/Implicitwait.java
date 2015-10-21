package Testngadvanced;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Implicitwait {
FirefoxDriver driver;
@BeforeMethod
public void setup()
{
	ProfilesIni pr=new ProfilesIni();
	FirefoxProfile fp=pr.getProfile("seleniumuser");
	driver=new FirefoxDriver();
	driver.get("http://www.24hourfitness.com/not-yet-member.html");
	
}
@
Test
public void implicit()
{
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	//xpath of learn more
	driver.findElement(By.xpath("html/body/div[3]/div[2]/div/div[1]/div[4]/a")).click();
	
	
}
}
