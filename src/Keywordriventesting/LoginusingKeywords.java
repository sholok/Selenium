package Keywordriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class LoginusingKeywords {
	@Test
	public void logintest() throws IOException
	{
	FileInputStream f1=new FileInputStream("C:\\Users\\Shobha\\workspace\\Selenium webdriver\\Login.properties");
	Properties p=new Properties();
	p.load(f1);
	Keyworddrivengmail keys=new Keyworddrivengmail();
	FileInputStream f2=new FileInputStream("C:\\Users\\Shobha\\workspace\\Selenium webdriver\\src\\com\\selenium\\keywords\\ActionKeywords.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(f2);
	XSSFSheet ws=wb.getSheet("sheet1");
	Row r=null;
	Iterator<Row> row=ws.iterator();
	row.next();
	while(row.hasNext())
	{
		r=row.next();
		String action=r.getCell(3).getStringCellValue();
		if(action.equals("launchBrowser"))
				{
			    keys.launchBrowser();
				}
		else if(action.equals("navigate"))
		{
			keys.navigate();
		}
		else if(action.equals("enterUsername"))
		{
			keys.enterUsername(p.getProperty("txt_username"));
			
		}
		else if(action.equals("clickNext"))
		{
			keys.clickNext(p.getProperty("btn_next"));
		}

		else if (action.equals("EnterPassword"))
		{
			keys.EnterPassword(p.getProperty("txt_password"));
		}
		else if(action.equals("ClickLogin"))
		{
			keys.ClickLogin(p.getProperty("btn_signin"));
		}	
	}		

		
	}
}
