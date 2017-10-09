package test.java.appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.io.File;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BaseDriver extends JUnitReporter{
	
	private static final Logger[] pin;
	static {
	    pin = new Logger[]{
	        Logger.getLogger("org.apache.commons.httpclient"),
	        Logger.getLogger("org.openqa.selenium.remote.ProtocolHandshake")
	    };

	    for (Logger l : pin) {
	        l.setLevel(Level.OFF);
	    }
	}
    
	
	public AppiumDriver<WebElement> driver;
    
    @Before
    public void setUp() throws Exception {
        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "/apps/");
        File app = new File(appDir.getCanonicalPath(), "Financius.v0.18.2.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", ""); // device UID from adb
		capabilities.setCapability("platformVersion", "6.0.1"); // android version
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("appPackage", "com.code44.finance"); // package name
		capabilities.setCapability("appWaitActivity", "com.code44.finance.*"); // default activity
		
		capabilities.setCapability("no-reset", "true"); 
		capabilities.setCapability("full-reset", "false"); 
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    
    }

    @After
    public void tearDown() throws Exception {
        if (driver != null) {
            driver.quit();
        }
        
    }


    public MobileElement scrollTo(String text){
        return (MobileElement) driver.findElement(MobileBy.
                AndroidUIAutomator("new UiScrollable(new UiSelector()"
                        + ".scrollable(true)).scrollIntoView(resourceId(\"android:id/list\")).scrollIntoView("
                        + "new UiSelector().text(\""+text+"\"))"));
    }

}
