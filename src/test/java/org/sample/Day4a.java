package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Day4a {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        //how to store/write data in excel sheet.
		File file=new File("C:\\Users\\prith\\eclipse-workspace\\Maven_Project\\src\\test\\resources\\logindatas\\testdata.xlsx");
		FileInputStream fi=new FileInputStream(file);  //to read the excel sheet
		Workbook w=new XSSFWorkbook(fi);
		Sheet Sheet = w.getSheet("sheet2");    //creating new sheet
		Row Row = Sheet.createRow(10);             //creating new row
		Cell Cell = Row.createCell(0);            //creating new cell
		Cell.setCellValue("java");                //inserting values to the cell    (no return type)
		FileOutputStream fo=new FileOutputStream(file); 
		w.write(fo);
		
		
	}

}
