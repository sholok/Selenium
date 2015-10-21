 package testsuite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Links extends Launch {
@Test
public void Linkstestin()
{
	List<WebElement> links=driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	for(int i=0;i<links.size();i++)
	{
		System.out.println(links.get(i).getText());
		links.get(i).click();
		driver.navigate().back();
		links=driver.findElements(By.tagName("a"));
		
	}
}
}
