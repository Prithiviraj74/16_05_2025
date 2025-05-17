package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Baseclass {

      
		protected static WebDriver driver;
		public static void browserlaunch(String browser) {
			switch(browser) {
			case"chrome":
				driver=new ChromeDriver();
				break;
			case"edge":
				driver=new EdgeDriver();
				break;
			case "firefox":
				driver=new FirefoxDriver();
				break;
				default:
					throw new IllegalArgumentException("wrong input");
				
			}
			
		}
		public static void maximize() {
			driver.manage().window().maximize();
		}
		public static void launchurl( String url) {
			driver.get(url);
		}
		
		static WebElement element; 
		public static WebElement elementfind(String locator,String value) {
			if(locator.equals("id"))
			    element=driver.findElement(By.id(value));
			else if(locator.equals("xpath"))
			    element=driver.findElement(By.xpath(value));
			else if(locator.equals("name"))
			    element=driver.findElement(By.name(value));
			else if(locator.equals("linkedtext"))
			    element=driver.findElement(By.linkText(value));
			return element;
		}
		
		public static void sendtext(WebElement ref,String value) {
		      ref.sendKeys(value);
		}
		
		
		public static String Excelread(String path,String sheetname,int rownum,int cellnum) throws IOException{
			File file=new File(path);
			FileInputStream fi=new FileInputStream(file);
			Workbook w=new XSSFWorkbook(fi);
			Cell cell = w.getSheet(sheetname).getRow(rownum).getCell(cellnum);
			CellType cellType = cell.getCellType();
			String data=null; //oru string variable (data)nu potu athula null nu soldrom.
			
			switch(cellType) {
			case STRING:
				data=cell.getStringCellValue();
				break;
			case NUMERIC:   //if date formate la iruntha .
				if(DateUtil.isCellDateFormatted(cell)) {
					SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
					data = sdf.format(cell.getDateCellValue());
				}else {// date ilatha number inga varum. it may be a wholenum 32.5 or double 123
					double ncv = cell.getNumericCellValue();
					    long l=(long)ncv;//cell la iruka numberic  value ah get panna double ah return pannum. 6.3 
	    	    		//so atha long (123 , 98) ah mathrom(convert pandrom)
					if(ncv==l) {
						data = Long.toString(l);
					}else {//98.0
						data = Double.toString(ncv);
					}
				}
				break;
			}
			return data;
		}
		 

	   
	    
	       /*  NAVIGATE BASECLASS   */
		 // Refresh the current page
	    public static void refreshpage() {
	        driver.navigate().refresh();
	    }

	    // Navigate back in history of the page.
	    public static void goback() {
	        driver.navigate().back();
	    }

	    // Navigate forward in history
	    public static void goforward() {
	        driver.navigate().forward();
	    }

	    // Get the current page title
	    public static String getpagetitle() {
	        return driver.getTitle();
	    }

	    // Get the current URL
	    public static String getCurrentUrl() {
	        return driver.getCurrentUrl();
	    }
        /*  Actions baseclass    */
	    
	    // just click 
	    public  void justclick(WebElement element) {
	    	element.click();
	    }
	    public static void click(By locator) {
	        driver.findElement(locator).click();
	    }
	    public static void implicitwait() {
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    }
	    public static void quit() {
	    	driver.quit();
	    }
}
	                                                                               


