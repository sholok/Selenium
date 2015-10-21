package seleniumbasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class capturesetoflinksandurls {

	public static void main(String[] args) throws InterruptedException {
	ProfilesIni pr=new ProfilesIni();
	FirefoxProfile fp=pr.getProfile("seleniumuser");
	FirefoxDriver driver=new FirefoxDriver(fp);
	driver.get("http://pvrcinemas.com");
	WebElement block=driver.findElement(By.xpath("html/body/div[6]/div[1]/div[2]/div/ul/li[6]/a"));
	List<WebElement> links=driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	for(int i=0;i<links.size();i++)
	{
		System.out.println(links.get(i).getText());
		links.get(i).click();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		Thread.sleep(3000);
		block=driver.findElement(By.xpath("html/body/div[6]/div[1]/div[2]/div/ul/li[6]/a"));
	    links=driver.findElements(By.tagName("a"));
		
		
	}


	}

}
