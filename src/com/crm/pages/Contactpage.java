package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.base.Testbaseclass;

public class Contactpage extends Testbaseclass {
	
	
	@FindBy(name="title")
	WebElement Tittles;
	
	@FindBy(id="first_name")
	WebElement firstName;
	
	@FindBy(id="surname")
	WebElement lastName;
	
	@FindBy(name="client_lookup")
	WebElement company;
	
	@FindBy(xpath = "//input[@type='submit' and @value='Save']")
	WebElement saveBtn;


	
	public Contactpage(){
		PageFactory.initElements(driver, this);
	}
	
	//public boolean TittleDisplayedd(){
	//boolean flag=Tittledisplayed.isDisplayed();
      //  return flag;         
	//}
	public void createNewContact(String Tittle, String Firstname, String lastname, String comp){
		Select select = new Select(Tittles);
		select.selectByVisibleText(Tittle);
		
		firstName.sendKeys(Firstname);
		lastName.sendKeys(lastname);
		company.sendKeys(comp);
		saveBtn.click();
		
	}
}





