package com.crm.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.base.Testbaseclass;
import com.crm.pages.Homepage;
import com.crm.pages.Loginpage;

public class HomePageTestclass extends Testbaseclass  {
	
	Homepage homepage;
	Loginpage loginpage;
	public HomePageTestclass(){
		super();
	}
	
	@BeforeMethod
	public void setup(){
		intialization();
		loginpage=new Loginpage();
		homepage =loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	    
	}
	
    @Test
	public void clickoncontact() {
    	
	homepage.clickoncontactlink();
	}
	
	@AfterMethod
	public void quitebrowser(){
		driver.quit();
	}
	
}


