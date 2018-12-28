package com.crm.base;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.crm.util.Utilityclass;

public class Testbaseclass {
	
	
	public static WebDriver driver;
	public static Properties prop;
	public Testbaseclass() {
		try{
		prop=new Properties();
			FileInputStream  ip=new FileInputStream("D:/AutomationWorkspace/Selenium1/src/com/crm/config/property/Config.properties");
		prop.load(ip);	
		}catch(FileNotFoundException e){
           System.out.println(e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	public static void intialization(){
        String browsername =prop.getProperty("browser");
    	if(browsername.equals("Chrome")){
        System.setProperty("webdriver.chrome.driver","/Users/supreeth.ms/Downloads/chromedriver_win32");
        driver = new ChromeDriver();
        }

    	else if(browsername.equals("Firefox")){
        System.setProperty("webdriver.gecko.driver","C:/Users/supreeth.ms/Downloads/geckodriver-v0.23.0-win64/geckodriver.exe");
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities = DesiredCapabilities.firefox();
        //capabilities.setBrowserName("firefox");
        //capabilities.setVersion("your firefox version");
        //capabilities.setPlatform(Platform.WINDOWS);
        capabilities.setCapability("marionette", false);
       	driver = new FirefoxDriver(capabilities);
    		
        }
    	//String urlNova = "url";
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Utilityclass.pageloadtimout,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Utilityclass.implicitwait, TimeUnit.SECONDS);
        driver.get(prop.getProperty("url"));
	}	 }




