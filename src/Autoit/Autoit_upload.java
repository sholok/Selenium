package Autoit;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Autoit_upload {
	@Test
	public void upload() throws AWTException, IOException
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://imgur.com");
		driver.findElement(By.className("upload-btn-text")).click();
		driver.findElement(By.id("upload-global-file")).click();
		java.lang.Runtime.getRuntime().exec("c:\\Users\\Shobha\\desktop\\upload.exe");
	}
}
