package test.java.appium_page;

import io.appium.java_client.AppiumDriver;
import test.java.appium_page.screen.MainScreen;

@SuppressWarnings("rawtypes")
public class Application {

	private final AppiumDriver driver;

    public Application(AppiumDriver driver) {
        this.driver = driver;
    }
    
    public MainScreen applicationScreen() { return new MainScreen(driver); }

}