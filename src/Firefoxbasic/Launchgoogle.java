package Firefoxbasic;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launchgoogle {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");

	}

}
