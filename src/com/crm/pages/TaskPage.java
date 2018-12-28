package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.base.Testbaseclass;

public class TaskPage extends Testbaseclass{

   
      
      @FindBy(name="title")
      WebElement Tittles;
      
     @FindBy(name="client_lookup")
     WebElement Keycompany;
     
       @FindBy(xpath=".//*[@id='taskForm']/table/tbody/tr[7]/td/input")
       WebElement save;
       
       public TaskPage(){
    	   PageFactory.initElements(driver, this);
       }
       
    	  public void taskdetails(String Tittle,String keycompany){
    		  Keycompany.sendKeys(Tittle);
    		  Tittles.sendKeys(keycompany);
    		  save.click();
    		  
    		  
    	  }
}


