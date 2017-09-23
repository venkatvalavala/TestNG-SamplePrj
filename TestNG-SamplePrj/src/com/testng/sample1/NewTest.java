package com.testng.sample1;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;


public class NewTest {
	 public String baseUrl = "http://demo.guru99.com/selenium/newtours/";
	// String driverPath = "C:/selenium-softs/chromedriver_win32/chromedriver.exe";
	 String driverPath = "C://Users//sreer//venkat-java//workspace//TestNG-SamplePrj//lib//chromedriver.exe";
	 public static WebDriver driver ; 	

	    
	  @Test
	  public void verifyHomepageTitle() {
	       
	      System.out.println("launching Chrome browser"); 
	     // System.setProperty("webdriver.firefox.marionette", driverPath);
	//      System.setProperty("webdriver.chrome.driver","C://selenium-softs//chromedriver_win32//chromedriver_win32//chromedriver.exe");
	   //   System.setProperty("webdriver.chrome.driver","C://Users//sreer//venkat-java//workspace//TestNG-SamplePrj//lib//chromedriver.exe");
	      System.setProperty("webdriver.chrome.driver",driverPath );
	      
	      ChromeOptions options = new ChromeOptions();
	      options.addArguments("test-type");
	      options.addArguments("start-maximized");
	      options.addArguments("--js-flags=--expose-gc");  
	      options.addArguments("--enable-precise-memory-info"); 
	      options.addArguments("--disable-popup-blocking");
	      options.addArguments("--disable-default-apps");
	      options.addArguments("test-type=browser");
	      options.addArguments("disable-infobars");
	      options.setBinary("C:/Users/sreer/AppData/Local/Google/Chrome/Application/chrome.exe");
	      driver = new ChromeDriver(options);
	      
	      //driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
			
	      driver.get(baseUrl);
	      String expectedTitle = "Welcome: Mercury Tours";
	      String actualTitle = driver.getTitle();
	      Assert.assertEquals(actualTitle, expectedTitle);
	      System.out.println("verifyHomepageTitle Id:- "
					+ Thread.currentThread().getId());
	      driver.close();
	  }
	  @Test
	    public void TestCase1() {
	       
	        System.out.println("Testcase 1 in New Test Class");
	        System.out.println("Test Case 1  Id:- "
					+ Thread.currentThread().getId());
	    }
	  
	  @Test
	    public void TestCase2() {
	       
	        System.out.println("Testcase 2 in New Test Class");
	        System.out.println("Test Case 2  Id:- "
					+ Thread.currentThread().getId());
	    }
	  @Test
	    public void TestCase3() {
	       
	        System.out.println("Testcase 3 in New Test Class");
	        System.out.println("Test Case 3  Id:- "
					+ Thread.currentThread().getId());
	    }
}

