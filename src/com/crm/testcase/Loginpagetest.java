package com.crm.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.base.Testbaseclass;
import com.crm.pages.Homepage;
import com.crm.pages.Loginpage;

public class Loginpagetest extends Testbaseclass {
	
	Loginpage loginpage;
	Homepage  homepage;
	
	public Loginpagetest(){
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		intialization();
		 loginpage=new Loginpage();
	}
	
	@Test(priority=1)
	public void loginpageTittle(){
	String Tittle =loginpage.ValidatingPageTittle();
	Assert.assertEquals(Tittle, "#1 Free CRM software in the cloud for sales and service");	
	}
	
	@Test(priority=2)
	public void CRMImageDisplayed(){
		boolean flag =loginpage.CrmLogoDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void login(){
		homepage =	loginpage.login(prop.getProperty("username"), prop.getProperty("password"));  
	}
	
	
	@AfterMethod()
	public void close()
	{
		driver.quit();
	}
	
}
