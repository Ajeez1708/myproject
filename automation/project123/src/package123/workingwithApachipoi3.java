package package123;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class workingwithApachipoi3
{
public static void main(String[] args) throws IOException 
	{
	FileInputStream fis=new FileInputStream("c:\\Users\\hp\\Desktop\\Book2.xlsx");
	XSSFWorkbook wbo=new XSSFWorkbook(fis);
	XSSFSheet wso=wbo.getSheet("sheet1");
	Row r;
	for(int i=0;i<0;i++)
	{	
	r=wso.createRow(i);
	r.createCell(0).setCellValue("Automation Testing");
	}
	FileOutputStream fos=new FileOutputStream("c:\\Users\\hp\\Desktop\\Book2.xlsx");
	wbo.write(fos);
	}

}
