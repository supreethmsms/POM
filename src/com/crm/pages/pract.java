package com.crm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class pract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver","/Users/supreeth.ms/Downloads/geckodriver-v0.23.0-win64");
      	driver.get("https://www.freecrm.com/index.html");
      	driver.findElement(By.name("username")).sendKeys("LLLLLL");
      	driver.findElement(By.name("password"));
      	driver.findElement(By.xpath("//input[@type='submit']")).click();
}}
