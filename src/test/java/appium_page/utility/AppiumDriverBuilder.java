package test.java.appium_page.utility;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testobject.rest.api.appium.common.TestObjectCapabilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

@SuppressWarnings("rawtypes")

public abstract class AppiumDriverBuilder<SELF, DRIVER extends AppiumDriver> {

	
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
	
    protected String apiKey;
    protected String testReportId;

    public static DriverBuilder forAndroid() {
        return new DriverBuilder();
    }



    public static class DriverBuilder extends AppiumDriverBuilder<DriverBuilder, AndroidDriver> {

        
		public AndroidDriver build() {
        	try {
	        	DesiredCapabilities capabilities = new DesiredCapabilities();
	
	            capabilities.setCapability(TestObjectCapabilities.TESTOBJECT_API_KEY, apiKey);
	            capabilities.setCapability(TestObjectCapabilities.TESTOBJECT_TEST_REPORT_ID, testReportId);
	
	            File classpathRoot = new File(System.getProperty("user.dir"));
	            File appDir = new File(classpathRoot, "/apps/");
	            File app;
			
				app = new File(appDir.getCanonicalPath(), "Financius.v0.18.2.apk");
				capabilities.setCapability("deviceName", "27db13b8"); // device UID from adb
	    		capabilities.setCapability("platformVersion", "6.0.1"); // android version
	    		capabilities.setCapability("platformName", "Android");
	    		capabilities.setCapability("app", app.getAbsolutePath());
	    		capabilities.setCapability("appPackage", "com.code44.finance"); // package name
	    		capabilities.setCapability("appWaitActivity", "com.code44.finance.*"); // default activity
	    		
	    		capabilities.setCapability("no-reset", "true"); 
	    		capabilities.setCapability("full-reset", "false");
	    		
	    		return new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	    		
			} catch (IOException e) {
				e.printStackTrace();
			}
            
            return null; 

        }

    }

    protected URL endpoint;

    @SuppressWarnings("unchecked")
	public SELF withEndpoint(URL endpoint) {
        this.endpoint = endpoint;

        return (SELF) this;
    }

    @SuppressWarnings("unchecked")
    public SELF withApiKey(String apiKey) {
        this.apiKey = apiKey;

        return (SELF) this;
    }

    @SuppressWarnings("unchecked")
    public SELF withTestReportId(String testReportId) {
        this.testReportId = testReportId;

        return (SELF) this;
    }

    public abstract DRIVER build();

}

