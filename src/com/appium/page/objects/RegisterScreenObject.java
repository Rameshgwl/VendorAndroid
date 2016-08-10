package com.appium.page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class RegisterScreenObject {
	
	public RegisterScreenObject(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	

	



	public RegisterScreenObject() {
		// TODO Auto-generated constructor stub
	}







	@AndroidFindBy(id = "com.metalmann.vendor:id/tv_coutrycode")
	public WebElement tv_coutrycode;
	
	@AndroidFindBy(id = "com.metalmann.vendor:id/editText_phone")
	public WebElement editText_phone;
	
	@AndroidFindBy(id = "com.metalmann.vendor:id/editText_pwd")
	public WebElement editText_pwd;
	
	@AndroidFindBy(id = "com.metalmann.vendor:id/reg_btn")
	public WebElement reg_btn;
	
	@AndroidFindBy(id = "com.metalmann.vendor:id/imageView_left")
	public WebElement imageView_left;
	
	public WebElement tv_coutrycode()
	{
		return tv_coutrycode;
	}
	
	public WebElement editText_phone()
	{
		
		editText_phone.sendKeys("7262282828");
        return editText_phone;
	}
	
	public WebElement editText_pwd()
	{
		return editText_pwd;
	}
	public WebElement reg_btn()
	{
		return reg_btn;
	}
	public WebElement imageView_left()
	{
		return imageView_left;
	}
	
}