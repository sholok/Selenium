package Grid;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Grid2 {
	FirefoxDriver driver;
	@BeforeMethod
	public void setup()
	{
	driver=new FirefoxDriver();
	//driver.get("http://newtours.demoaut.com");
	}
    @Parameters("browser")
	@Test
	public void Linkstestin(String b)
	{  
    	System.out.println(b);
    	DesiredCapabilities cap=null;
    	if(b.equals("firefox"))
    	{
    		DesiredCapabilities.firefox();
    		cap.setBrowserName("firefox");
    		cap.setPlatform(Platform.WINDOWS);
    	}
    	if(b.equals("chrome"))
    	{
    		DesiredCapabilities.chrome();
    		cap.setBrowserName("chrome");
    		cap.setPlatform(Platform.WINDOWS);
    	}
    	
    	RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
    	driver.get("http://newtours.demoaut.com");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
			links.get(i).click();
			driver.navigate().back();
			links=driver.findElements(By.tagName("a"));
			
		}

}
}
