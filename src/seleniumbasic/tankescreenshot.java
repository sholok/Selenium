package seleniumbasic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;



public class tankescreenshot {

	public static void main(String[] args) throws IOException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		File scrfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrfile,new File("C:\\Users\\Shobha\\Desktop\\bbc1.png"));
		

	}

}
