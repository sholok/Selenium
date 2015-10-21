package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class dropdown1 {

	public static void main(String[] args) {
	ProfilesIni pr=new ProfilesIni();
	FirefoxProfile fp=pr.getProfile("seleniumuser");
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("http://amazon.in");
	driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry potter");
	driver.findElement(By.className("nav-input")).click();
	
	

	}

}
