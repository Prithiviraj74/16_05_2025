package org.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.Baseclass;

public class PageObjectModel extends Baseclass{

	
		//POM acts as a repository for loactors(ie. storage).
        //helps ot overcome StaleElement Exception.
        //developed based on POJO class(encapsulation).
        //encapsulation means creating private variables and methods ,accessing from another class.
	     //Private variable --->instance variable---->should be declared inside the class.
		//instatnce variable la tha value ah store panni get panna porom.(so we are using getters and setters)
	 
	//webdriver ah initialize pandrathuku, pagefactory (class )initElements(method)via kudukanum.
	//driver ah init panirukom, yarukaga panirukom(ie. intha object entha page kaaga work agapoguthu nu solanum) nah "This" class.
	public PageObjectModel() {//this is a constructor ,constructor create pannatha intha class ku object pandrappa run agaum.
	 PageFactory.initElements(driver,this);
	}
	   //create Private variable for the element. boc we are reusing it again and again.
	@FindBy(id="email")	
	private WebElement username;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement button;
		
		//source-->get set methods--->dlt all set methods bcoz we r going to do set by @find.
		public WebElement getUsername() {
			return username;
		}
		
		public WebElement getPassword() {
			return password;
		}
		
		public WebElement getButton() {
			return button;
		}
		
	} //In Encapsulation we are hiding the data or wraping the data.it contains private variables and methods that can be accessable by another class.
      // pagefactory muduchitu .. login class la enga la element find panirukomo atha dlt pananum.
         //Page ObjectModel ku object create panni .. pom.getusername nu kuduthu return type edukrom.same for pass.
        //pom means; enoda webelement ah object repository ah store panikaam. epo venumo reuse panikalam. so i can over come the staleelement exception.

