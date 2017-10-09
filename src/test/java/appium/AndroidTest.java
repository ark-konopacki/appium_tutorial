package test.java.appium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AndroidTest extends BaseDriver{
	

	@Before
	public void testCaseSetup()throws Exception {
		// Some before tests actions
	}
	
    @Test
    public void MenuOverview(){
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	WebElement menuButton = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation\"]"));

    	menuButton.click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@text=\"Overview\"]"))));

        WebElement overViewButton = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@text=\"Overview\"]"))));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@text=\"Accounts\"]"))));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@text=\"Transactions\"]"))));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@text=\"Reports\"]"))));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@text=\"Settings\"]"))));
        overViewButton.click();
    };
    
    @Test
    public void OverViewButton() {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	WebElement menuButton = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation\"]"));
    	menuButton.click();   
        WebElement overViewButton = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@text=\"Overview\"]"))));
        overViewButton.click();
    }   
    @Test
    public void AccountsViewButton() {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	WebElement menuButton = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation\"]"));
        menuButton.click();
        WebElement accountsViewButton = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@text=\"Accounts\"]"))));
        accountsViewButton.click();
    }
    @Test
    public void TransactionsViewButton() {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	WebElement menuButton = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation\"]"));
        menuButton.click();
        WebElement transactionsViewButton = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@text=\"Transactions\"]"))));
        transactionsViewButton.click();
    }
    @Test
    public void ChartsViewButton() {
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	WebElement menuButton = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation\"]"));
        menuButton.click();
        WebElement chartsViewButton = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@text=\"Reports\"]"))));
        chartsViewButton.click();
    }
    @Test
    public void SettingsViewButton() { 
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	WebElement menuButton = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation\"]"));
        menuButton.click();
        WebElement settingsViewButton = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@text=\"Settings\"]"))));
        settingsViewButton.click();
    }
        

}
