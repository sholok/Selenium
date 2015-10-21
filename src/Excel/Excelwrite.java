package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelwrite {

	public static void main(String[] args) throws IOException {
		FileInputStream f=new FileInputStream("C:\\Users\\Shobha\\Desktop\\write.xlsx");
		
				
				XSSFWorkbook wb=new XSSFWorkbook(f);
				XSSFSheet ws=wb.getSheet("Sheet1");
				Row r=null;
				Cell c=null;
				r=ws.getRow(0);
				c=r.getCell(1);
				c.setCellValue("Newvalue");
				
				r=ws.getRow(1);
				c=r.createCell(2);
				c.setCellValue("Newcell");
				
				r=ws.createRow(2);
				c=r.createCell(0);
				c.setCellValue("Newrowcol");
				
   FileOutputStream f1=new FileOutputStream("C:\\Users\\Shobha\\Desktop\\write.xlsx");
   wb.write(f1);
   f1.close();
	}

}
