package org.page;

import org.manager.Pagemanager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.sample.Baseclass;

public class forgottenpagelogin extends Baseclass {
	public static void main (String[]args) {
	browserlaunch("chrome");
	launchurl("https://www.facebook.com/");
	maximize();
	
	PageObjectModel pom=new PageObjectModel();
	
	WebElement username = pom.getUsername();
	sendtext(username,"darvinchan");
	
	WebElement password = pom.getPassword();
	sendtext(password,"123dar");
	
   // Actions a=new Actions(driver);
//     WebElement button = pom.getButton();
//     a.click(button).perform();
    
    
	
	//WebElement forgotemailid = elementfind("id","u_0_6_7b");
    click(By.linkText("Forgotten password?"));
    
    
    
   	Forgottenpage fp=new Forgottenpage(); //creating object for forgottenpage.
   	
   	
    WebElement newemail = elementfind("id","identify_email");
	sendtext(newemail,"darvinjasmine");
	
	
	
	/* *******after creating page manager******** */
	
	Pagemanager p=new Pagemanager();//creating object for pagemanager
	
	Forgottenpage forgotpg = p.getforgotten();
	WebElement email = forgotpg.getEmail();
	sendtext(email,"jack123");
	
	WebElement pd = forgotpg.getpassword();
	sendtext(pd,"wewewewe");

	 click(By.linkText("Forgotten password?"));
	 
	 forgottenpagelogin fgplogin = p.getfgplogin();
	// fgplogin.getEmail();
	
	
	}
}
