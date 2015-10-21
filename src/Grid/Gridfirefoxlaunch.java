package Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Gridfirefoxlaunch {
	@Test
	public void test() throws MalformedURLException, InterruptedException
	{
DesiredCapabilities cap=null;
cap=DesiredCapabilities.firefox();
cap.setBrowserName("firefox");
cap.setPlatform(Platform.WINDOWS);
RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
driver.get("http://gmail.com");
driver.findElement(By.id("Email")).sendKeys("sholok7");
driver.findElement(By.id("next")).click();
Thread.sleep(3000);
driver.findElement(By.id("Passwd")).sendKeys("1234");
driver.findElement(By.id("signIn")).click();
}
}
