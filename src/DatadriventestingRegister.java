import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DatadriventestingRegister {
FirefoxDriver driver;
@BeforeMethod
public void setup()
{
	ProfilesIni pr=new ProfilesIni();
	FirefoxProfile fp=pr.getProfile("seleniumuser");
	driver=new FirefoxDriver();
	driver.get("http://newtours.demoaut.com");
	driver.findElement(By.linkText("REGISTER")).click();
}

@Test
public void register() throws IOException
{
	FileInputStream f1=new FileInputStream("C:\\Users\\Shobha\\workspace\\Selenium webdriver\\src\\com\\selenium\\excelfiles\\registration.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(f1);
	XSSFSheet ws=wb.getSheet("sheet1");
	Row r=null;
	Iterator<Row> row=ws.iterator();
	row.next();
	while(row.hasNext())
	{
		r=row.next();
		driver.findElement(By.name("firstName")).sendKeys(r.getCell(0).getStringCellValue());
		driver.findElement(By.name("lastName")).sendKeys(r.getCell(1).getStringCellValue());
		driver.findElement(By.name("phone")).sendKeys(r.getCell(2).getStringCellValue());
		driver.findElement(By.name("userName")).sendKeys(r.getCell(3).getStringCellValue());
		driver.findElement(By.name("address1")).sendKeys(r.getCell(4).getStringCellValue());
		driver.findElement(By.name("city")).sendKeys(r.getCell(5).getStringCellValue());
		driver.findElement(By.name("state")).sendKeys(r.getCell(6).getStringCellValue());
		driver.findElement(By.name("postalCode")).sendKeys(r.getCell(7).getStringCellValue());
		driver.findElement(By.name("country")).sendKeys(r.getCell(8).getStringCellValue());
		driver.findElement(By.name("email")).sendKeys(r.getCell(9).getStringCellValue());
		driver.findElement(By.name("password")).sendKeys(r.getCell(10).getStringCellValue());
		driver.findElement(By.name("confirmPassword")).sendKeys(r.getCell(11).getStringCellValue());
		driver.findElement(By.name("register")).click();
		String x=driver.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
		if(x.contains(r.getCell(9).getStringCellValue()))
		{	
			r.createCell(12).setCellValue("Passed");
		}
		else
		{
			r.createCell(12).setCellValue("Failed");
		}	
		driver.navigate().back();
	}	
		FileOutputStream f2=new FileOutputStream("C:\\Users\\Shobha\\workspace\\Selenium webdriver\\src\\com\\selenium\\resultexcelfiles\\registration.xlsx");		
		wb.write(f2);
		f2.close();
		
	}
	
	
}

