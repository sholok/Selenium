package Webtableandcheckboxes;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.Test;

public class Ajaxtesting {
FirefoxDriver driver;
public void setup()
{
	ProfilesIni pr=new ProfilesIni();
	FirefoxProfile fp=pr.getProfile("selenoimuser");
	driver=new FirefoxDriver();
	driver.get("http://google.com");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
@Test
public void ajax()
{
	driver.findElement(By.name("q")).sendKeys("selenium");
	WebElement block=driver.findElement(By.xpath("//*[@id='sbtc']/div[2]/div[2]/div[1]"));
    List<WebElement> ajax=block.findElements(By.xpath("//*[starts-with(@id,'sbse')]/div[2]/a"));
    System.out.println(ajax.size());
    for(int i=0;i<ajax.size();i++)
    {
    	System.out.println(ajax.get(i).getText());
    }
    	
}
}
