package org.test;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.manager.Pagemanager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.page.Forgottenpage;
import org.page.forgottenpagelogin;
import org.sample.Baseclass;

public class Facebooklogin extends Baseclass {
	String path="../Maven_Project/src/test/resources/logindatas/testdata.xlsx";
	
@BeforeClass
public static void browser() {
	browserlaunch("chrome");
	launchurl("https://www.facebook.com/");
	implicitwait();
}

@Before
public void bb() {
	String expected="Facebook – log in or sign up";
	String actual=driver.getTitle();
	Assert.assertEquals(expected, actual);
}

@Test
public void tc() throws IOException {
	Pagemanager p=new Pagemanager();
	 Forgottenpage getforgotten = p.getforgotten();
	 WebElement email = getforgotten.getEmail();
	 sendtext(email,Excelread(path,"Sheet1",1,0));
     WebElement passwd = getforgotten.getpassword();
     sendtext(passwd,Excelread(path,"Sheet1",1,1));
     click(By.name("login"));
}
  
@After
public void aa() {
	
	String expected="Log in to Facebook";
	String actual=driver.getTitle();
	boolean equals = expected.equals(actual);
	Assert.assertTrue(equals);
}

@AfterClass
public static void ac() {
	quit();
}
   
}
