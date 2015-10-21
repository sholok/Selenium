package Datadriventesting;

import java.io.FileInputStream;
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

public class Datadrivenlinks {
	FirefoxDriver driver;
	@BeforeMethod
	public void setup()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("seleniumuser");
		driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
	}

	@Test
	public void register() throws IOException
	{
		FileInputStream f1=new FileInputStream("C:\\Users\\Shobha\\workspace\\Selenium webdriver\\src\\com\\selenium\\excelfiles\\links.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f1);
		XSSFSheet ws=wb.getSheet("sheet1");
		Row r=null;
		Iterator<Row> row=ws.iterator();
		row.next();
		while(row.hasNext())
		{
			r=row.next();
		    String linkname=r.getCell(0).getStringCellValue();
		    try
		    {
		    	driver.findElement(By.linkText(linkname)).click();
		    	String acturl=driver.getCurrentUrl();
		    	r.createCell(2).setCellValue(acturl);
		    	String expurl=r.getCell(1).getStringCellValue();
		    	if(acturl.contains(expurl))
		    	{
		    		r.createCell(3).setCellValue("Link correct");
		    	}
		    	else
		    	{
		    		r.createCell(3).setCellValue("Not correct");
		    	}
		    	
		    	driver.navigate().back();
		    }
		    catch(Exception e)
		    {
		    	r.createCell(3).setCellValue("Link not present");
		    	
		    }
		}   
		    FileOutputStream f2=new FileOutputStream("C:\\Users\\Shobha\\workspace\\Selenium webdriver\\src\\com\\selenium\\resultexcelfiles\\links.xlsx");
		    wb.write(f2);
		    f2.close();
		    	}
		    	}
		    


