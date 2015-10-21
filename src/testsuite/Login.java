package testsuite;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login extends Launch{
@Test
public void logintest()
{
	driver.findElement(By.name("userName")).sendKeys("admin");
	driver.findElement(By.name("password")).sendKeys("admin");
	driver.findElement(By.name("login")).click();
}
}
