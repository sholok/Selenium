package Datadriventesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

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

public class Datadrivenajax {
	
	FirefoxDriver driver;
	@BeforeMethod
	public void setup()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("seleniumuser");
		driver=new FirefoxDriver();
		driver.get("https://care.ideacellular.com/wps/portal/account/express-paybill");
		
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
			String phno=r.getCell(0).getStringCellValue();
			driver.findElement(By.id("ns_Z7_JH56H4K0KOIPA0ASI08BTI30O5_mobileNumber")).sendKeys(phno);
            driver.findElement(By.id("ns_Z7_JH56H4K0KOIPA0ASI08BTI30O5_confmobileNo")).click();
            WebElement ajax=driver.findElement(By.xpath("//*[@id='errorHolder']/label"));
            String actajax=null;
            if(ajax.getText().isEmpty())
            {
                actajax="No Ajax";
           
            }
            else
            {
                actajax=ajax.getText();
               
            }
          r.createCell(2).setCellValue(actajax);
          String expajax=r.getCell(1).getStringCellValue();
          if(actajax.equals(expajax))
          {
              r.createCell(3).setCellValue("Passed");
          }
          else
          {
              r.createCell(3).setCellValue("Failed");
          }
             
          driver.findElement(By.id("ns_Z7_JH56H4K0KOIPA0ASI08BTI30O5_mobileNumber")).clear();
        }   
        FileOutputStream f2=new FileOutputStream("C:\\Users\\Shobha\\workspace\\Selenium webdriver\\src\\com\\selenium\\resultexcelfiles\\Ajaxdata.xlsx");
          wb.write(f2);
          f2.close();
  }
 
}



