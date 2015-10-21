package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Draganddrop {
FirefoxDriver driver;
@BeforeMethod
public void setup()
{
	ProfilesIni pr=new ProfilesIni();
	FirefoxProfile fp=pr.getProfile("seleniumuser");
    driver=new FirefoxDriver();
    driver.get("https://jqueryui.com/droppable/");
    
}
@Test
public void draganddrop()
{
	driver.switchTo().frame(0);
	Actions action=new Actions(driver);
	WebElement source=driver.findElement(By.id("draggable"));
	WebElement target=driver.findElement(By.id("droppable"));
	action.dragAndDrop(source, target).build().perform();
}

}
