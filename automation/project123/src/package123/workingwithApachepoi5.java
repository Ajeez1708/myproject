package package123;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class workingwithApachepoi5
{
public static void main(String[] args) throws IOException 
	{
	FileInputStream fis=new FileInputStream("c:\\Users\\hp\\Desktop\\Book2.xlsx");
	XSSFWorkbook wbo=new XSSFWorkbook(fis);
	XSSFSheet wso=wbo.getSheet("sheet1");
	Row r;
	int rowc=wso.getLastRowNum();
	for(int i=0;i<rowc;i++)
	{
		r=wso.getRow(i);
		int colc=r.getLastCellNum();
		for(int j=0;j<colc;j++)
		{
		System.out.println(r.getCell(j).getStringCellValue()+"    ");
		}
		System.out.println();
	}
	FileOutputStream fos=new FileOutputStream("c:\\Users\\hp\\Desktop\\Book2.xlsx");
	wbo.write(fos);

	}

}
