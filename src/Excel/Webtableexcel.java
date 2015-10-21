package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Webtableexcel {
	FirefoxDriver driver;
	@BeforeMethod
	public void setup()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("seleniumuser");
		driver=new FirefoxDriver();
		driver.get("http://www.timeanddate.com/worldclock/");
	}
	
	@Test
	public void Worldclockexcel() throws IOException
	{
		FileInputStream fp=new FileInputStream("C:\\Users\\Shobha\\Desktop\\clock.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fp);
		XSSFSheet ws=wb.getSheet("sheet1");
		Row r=null;
		WebElement table=driver.findElement(By.xpath("html/body/div/div[7]/section[2]/div[1]/table/tbody/tr[2]/td[1]/a"));
		List<WebElement> rows=driver.findElements(By.tagName("tr"));
		for(int i=0;i<rows.size();i++)
		{
		List<WebElement> col=driver.findElements(By.tagName("td"));
		r=ws.createRow(i);
		for(int j=0;j<col.size();j++)
		{
			r.createCell(j).setCellValue(col.get(j).getText());
		}	
		}
		FileOutputStream fp1=new FileOutputStream("C:\\Users\\Shobha\\Desktop\\clock.xlsx");
		wb.write(fp1);
		fp1.close();
	}
		
		
	

}
