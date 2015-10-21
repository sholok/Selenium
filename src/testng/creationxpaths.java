package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class creationxpaths {
FirefoxDriver driver;
@BeforeMethod
public void setup()
{
	ProfilesIni pr=new ProfilesIni();
	FirefoxProfile fp=pr.getProfile("seleniumuser");
	driver=new FirefoxDriver(fp);
	driver.get("http://facebook.com");
	
}
@Test
public void senddatetofacebook()
{
String[] str={"one","two","three","four","five","six","seven","eight","nine","ten"};
List<WebElement> input=driver.findElements(By.xpath("//input[@type='text' or @type='password' or @type='email']"));
System.out.println(input.size());
for(int i=0;i<=input.size();i++)
{
	input.get(i).sendKeys(str[i]);
}
}
} 