package Firefoxbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class useprofiles {

	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("seleniumuser");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://google.com");
		driver.findElement(By.linkText("Gmail")).click();

	}

}
