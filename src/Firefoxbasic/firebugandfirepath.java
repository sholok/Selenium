package Firefoxbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firebugandfirepath {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
      //  driver.findElement(By.id("gmail-sign-in")).click();
       // Thread.sleep(40000);
		driver.findElement(By.id("Email")).sendKeys("sholok7");
		driver.findElement(By.id("next")).click();
		Thread.sleep(40000);
		driver.findElement(By.id("Passwd")).sendKeys("asasas");
				
		driver.findElement(By.id("signIn")).click();
		
	}

}
