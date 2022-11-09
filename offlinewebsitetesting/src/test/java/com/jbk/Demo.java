package com.jbk;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pomEx.LoginPage;

public class Demo {

	WebDriver driver;

	@BeforeMethod
	 void setup() {
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("file:///D:/Selenium%20SOFTWARE/Offline%20Website/index.html");

	}

	@Test
	public void test02() {

		LoginPage lp = new LoginPage(driver);
		lp.validLogin();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}
	@Test
	public void test03() {

		LoginPage lp = new LoginPage(driver);
		lp.invalidLogin("sp", "1234");
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Log in");
	
	}
}
