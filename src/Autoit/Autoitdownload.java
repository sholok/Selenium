package Autoit;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Autoitdownload {
	@Test
	public void download() throws InterruptedException, AWTException, IOException
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://seleniumhq.org");
		driver.findElement(By.linkText("Download")).click();
		driver.findElement(By.linkText("2.48.2")).click();
		Thread.sleep(3000);
		java.lang.Runtime.getRuntime().exec("c:\\Users\\Shobha\\desktop\\download.exe");

}
}