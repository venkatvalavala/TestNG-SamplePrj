package com.localserver.samples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Html5Page {

	public Html5Page() {
		// TODO Auto-generated constructor stub
	}

	 public String baseUrl = "http://localhost/selenium-sample/";
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
	      WebElement en=driver.findElement(By.xpath("//h1"));
	      System.out.println("Text of the h1 tag" + en.getText());
	   //   Assert.assertEquals(actualTitle, expectedTitle);
	      System.out.println("verifyHomepageTitle Id:- "
					+ Thread.currentThread().getId());
	     // driver.close();
	 }
	 
}
