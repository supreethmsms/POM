package com.crm.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.Testbaseclass;
import com.crm.util.Utilityclass;

public class Homepage extends Testbaseclass {
	Utilityclass utilityclass;
		
	//Click Contact link xpaths
	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath = "//a[contains(text(),'New Contact')]")
	WebElement newContactLink;
	
	//Click on Dealslink
	
	@FindBy(xpath = "//a[contains(text(),'Deals')]")
	WebElement DealsLink;
	
	@FindBy(xpath =".//*[@id='navmenu']/ul/li[5]/ul/li[1]/a")
	WebElement newDealLink;
	
	//Click on Task page
	
	   @FindBy(xpath=".//*[@id='navmenu']/ul/li[6]/a")
	    WebElement MovetoTasklink;
	      
	   @FindBy(xpath=".//*[@id='navmenu']/ul/li[6]/ul/li[1]/a")
	    WebElement MovetoNewTasklink;
	
	public Homepage(){
		PageFactory.initElements(driver, this);
	}
    	
      
	public Contactpage clickoncontactlink() {
				contactsLink.click();
		return new Contactpage();
	}
    
	 public void clickonnewcontactpage() {
		Actions action = new Actions(driver);
		action.moveToElement(contactsLink).build().perform();
		newContactLink.click();
		}
	 
	 public void Clickonnewdeallink() {
		 Actions action=new Actions(driver);
		 action.moveToElement(DealsLink).build().perform();
		  newDealLink.click();
		}

     public void clickontasklink(){
    	 Actions action=new Actions(driver);
    	 action.moveToElement(MovetoTasklink).build().perform();
    	 MovetoNewTasklink.click();
    	}
	
	 }
       
	




