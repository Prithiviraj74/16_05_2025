package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

public class Day4 {   //To pass the data from workbooksheets to website.

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       File file=new File("C:\\Users\\prith\\eclipse-workspace\\Maven_Project\\src\\test\\resources\\logindatas\\testdata.xlsx");
       FileInputStream fi=new FileInputStream(file);
       Workbook  w=new XSSFWorkbook(fi);
       Sheet sheet = w.getSheet("sheet1");
       Row row = sheet.getRow(1);
       Cell cell = row.getCell(1);
       String scv = cell.getStringCellValue();
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.facebook.com/");
       WebElement email = driver.findElement(By.id("email"));
       email.sendKeys("darvin2143");
       driver.close();
       
	}

}
