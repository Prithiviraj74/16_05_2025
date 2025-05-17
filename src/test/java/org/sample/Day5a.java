package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.print.DocFlavor.STRING;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Day5a {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
	       File file=new File("C:\\Users\\prith\\eclipse-workspace\\Maven_Project\\src\\test\\resources\\logindatas\\testdata.xlsx");
	       FileInputStream fi=new FileInputStream(file);
	       Workbook w=new XSSFWorkbook(fi);
	       Sheet Sheet = w.getSheet("sheet3");
	       //more than one dimensional array is called two dimentional array.
	       //using object we can store multiple data types.
	       Object mydata[][]= {{"darvin",123,9090909090l},
	    		                {"rose",234,5656565090909l,01,01,01},
	    		                {"kenny",678,121212120000l}};
	                                                         //array la iruka data va Get panna , we use Ittration.
	       
	       for (int i=0; i<mydata.length;i++) {               //using this length method we can find the no of rows in an array.
		           Row Row = Sheet.createRow(i);              //creating row for array.
		           
	    	   for(int j=0;j<mydata[i].length;j++) {            //for same rows and same column no problem.illana [i] add pananum.   //i mentions the row length , so it checks 0th rows length , 1st row length,etc..
		    		Cell Cell = Row.createCell(j);
		    		
		    	                                               	//storing the data in a variable value.
		    		Object value=mydata[i][j];
		    		if(value instanceof String) {               //checking wheather the value is a string or int or long.dircet ah check panna mudiyathu so keywork "instance of use pandrom".
		    		           Cell.setCellValue((String)value);//value la store paniruka data object ah iruku..so string ku convert panni set pandrom  //Cell.setCellValue(mydata[i][j]);we have to set cell value, yen na sys.o.pln[i][j] la oru oru time um oru value eduthutu varum so ipdi pandrom.
		    		}else if(value instanceof Long){
		    			Cell.setCellValue((Long)value);//
		    		}
	    		FileOutputStream fo=new FileOutputStream(file);
	    		w.write(fo);
	}
	       }
	}
}
