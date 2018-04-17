package mobileTest;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

@Test
public class TouchPressMoveTC_2 extends base {
	
	@SuppressWarnings("deprecation")
	public void TC1_001() throws MalformedURLException {
		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		TouchAction t= new TouchAction(driver);
		
		//scroll down to Views and click
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Views\"));").click();
		
		
		//click on Date Widgets-->click on Inline-->
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Date Widgets\"));").click();
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"2. Inline\"));").click();
		
		//press 9 for initialize clock set 
		
	driver.findElement(By.xpath("//*[@content-desc='9']")).click();
	
	
	//touch and press 15 and then move to 45 using Touch Action class 
	t.press(driver.findElementByXPath("//*[@content-desc='15']")).waitAction().moveTo(driver.findElementByXPath("//*[@content-desc='45']")).release().perform();
	
	}
	
	}//end class
