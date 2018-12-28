package com.crm.util;



import com.crm.base.Testbaseclass;

public class Utilityclass extends Testbaseclass {
	
	public static long implicitwait =50;
	public static long pageloadtimout=50;
	public void swtichtoframe(){
		driver.switchTo().frame("mainpanel");
	}
}