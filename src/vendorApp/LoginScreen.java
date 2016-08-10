package vendorApp;

import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import com.appium.page.objects.LoginScreenObject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.*;

@SuppressWarnings("unused")


public class LoginScreen extends setUp{
	
	public LoginScreenObject LoginScreenObject =new LoginScreenObject();
	
	@AfterTest
	public void register() throws InterruptedException
	{
		LoginScreenObject.et_countrycode();
		LoginScreenObject.et_mobile();
		LoginScreenObject.et_password();
		LoginScreenObject.login_btn().click();
	}
}
