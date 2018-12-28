package com.crm.testcase;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.base.Testbaseclass;
import com.crm.pages.DealPage;
import com.crm.pages.Homepage;
import com.crm.pages.Loginpage;
import com.crm.util.Utilityclass;
import com.screenshot.Takescreenshot;

public class Dealpagetest extends Testbaseclass {
	
	Loginpage loginpage;
	Homepage homepage;
	Utilityclass utilityclass;
	
	DealPage dealPage;
	
	public Dealpagetest(){
		super();
		}
   
	@BeforeMethod
	public void login() throws InterruptedException, IOException{
		intialization();
		utilityclass=new Utilityclass();
		dealPage=new DealPage();
		loginpage=new Loginpage();
		homepage =loginpage.login(prop.getProperty("username"), prop.getProperty("password"));	
		Takescreenshot.takesscreenshot("facebook_page");
		//driver.switchTo().frame("mainpanel");
		utilityclass.swtichtoframe();
		homepage.Clickonnewdeallink();
		Thread.sleep(5000);
		
		}
	@Test
	public void EnterDetaldetails() throws IOException{
	  dealPage.EnterDetaldetails("SMT", "SUPREETH", 1);
	  Takescreenshot.takesscreenshot("facebook");
	}
	
	@AfterMethod
	public void quit(){
		//driver.quit();
	}
	
	
}
