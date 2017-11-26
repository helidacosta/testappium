package monitora.medicalbox.support;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Utils {

	public static String readProperty(String property) {
		Properties prop = null;
		String value = null;
		try {
			prop = new Properties();
			prop.load(new FileInputStream(new File("config.properties")));
			
			value = prop.getProperty(property);
			
			if (value == null || value == "") {
				throw new Exception("Value not set or empty");
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return value;
	}
	
	public static AppiumDriver<?> returnDriver(String platform) throws MalformedURLException {
		AppiumDriver<?> driver = null;
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
				
		String completURL = "http://" + Utils.readProperty("run.ip") + ":" + Utils.readProperty("run.port") + "/wd/hub";
		
		switch (platform.toLowerCase()) {
		
		case "android":
			
			capabilities.setCapability(MobileCapabilityType.APP, new File(Utils.readProperty("app.android.path")).getAbsolutePath());
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, Utils.readProperty("device.android.name"));
			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
			capabilities.setCapability("autoGrantPermissions", true);
			capabilities.setCapability("automationName", "uiautomator2");
			//capabilities.setCapability("autoAcceptAlerts", true);
				
			driver = new AndroidDriver<RemoteWebElement>(new URL(completURL), capabilities);
			
			break;
			
		default:
			break;
		}
		
		return driver;
	}

}
