package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Automatesliderbar {
FirefoxDriver driver;
@BeforeMethod
public void setup()
{
	ProfilesIni pr=new ProfilesIni();
	FirefoxProfile fp=pr.getProfile("seleniumuser");
	driver=new FirefoxDriver();
	driver.get("https://jqueryui.com/slider/#slider-vertical");
}
@Test
public void Slidebar()
{
	Actions action=new Actions(driver);
	driver.switchTo().frame(0);
	driver.manage().window().maximize();
	WebElement slider=driver.findElement(By.xpath(".//*[@id='slider-vertical']"));
	int y=slider.getLocation().y;
	action.dragAndDropBy(slider, 10, y).build().perform();
	
	
}
}
