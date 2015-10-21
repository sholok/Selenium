package Webtableandcheckboxes;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Datepickupfromcalenderwebtable {
	FirefoxDriver driver;
	@BeforeMethod
	public void setup()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("seleniumuser");
		driver=new FirefoxDriver();
		driver.get("http://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void calendertable()
	{
		driver.findElement(By.id("one_way_button1")).click();
		driver.findElement(By.id("from_typeahead1")).click();
		//driver.findElement(By.linkText("New Delhi, India (DEL)")).click();
		 driver.findElement(By.id("from_typeahead1")).sendKeys("New Delhi, India (DEL)");
		driver.findElement(By.id("to_typeahead1")).click();
		//driver.findElement(By.linkText("Hyderabad, India (HYD)")).click();
		driver.findElement(By.id("to_typeahead1")).sendKeys("Hyderabad, India (HYD)");
		driver.findElement(By.xpath(".//*[@id='start_date_sec']/span[2]")).click();
		
		String doj="11/08/2016";
		String[] a=doj.split("/");
		String[] months={"January","February","March","April","May","June","July","August","September","October","November","December"};
		int x=Integer.parseInt(a[1]);
		String month=months[x-1];
		String day=a[0];
		String year=a[2];
		String calyear=driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/div/div/span[2]")).getText();
		while(!calyear.equals(year))
		{
			driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[3]/div/a/span")).click();
			calyear=driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/div/div/span[2]")).getText();
			
		}
	
    String calmonth=driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/div/div/span[1]")).getText();
    while(!calmonth.equals(month))
    {
    	driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[3]/div/a/span")).click();
    	calmonth=driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/div/div/span[1]")).getText();
    }
    	Boolean flag=false;
		WebElement table=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		for(int i=0;i<rows.size();i++)
		{
			List<WebElement> cols=driver.findElements(By.tagName("td"));
			for(int j=0;j<cols.size();j++)
			{
				if(cols.get(j).getText().equals(day))
				{
					cols.get(j).click();
					flag=true;
					break;
				}
				
				}
			if(flag==true)
			{
				break;
			}
			
	  }
	}
}

    


