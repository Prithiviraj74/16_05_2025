package org.sample;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class FBlogin {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//1st we have to create a file and get the path.
     File f =new File("C:\\Users\\prith\\eclipse-workspace\\Maven_Project\\src\\test\\resources\\logindatas\\testdata.xlsx");
    //method (import) and  object is created. 
     FileInputStream fi =new FileInputStream(f);
     //workbook interface 
     Workbook  w =new XSSFWorkbook(fi);
     //To get the sheet from Workbook.
     Sheet sheet = w.getSheet("sheet1");
     //get Row from Sheet.
      Row row = sheet.getRow(1);
     //get cell from Row
     Cell cell = row.getCell(0);
     //get the cell value.
     String stringCellValue = cell.getStringCellValue();
     System.out.println(stringCellValue);
	}

}
