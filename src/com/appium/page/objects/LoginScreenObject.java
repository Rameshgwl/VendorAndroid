package com.appium.page.objects;

import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginScreenObject {

	
	@AndroidFindBy(id = "com.metalmann.vendor:id/et_countrycode")
	public WebElement et_countrycode;
	
	@AndroidFindBy(id = "com.metalmann.vendor:id/et_mobile")
	public WebElement et_mobile;
	
	@AndroidFindBy(id = "com.metalmann.vendor:id/et_password")
	public WebElement et_password;
	
	@AndroidFindBy(id = "com.metalmann.vendor:id/forgotpassword")
	public WebElement forgotpassword;
	
	@AndroidFindBy(id = "com.metalmann.vendor:id/newuser")
	public WebElement newuser;
	
	@AndroidFindBy(id = "com.metalmann.vendor:id/login_btn")
	public WebElement login_btn;
	
	public void et_countrycode()
	{
		et_countrycode.sendKeys("India");
		
	}
	
	public WebElement et_mobile()
	{
		
		et_mobile.sendKeys("7262282828");
        return et_mobile;
	}
	
	public WebElement et_password()
	{
		return et_password;
	}
	
	public WebElement forgotpassword()
	{
		return forgotpassword;
	}
	
	public WebElement newuser()
	{
		return newuser;
	}
	
	public WebElement login_btn()
	{
		return login_btn;
	}
	
	
}