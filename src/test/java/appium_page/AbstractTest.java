package test.java.appium_page;

import java.net.MalformedURLException;

import org.junit.*;

import io.appium.java_client.AppiumDriver;
import test.java.appium_page.utility.AppiumDriverBuilder.DriverBuilder;

@SuppressWarnings("rawtypes")
public abstract class AbstractTest {

	protected AppiumDriver driver = null;
    protected Application app;
    
    @Before
    public void connect() throws MalformedURLException {
    	if (this.driver == null) {
    		this.driver = DriverBuilder.forAndroid().build();
    		app = new Application(driver);
    	}
    }

}