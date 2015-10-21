package Databasetesting;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Log4j {
	
	public static Logger log=Logger.getLogger(Log4j.class);

	public static void main(String[] args) {
		DOMConfigurator.configure("log4j.xml");
		FirefoxDriver driver=new FirefoxDriver();
		log.info("Browser launched");
		driver.get("http://gmail.com");
		log.info("Navigate to gmail");
		driver.findElement(By.name("Email")).sendKeys("sholok7");
		log.info("Enterred username");
		driver.findElement(By.id("next")).click();
		log.info("clicked on next button");;
		driver.findElement(By.id("Passwd")).sendKeys("asas");
		log.info("Enetered the password");
		driver.findElement(By.id("signIn")).click();
		log.info("Clicked the sign in");
		

	}

}
