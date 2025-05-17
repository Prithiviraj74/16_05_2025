package org.sample;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.page.PageObjectModel;

public class Login extends Baseclass{

	public static void main(String[] args) throws IOException {
	               browserlaunch("chrome");
	               maximize();
	               launchurl("https://www.facebook.com/");
	               String path="C:\\Users\\prith\\eclipse-workspace\\Maven_Project\\src\\test\\resources\\logindatas\\testdata.xlsx";
	              
	               String username= Excelread(path,"Sheet1",1,0);
	              // WebElement email = elementfind("id","email");
	               PageObjectModel pom=new PageObjectModel();
	               WebElement email = pom.getUsername();
	               sendtext(email,username);
	               
	               String pass = Excelread(path,"Sheet1",1,1);
	              // WebElement password = elementfind("id","pass");
	               WebElement password = pom.getPassword();
	               sendtext(password,pass);
	              
	              // WebElement button = elementfind("xpath","//button['value=1']");
	               Actions a=new Actions(driver);
	               WebElement button = pom.getButton();
	               a.click(button).perform();
	              
	               refreshpage();
	               
	                

	               String username1= Excelread(path,"Sheet1",2,0);
	              // WebElement email1 = elementfind("id","email");
	               WebElement email1 = pom.getUsername();
	               sendtext(email1,username1);
	               

	               String pass1 = Excelread(path,"Sheet1",2,2);
	              // WebElement password1 = elementfind("id","pass");
	               WebElement password1 = pom.getPassword();
	               sendtext(password1,pass1);         
	                
	}

}
