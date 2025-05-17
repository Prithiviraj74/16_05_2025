package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Day2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     File file=new File("C:\\Users\\prith\\eclipse-workspace\\Maven_Project\\src\\test\\resources\\logindatas\\testdata.xlsx");
     FileInputStream fi=new FileInputStream(file);
     Workbook w=new XSSFWorkbook(fi);
     Sheet sheet = w.getSheet("sheet1");
     Row row = sheet.getRow(3);
     Cell cell = row.getCell(3);
     String stringCellValue = cell.getStringCellValue();
     System.out.println(stringCellValue);
     for(int i=0;i<4;i++) {
    	 Row row2 = sheet.getRow(i);
    	 for(int j=0;j<4;j++) {
    		 Cell cell2 = row2.getCell(j);
    		 String stringCellValue2 = cell2.getStringCellValue();
    		 System.out.println(stringCellValue2);
    	 }
       }
     
	}

}
