package mobileTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {

	public AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
	File f= new File("src/test/java");
	File fs=new File(f, "ApiDemos-debug (2).apk");
	
	DesiredCapabilities cap= new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "rubel");
	cap.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath() );
	
	//connection to server
	AndroidDriver<AndroidElement> driver= new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub "),cap);
	
	return driver;
	
	
	}
}
