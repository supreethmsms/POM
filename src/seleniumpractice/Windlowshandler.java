package seleniumpractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Windlowshandler {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","/Users/supreeth.ms/Downloads/geckodriver-v0.23.0-win64");
		WebDriver driver = new FirefoxDriver();
	
	  //  driver.manage().window().maximize();
	  //  driver.manage().deleteAllCookies();
	  //  driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	  //  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
		driver.get("http://www.popuptest.com/");
	    driver.findElement(By.xpath("html/body/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[1]/font[3]/b/a")).click();
	    
	    Set<String> windows= driver.getWindowHandles();
	    Iterator<String> itr = windows.iterator();
	    
	    String Parent=itr.next();
	    System.out.println(Parent);
	    
	    
	    String child=itr.next();
	    System.out.println(child);
	    
	    driver.switchTo().window(child);
	    String Tittle =driver.getTitle();
		System.out.println(Tittle);
		
		Thread.sleep(2000);
		
		driver.switchTo().window(Parent);
		String Tittle1 =driver.getTitle();
		System.out.println(Tittle1);
		driver.close();
		
		
	}

}
