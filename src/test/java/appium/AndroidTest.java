package test.java.appium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;


public class AndroidTest extends BaseDriver{
	

	@Before
	public void testCaseSetup()throws Exception {
		// Some before tests actions
	}
	
    @Test
    public void MenuOverview_01(){
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	WebElement menuButton = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Otwórz lokalizację\"]"));

    	menuButton.click();
        WebElement overViewButton = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@text=\"Podgląd\"]"))));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@text=\"Konta\"]"))));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@text=\"Transakje\"]"))));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@text=\"Zestawienia\"]"))));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@text=\"Ustawienia\"]"))));
        overViewButton.click();
    };
    
    @Test
    public void OverViewButton() {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	WebElement menuButton = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Otwórz lokalizację\"]"));
    	menuButton.click();   
        WebElement overViewButton = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@text=\"Podgląd\"]"))));
        overViewButton.click();
    }   
    @Test
    public void AccountsViewButton() {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	WebElement menuButton = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Otwórz lokalizację\"]"));
        menuButton.click();
        WebElement accountsViewButton = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@text=\"Konta\"]"))));
        accountsViewButton.click();
    }
    @Test
    public void TransactionsViewButton() {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	WebElement menuButton = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Otwórz lokalizację\"]"));
        menuButton.click();
        WebElement transactionsViewButton = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@text=\"Transakje\"]"))));
        transactionsViewButton.click();
    }
    @Test
    public void ChartsViewButton() {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	WebElement menuButton = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Otwórz lokalizację\"]"));
        menuButton.click();
        WebElement chartsViewButton = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@text=\"Zestawienia\"]"))));
        chartsViewButton.click();
    }
    @Test
    public void SettingsViewButton() { 
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	WebElement menuButton = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Otwórz lokalizację\"]"));
        menuButton.click();
        WebElement settingsViewButton = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@text=\"Ustawienia\"]"))));
        settingsViewButton.click();
    }
        

}
