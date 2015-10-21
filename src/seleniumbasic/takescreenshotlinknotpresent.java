package seleniumbasic;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class takescreenshotlinknotpresent {

	public static void main(String[] args) throws IOException {
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("http://google.com");
		driver.findElement(By.xpath(".//*[@id='lst-ib']")).sendKeys("QEDGE");
		driver.findElement(By.xpath(".//*[@id='lst-ib']")).click();
		
	    List<WebElement> links=driver.findElements(By.linkText("QEDGE"));	
	    if((links.size())==0)
	    {
	    	File scrfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    	FileUtils.copyFile(scrfile, new File("C:\\Users\\Shobha\\Desktop\\qedge1.png"));
	    }
	    else
	    {
	    	driver.findElement(By.linkText("QEDGE")).click();
	    	
	    }	

	}

}
