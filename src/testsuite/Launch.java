package testsuite;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Launch {
FirefoxDriver driver=null;
@BeforeClass
public void launch()
{
ProfilesIni pr=new ProfilesIni();
FirefoxProfile fp=pr.getProfile("seleniumuser");
driver=new FirefoxDriver(fp);
driver.get("http://newtours.demoaut.com");
}


@AfterClass
public void closeapp()
{
	driver.close();
	
}
}