package Autoit;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Robotclasswindow {
@Test
public void download() throws InterruptedException, AWTException
{
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("http://seleniumhq.org");
	driver.findElement(By.linkText("Download")).click();
	driver.findElement(By.linkText("2.48.2")).click();
	Thread.sleep(3000);
	Robot rb=new Robot();
	rb.keyPress(KeyEvent.VK_TAB);
	rb.keyRelease(KeyEvent.VK_TAB);
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
}
}
