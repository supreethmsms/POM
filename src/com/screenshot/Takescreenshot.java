package com.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Takescreenshot {
	
	static WebDriver driver;
	
	public static void takesscreenshot(String filename) throws IOException{
		
	              File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
              FileUtils.copyFile(file,new File("D:\\AutomationWorkspace\\Selenium1\\src\\"+filename+".jpg"));
               
             

	}
	}
