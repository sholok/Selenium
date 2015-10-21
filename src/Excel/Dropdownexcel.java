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

public class Dropdownexcel {
	FirefoxDriver driver;
	@BeforeMethod
	public void Setup()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("seleniumuser");
		driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.findElement(By.linkText("REGISTER")).click();
	
	}
	
	@Test
	public void dropdownexcel() throws IOException
	{
		FileInputStream fp=new FileInputStream("C:\\Users\\Shobha\\Desktop\\drop.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fp);
	    XSSFSheet ws=wb.getSheet("sheet1");
	    Row r=null;
	    WebElement drop=driver.findElement(By.name("country"));
	    List<WebElement> droplist=driver.findElements(By.tagName("option"));
	    for(int i=0;i<droplist.size();i++)
	    {
	    	r=ws.createRow(i);
	        r.createCell(0).setCellValue(droplist.get(i).getText());
	        droplist.get(i).click();
	        if(droplist.get(i).isSelected())
	        {
	        	r.createCell(1).setCellValue("True");
	        }
	        else
	        {
	        	r.createCell(1).setCellValue("False");
	        }
	        
	    }
	    
	    FileOutputStream fp1=new FileOutputStream("C:\\Users\\Shobha\\Desktop\\drop.xlsx");
	    wb.write(fp1);
	    fp1.close();
	        }
	    	
	}
	


