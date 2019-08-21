package testngdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Datasheetexample {
  @Test
  public void f() throws IOException {
	  FileInputStream fos=new FileInputStream(new File("C:\\Users\\training_h2a.06.15\\Desktop\\datasheet.xlsx"));
	  XSSFWorkbook xw=new XSSFWorkbook(fos);
	  XSSFSheet xs=xw.getSheet("Sheet1");
	  
	  int rowcnt=xs.getLastRowNum();
	  String username=xs.getRow(1).getCell(0).getStringCellValue();
	  System.out.println(username);
  
  
  
  
  
  xs.getRow(0).createCell(2).setCellValue("status");
  xs.getRow(1).createCell(2).setCellValue("pass");
  
  FileOutputStream fos1=new FileOutputStream(new File("C:\\Users\\training_h2a.06.15\\Desktop\\datasheet.xlsx"));
	  xw.write(fos1);
	  fos1.close();
  }
}

