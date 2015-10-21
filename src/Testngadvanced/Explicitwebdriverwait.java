package Testngadvanced;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Explicitwebdriverwait {
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
	public void Explicit()
	{
		WebDriverWait mywait=new WebDriverWait(driver, 30);
		//xpath of check prices that is to disappear
		
		mywait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("html/body/div[3]/div[2]/div/div[1]/div[1]/a")));
		
		//xpath of learn more
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[3]/div[2]/div/div[1]/div[4]/a"))).click();
		
		
	}

}
