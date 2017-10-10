package test.java.appium_page.screen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

@SuppressWarnings("rawtypes")
public class MainScreen extends AbstractScreen {

    public WebElement menuButton = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation\"]"));

	public MainScreen(AppiumDriver driver) {
        super(driver);
    }

    public void toggleMenu() {
    	
        menuButton.click();

    }

}