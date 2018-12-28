package com.crm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.Testbaseclass;

public class Loginpage extends Testbaseclass {
	
		@FindBy(name="username")
		WebElement username;
		
		@FindBy(name="password")
		WebElement password;
		
		@FindBy(xpath="//input[@type='submit']")
		WebElement login;

		@FindBy(xpath="//img[contains(@alt,'free crm logo')]")
		WebElement CRMLogoDisplayed;

	//intializing the page objext
		public Loginpage() {
	    PageFactory.initElements(driver, this);
		}
	//Actions    
	     public String  ValidatingPageTittle(){
	    	 return driver.getTitle();
	     }
		
	    public boolean CrmLogoDisplayed(){
	    	return CRMLogoDisplayed.isDisplayed();
	    }
	    public Homepage login(String un,String pw){
	    	username.sendKeys(un);
	    	password.sendKeys(pw);
	    	//login.click();
	    	JavascriptExecutor js = (JavascriptExecutor)driver;
	    	js.executeScript("arguments[0].click();", login);
	    	return new Homepage();
	    	}}	



	
	
	
	

