package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Day3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    File file=new File("C:\\Users\\prith\\eclipse-workspace\\Maven_Project\\src\\test\\resources\\logindatas\\testdata.xlsx");
    FileInputStream fi=new FileInputStream(file);
    Workbook w=new XSSFWorkbook(fi);
    Sheet sheet = w.getSheet("sheet1");
    
    int rowsize = sheet.getPhysicalNumberOfRows(); //Ethana rows iruku nu therla , so physical no of rows get pandrom.
                                                    //sheet kitta row (size) evlo nu kekrom.
    
    for(int i=0;i<=rowsize;i++) 
         {                                         //kandupidicha Physical no of Rows ah Get pananum,atha (i) la store pananum.so,
    	Row row = sheet.getRow(i);
    	
    	
                                                    	//Ethana cells iruku nu therla(columns).so,physical no of cells get pandrom.
    	                                                //Row kitta no of Cells (size) kekrom,
    	int cellsize = row.getPhysicalNumberOfCells();
         
    	for(int j=0; j<cellsize ;j++)
    	{                                               //kandupidicha Physical no of Cells ah Get pananum,atha (j) la store pananum.so,
    	    Cell cell = row.getCell(j);
   	    
                                                          //    	    String stringCellValue = cell.getStringCellValue();
                                                 	   // System.out.println(stringCellValue);	   
   	                                                  //String print aguthu but int print agala so,celltype ah (get pananum) kandupidikanum.
    	    CellType cellType = cell.getCellType();
    	    
    	                                               //switch case use panni string na epdi print pananum and numberic na epdi pnanu nu soldrom.
    	    switch(cellType) {
    	    
    	    case STRING:                                //string ah iruntha intha case kulla varum , vanthuruchuna string ah Get pananum.
    	    	String stringCellValue = cell.getStringCellValue();
    	    	System.out.println(stringCellValue);
    	    	break;
    	    
    	    case NUMERIC:                               //Numberic value ah iruntha ingavarum, antha value date? ah illaya?
    	    	                                         //atha kandupidika isdateformatted nu oru method use pandrom.
    	    	boolean isdate = DateUtil.isCellDateFormatted(cell);
    	    	
    	    	if(isdate) {                           //date cell value ah get pananum.
    	    		Date dateCellValue = cell.getDateCellValue();
    	    		
    	    	                                     	//kedacha date cell value ah simple dateformat ah  convert pananum (method) use panni.
    	    		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yy");//method la object (sdf)create panniyachu.
                                                           //object vachu method ah call panni ,
                                                        	 //date cell value la kandupidicha date ah format date ah mathi atha finaldate nu save paniyachu.
    	    		String finaldate = sdf.format(dateCellValue);
    	    		System.out.println(finaldate);
    	    		}else
    	    	{
    	    	//cell la iruka numberic  value ah get panna double ah return pannum. 6.3 
    	    		//so atha long ah mathrom
    	    		double numericCellValue = cell.getNumericCellValue();
    	    		long l=(long)numericCellValue;//atha long ah convert panni l la store pandrom
    	    		if(numericCellValue==l) {
    	    			System.out.println(l);
    	    		}else {
    	    			System.out.println(numericCellValue);
    	    		}
    	    		
    	    	  }
    	      }
          }
     	}

	} 
}
