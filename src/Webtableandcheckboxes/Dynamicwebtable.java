package Webtableandcheckboxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Dynamicwebtable {
	FirefoxDriver driver;
	@BeforeMethod
	public void setup()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("seleniumuser");
		driver=new FirefoxDriver();
		driver.get("http://www.timeanddate.com/worldclock/");
	}

	@Test
	public void dynamictable()
	{
		WebElement table=driver.findElement(By.xpath("html/body/div/div[7]/section[2]/div[1]/table/tbody/tr[2]/td[1]/a"));
		List<WebElement> row=driver.findElements(By.tagName("tr"));
		
		for(int i=0;i<row.size();i++)
		{
			List<WebElement> col=driver.findElements(By.tagName("td"));
			for(int j=0;j<col.size();j++)
			{
				System.out.print(col.get(j).getText()+"   ");
				
			}
			System.out.println();
	   }
  
   }
}