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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4b {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//how to store the data from the website to excelsheet.
        File file=new File("C:\\Users\\prith\\eclipse-workspace\\Maven_Project\\src\\test\\resources\\logindatas\\testdata.xlsx");
        FileInputStream fi=new FileInputStream(file); 
        Workbook w=new XSSFWorkbook(fi);
        Sheet sheet = w.getSheet("sheet2");
        Row Row = sheet.createRow(1);
        Cell Cell = Row.createCell(0);
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        WebElement value = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect and share with the people in your life.')]"));
        String text = value.getText();  //getting the values finfed by xpath using GETTEXT .
        Cell.setCellValue(text); // setting the getted value in cell.
        FileOutputStream fo=new FileOutputStream(file);
        w.write(fo);   //workbook la write panrom.
        
	}

}
