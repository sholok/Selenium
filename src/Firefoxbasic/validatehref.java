package Firefoxbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class validatehref {

	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("seleniumuser");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://bing.com");
		String expurl=driver.findElement(By.linkText("VIDEOS")).getAttribute("href");
		driver.findElement(By.linkText("VIDEOS")).click();
		String acturl=driver.getCurrentUrl();
		if(acturl.contains(expurl))
		{
			System.out.println("working correctly");
		}
		else
		{
			System.out.println("not working correctly");
		}
		

	}

}
