package mobileTest;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class basic extends base{
	@Test
	public void runtest() throws MalformedURLException {
		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
		
	}
	
	
}//end class
