package com.crm.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.base.Testbaseclass;
import com.crm.pages.Homepage;
import com.crm.pages.Loginpage;
import com.crm.pages.TaskPage;
import com.crm.util.Utilityclass;

public class Taskpagetest extends Testbaseclass {

	Loginpage loginpage;
	Homepage homepage;
	Utilityclass utilityclass;
	TaskPage taskPage;
	public Taskpagetest(){
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException{
		intialization();
		loginpage=new Loginpage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		homepage=new Homepage();
		utilityclass=new Utilityclass();
		utilityclass.swtichtoframe();
		taskPage=new TaskPage();
		Thread.sleep(5000);
		homepage.clickontasklink();
	}
	
	@Test
	public void Filltaskpage(){
		taskPage.taskdetails("MR", "SUHAS");	
	}
	
	@AfterMethod
	public void close(){
		driver.quit();
	}
}
