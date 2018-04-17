package mobileTest;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DrugAndDropTC_3 extends base {
	
	@Test
	public void TC001() throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		TouchAction t1= new TouchAction(driver);
		
		//scroll down to Views and click
				driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Views\"));").click();
				driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();

t1.longPress(driver.findElementById("io.appium.android.apis:id/drag_dot_1")).moveTo(driver.findElementById("io.appium.android.apis:id/drag_dot_3")).release().perform();				
	}

}//end class 
