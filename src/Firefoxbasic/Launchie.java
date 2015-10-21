package Firefoxbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Launchie {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver","C:\\IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.get("http://google.com");

	}
 
}
