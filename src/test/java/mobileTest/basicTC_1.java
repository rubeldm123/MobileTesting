package mobileTest;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class basicTC_1 extends base{
	@Test
	public void runtest() throws MalformedURLException {
		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	
		
		//Scrolling down to click Views
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Views\"));").click();
		
		
		
		/*
		//click on Preference
			driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
		
		//click on  Preference dependencies
		driver.findElement(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();
		
		
		
		//click on WiFi check box 
		//driver.findElement(By.xpath("//android.widget.CheckBox[@resource-id='android:id/checkbox']")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		
		//click on WiFi setting
 driver.findElement(By.xpath("//android.widget.TextView[@text='WiFi settings']")).click();
 
 //Enter WIFI Password
 driver.findElement(By.id("android:id/edit")).sendKeys("1234rfr");
 
 //clcik on ok
 
 driver.findElement(By.id("android:id/button1")).click();*/
	}
	
	
}//end class
