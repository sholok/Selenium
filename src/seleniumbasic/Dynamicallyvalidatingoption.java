package seleniumbasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Dynamicallyvalidatingoption {

	public static void main(String[] args) {
	ProfilesIni pr=new ProfilesIni();
	FirefoxProfile fp=pr.getProfile("seleniumuser");
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("http://newtours.demoaut.com");
	driver.findElement(By.linkText("REGISTER")).click();
	WebElement drop=driver.findElement(By.name("country"));
	List<WebElement> dropdown=driver.findElements(By.tagName("option"));
	int a=myRandomNo(dropdown.size()-1);
	dropdown.get(a).click();
	if(dropdown.get(a).isSelected())
	{
		System.out.println(dropdown.get(a).getText()+"Is actiove");
	}
	
	else
	{
		System.out.println(dropdown.get(a).getText() +"Is not active");
	}
	
	
}




public static int myRandomNo(int x)
{
	double d=Math.random()*x;
	int a=(int)d;
	return a;
}
}