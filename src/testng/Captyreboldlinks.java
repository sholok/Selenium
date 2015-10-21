package testng;

import java.util.List;

import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Captyreboldlinks {
FirefoxDriver driver;
@BeforeMethod
public void setup()
{
	ProfilesIni pr=new ProfilesIni();
	FirefoxProfile fp=pr.getProfile("seleniumuser");
	driver=new FirefoxDriver();
	driver.get("http://news.google.co.in");
	
}
@Test
public void boldlinks()
{
	List<WebElement> headerlinks=driver.findElements(By.xpath("//h2/a/span[@class='titletext']"));
	System.out.println(headerlinks.size());
	for(int i=0;i<headerlinks.size();i++)
	{
		System.out.println(headerlinks.get(i).getText());
	}	
	}
}  

