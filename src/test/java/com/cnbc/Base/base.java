package com.cnbc.Base;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.android.options.UiAutomator2Options;

public class base {
	@Test
public void configureAppium() throws MalformedURLException {
	
	//Capabilities
	UiAutomator2Options options =new UiAutomator2Options();
	options.setDeviceName("Resize");
	options.setApp(System.getProperty("user.dir")+"\\Resources\\CNBC_3.4.0.1.apk");
	//options.setPlatformName("Android");
	
	//Android Driver
	AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
	//driver.quit();
	}
}
