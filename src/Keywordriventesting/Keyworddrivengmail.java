package Keywordriventesting;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Keyworddrivengmail {
FirefoxDriver driver;
public void launchBrowser()
{
	driver=new FirefoxDriver();
}

public void navigate()
{
	driver.get("http://gmail.com");
}

public void enterUsername(String locator)
{
	driver.findElement(By.id(locator)).sendKeys("sholok7");
}
public void clickNext(String locator)
{
	driver.findElement(By.id(locator)).click();
}

public void EnterPassword(String locator)
{
	driver.findElement(By.id(locator)).sendKeys("asas");
	
}
public void ClickLogin(String locator)
{
	driver.findElement(By.id(locator)).click();
}




}
