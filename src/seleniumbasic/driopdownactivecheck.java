package seleniumbasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class driopdownactivecheck {

	public static void main(String[] args) {
	ProfilesIni pr=new ProfilesIni();
	FirefoxProfile fp=pr.getProfile("seleniumuser");
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("http://newtours.demoaut.com");
	driver.findElement(By.linkText("REGISTER")).click();
	WebElement drop=driver.findElement(By.name("country"));
	List<WebElement> dropdown=driver.findElements(By.tagName("option"));
	for(int i=0;i<=dropdown.size();i++)
	{
		dropdown.get(i).click();
		if(dropdown.get(i).isSelected())
		{
			System.out.println(dropdown.get(i).getText()+ "is active");
		}
		else
		{
			System.out.println(dropdown.get(i).getText() + "is not active");
		}
	}
	
	
	}
}
