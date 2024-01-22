package mypackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class workingwithApachePOI
{

	public static void main(String[] args) throws IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\hp\\Desktop\\Book2.xlsx");
		XSSFWorkbook wbo=new XSSFWorkbook(fis);
		XSSFSheet wso=wbo.getSheet("sheet1");
		Row r;
		r=wso.createRow(0);
		r.createCell(0).setCellValue("manual Testing");
		FileOutputStream fos=new FileOutputStream("C:\\Users\\hp\\Desktop\\Book2.xlsx");
		wbo.write(fos);;
		

	}

}
