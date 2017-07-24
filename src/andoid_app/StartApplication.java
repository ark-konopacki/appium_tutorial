package andoid_app;

import io.appium.java_client.android.AndroidDriver;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class StartApplication {

		private static AndroidDriver driver;
		public static void main(String[] args) throws MalformedURLException, InterruptedException {

			File classpathRoot = new File(System.getProperty("user.dir"));
			File appDir = new File(classpathRoot, "/Apps/");
			File app = new File(appDir, "Financius.v0.18.2.apk");

			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
			capabilities.setCapability("deviceName", ""); // device UID from adb
			capabilities.setCapability("platformVersion", ""); // android version
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("app", app.getAbsolutePath());
			capabilities.setCapability("appPackage", "com.code44.finance"); // package name
			capabilities.setCapability("appWaitActivity", "com.code44.finance.*"); // default activity

			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
			Thread.sleep(100000);
			driver.quit();

	}

}