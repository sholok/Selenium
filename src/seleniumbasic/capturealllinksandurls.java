package seleniumbasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class capturealllinksandurls {

	public static void main(String[] args) {
		int c=0;
	ProfilesIni pr=new ProfilesIni();
	FirefoxProfile fp=pr.getProfile("seleniumuser");
	FirefoxDriver driver=new FirefoxDriver(fp);
	driver.get("http://google.com");
	List<WebElement> links=driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	for(int i=0;i<=links.size();i++)
	{
		if(!links.get(i).getText().isEmpty())
		{
			c++;
	System.out.println(links.get(i).getText());
	links.get(i).click();
	System.out.println(driver.getCurrentUrl());
	driver.navigate().back();
	links=driver.findElements(By.tagName("a"));
		}
	
	}
	
	System.out.println(c);	
	System.out.println(links.size()-c);

	}

}
