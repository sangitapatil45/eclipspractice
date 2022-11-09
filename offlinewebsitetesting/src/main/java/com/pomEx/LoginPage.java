package com.pomEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	// 1       2         3   4  5
	//driver.findElement(By.id("email")
	
	@FindBy(id="email")
	private WebElement uname;
	
	@FindBy(id="password")
	private WebElement pass;
	
	@FindBy(xpath="//button")
	private WebElement loginBtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements( driver, this);
	}
	public void validLogin(){
		uname.sendKeys("kiran@gmail.com");
		pass.sendKeys("123456");
		loginBtn.click();
	}
	
	public void invalidLogin(String uname1,String pass1){
		uname.sendKeys(uname1);
        pass.sendKeys(pass1);
		loginBtn.click();
	}

	
	
	
	
	
      
}
