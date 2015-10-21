package Webtableandcheckboxes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Javascriptexecuter {
FirefoxDriver driver;
@BeforeMethod
public void setup()
{
	ProfilesIni pr=new ProfilesIni();
	FirefoxProfile fp=pr.getProfile("seleniumuser");
	driver=new FirefoxDriver();
	driver.get("http://google.com");
}

@Test
public void javascriptexecutermethods() throws InterruptedException
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	js.executeScript("alert('hello world');");
	Thread.sleep(4000);
	Alert alert=driver.switchTo().alert();
	alert.accept();
	Thread.sleep(2000);
	driver.executeScript("history.go(0)");
    driver.get("http:hdfcbank.com");   
    WebElement event=driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[2]/ul/li[4]/div[2]/div[2]/div[2]/div[1]/div/ul/li[4]/a"));
   //System.out.println(event.getText());
    js.executeScript("arguments[0].click();",event);

	
}

}
