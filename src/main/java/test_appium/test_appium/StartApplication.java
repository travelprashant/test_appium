package test_appium.test_appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class StartApplication {

	private static AndroidDriver driver;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		/*
		 * File classpathRoot = new File(System.getProperty("user.dir")); File
		 * appDir = new File(classpathRoot, "/Apps/Amazon/"); File app = new
		 * File(appDir, "in.amazon.mShop.android.shopping.apk");
		 */

		String SKIP = "//android.widget.RelativeLayout[@index='4']", CANCEL = "android:id/button2",
				Globeicon = "//android.widget.HorizontalScrollView[@resource-id='com.traveltriangle.traveller:id/sliding_tabs']/android.widget.LinearLayout[@index='0']/android.widget.RelativeLayout[@index='0']",
				floating_icon = "//android.view.ViewGroup[@resource-id='com.traveltriangle.traveller:id/fab_bottomMenu']/android.widget.ImageButton[@index='0']";

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("BROWSER_NAME", "Android");
		capabilities.setCapability("deviceName", "Android");
		capabilities.setCapability("platformVersion", "6.0");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPackage", "com.traveltriangle.traveller");
		capabilities.setCapability("appActivity", "com.traveltriangle.traveller.HomeActivity");
		capabilities.setCapability("clearSystemFiles", "true");
		
		
		//capabilities.setCapability("unicodeKeyboard", true);
		//capabilities.setCapability("resetKeyboard", true);

		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		Thread.sleep(3000);

		System.out.println("App Launched");

		/* driver.findElement(By.id("btn_skip")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id(CANCEL)).click();
		 Thread.sleep(2000);
		 
		driver.findElement(By.xpath(Globeicon)).click();
		Thread.sleep(12000);*/
		/*driver.findElement(By
				.xpath("//android.widget.HorizontalScrollView[@resource-id='com.traveltriangle.traveller:id/sliding_tabs']/android.widget.LinearLayout[@index='0']/android.widget.RelativeLayout[@index='2']"))
				.click();
		Thread.sleep(5000);*/
		App.Cancelreq(driver);
		
		
		
		// driver.runAppInBackground(1);
		//App.Quotes(driver);

		driver.quit();

	}

}
