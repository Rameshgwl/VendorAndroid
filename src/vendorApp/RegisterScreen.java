package vendorApp;

import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import com.appium.page.objects.RegisterScreenObject;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.*;

@SuppressWarnings("unused")


public class RegisterScreen extends setUp{
	
	public RegisterScreenObject RegisterScreenObject =new RegisterScreenObject();
	
	@AfterTest
	public void register() throws InterruptedException
	{
	
		RegisterScreenObject.tv_coutrycode.sendKeys("India");
		wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")).click();
		RegisterScreenObject.editText_phone();
		RegisterScreenObject.editText_pwd.sendKeys("sbtest123");
		RegisterScreenObject.reg_btn.click();
	 
    }
	
}
