package package123;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class workingwithApachepoi2
{
public static void main(String[] args) throws IOException 
	{
	FileInputStream fis=new FileInputStream("c:\\Users\\hp\\Desktop\\Book2.xlsx");
	XSSFWorkbook wbo=new XSSFWorkbook(fis);
	XSSFSheet wso=wbo.getSheet("sheet1");
	Row r;
	r=wso.createRow(1);
	r.createCell(3).setCellValue("Selenium Testing");
	FileOutputStream fos=new FileOutputStream("c:\\Users\\hp\\Desktop\\Book2.xlsx");
	wbo.write(fos);

	}

}
