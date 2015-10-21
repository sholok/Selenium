package Firefoxbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchchrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shobha\\Desktop\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");

	}

}
