package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.base.Testbaseclass;

public class DealPage extends Testbaseclass {
	
	@FindBy(name="title")
	WebElement Tittle;
	
	@FindBy(name="client_lookup")
	WebElement Company;

    //@FindBy(name="amount")
    //WebElement Amount;
    
    @FindBy(name="owner_user_id")
    WebElement owner;
    
    @FindBy(xpath=".//*[@id='prospectForm']/table/tbody/tr[1]/td/input[1]")
    WebElement save;
    
    public DealPage(){
    	PageFactory.initElements(driver, this);
    }

    public void EnterDetaldetails(String Tittlename,String companyname,int i){
    	Tittle.sendKeys(Tittlename);
    	Company.sendKeys(companyname);
    	Select select=new Select(owner);
    	select.selectByIndex(i);
    	save.click();
    }
        
}
