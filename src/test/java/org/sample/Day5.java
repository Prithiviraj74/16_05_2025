package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Day5 {  //How to store multiple datas of datatypes using array.

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       File file=new File("C:\\Users\\prith\\eclipse-workspace\\Maven_Project\\src\\test\\resources\\logindatas\\testdata.xlsx");
       FileInputStream fi=new FileInputStream(file);
       Workbook w=new XSSFWorkbook(fi);
       Sheet Sheet = w.getSheet("sheet3");
       //more than one dimensional array is called two dimentional array.
       //using object we can store multiple data types.
       Object mydata[][]= {{"darvin",123,90909090},
    		                {"rose",234,565656565,01,01,01},
    		                {"kenny",678,12121212}};
       //array la iruka data va Get panna , we use Ittration.
       
       for (int i=0; i<mydata.length;i++) {  //using this length method we can find the no of rows in an array.
	           // for(int j=0; j<mydata.length;j++) {   //for same rows and same column no problem.
	            	
	      for(int j=0;j<mydata[i].length;j++) { //i mentions the row length , so it checks 0th rows length , 1st row length,etc..
    		System.out.println(mydata[i][j]);
    		//ipo intha mydata [i][j] ah tha store pananum.
    		//ithe mari row and column ah create panni store pannanum.epdi?  check Day5a.
    		
	              }
	        }
    	}
}
