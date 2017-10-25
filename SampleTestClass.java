package junitTestCases;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import insurancePOM.InsuranceOverviewPOM;

import org.junit.After;


public class SampleTestClass {
	WebDriver driver;
	String baseURL;
	InsuranceOverviewPOM insuranceoverview1;
	Actions action;
	JavascriptExecutor jse;


	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Applications/Utilities/untitled folder/geckodriver");
		driver = new FirefoxDriver();
		baseURL = "https://www.sunlife.ca/";
		insuranceoverview1 = new InsuranceOverviewPOM(driver);
		
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseURL);
//		action = new Actions(driver);
		jse = (JavascriptExecutor)driver;
		driver.navigate().to("https://www.sunlife.ca/ca/Insurance?vgnLocale=en_CA");
		Thread.sleep(5000);
		jse.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[3]/div/div/div/div/div[1]/h4/a")).click();
		driver.navigate().to("https://www.sunlife.ca/ca/Insurance?vgnLocale=en_CA");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[4]/div[2]/div/form/div[2]/input[2]")).click();
		Thread.sleep(2000);
	}


	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	
}
