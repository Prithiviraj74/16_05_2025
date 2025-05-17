package org.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.Baseclass;

public class Forgottenpage extends Baseclass {
	
	public Forgottenpage() {//creating consttructor for forgottenpage.
		PageFactory.initElements(driver,this);
	}
	@FindBy(name="email")
	private WebElement email;
	
	public WebElement getEmail() {
		return email;
	}
    @FindBy(id="pass")
    private WebElement password;
    
    public WebElement getpassword() {
		return password;
    	
    }
}
