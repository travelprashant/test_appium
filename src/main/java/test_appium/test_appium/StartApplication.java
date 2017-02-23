package test_appium.test_appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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
       
		String SKIP="//android.widget.RelativeLayout[@index='4']",
				CANCEL="android:id/button2",
			    Globeicon="//android.widget.HorizontalScrollView[@resource-id='com.traveltriangle.traveller:id/sliding_tabs']/android.widget.LinearLayout[@index='0']/android.widget.RelativeLayout[@index='0']",
			    CATEGORIES=" //android.widget.TextView[@text='CATEGORIES']",
			    DESTINATIONS=" //android.widget.TextView[@text='DESTINATIONS']",
			    SearchIcon ="//android.widget.HorizontalScrollView[@resource-id='com.traveltriangle.traveller:id/sliding_tabs']/android.widget.LinearLayout[@index='0']/android.widget.RelativeLayout[@index='1']",
			    MyRequestIcon ="//android.widget.HorizontalScrollView[@resource-id='com.traveltriangle.traveller:id/sliding_tabs']/android.widget.LinearLayout[@index='0']/android.widget.RelativeLayout[@index='2']",
			    NotificationIcon ="//android.widget.HorizontalScrollView[@resource-id='com.traveltriangle.traveller:id/sliding_tabs']/android.widget.LinearLayout[@index='0']/android.widget.RelativeLayout[@index='3']",
			    Menu="//android.widget.HorizontalScrollView[@resource-id='com.traveltriangle.traveller:id/sliding_tabs']/android.widget.LinearLayout[@index='0']/android.widget.RelativeLayout[@index='4']",
			    SearchTextBox="com.traveltriangle.traveller:id/search_edit_text",
			    BackIcon="com.traveltriangle.traveller:id/iv_navigate_up",
			    MYREQUESTS =  "//android.widget.TextView[@text='MY REQUESTS']",
			    TRAVELKITS = "//android.widget.TextView[@text='TRAVEL KITS']",
			     Filters="//android.widget.FrameLayout[@resource-id='com.traveltriangle.traveller:id/layout_filter']",
			    Sort="com.traveltriangle.traveller:id/layout_sort",
			     India="//android.widget.TextView[@text='India']/preceding-sibling::android.widget.CheckBox[@index='0']",
			     International="//android.widget.TextView[@text='International']/preceding-sibling::android.widget.CheckBox[@index='0']",
		  Destination_Type_CLEAR=" //android.widget.TextView[@text='Destination type)']/following-sibling::android.widget.Button[@text='CLEAR']";
			    		 
			    
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("BROWSER_NAME", "Android");
		capabilities.setCapability("deviceName", "REBEL");
		capabilities.setCapability("platformVersion", "6.0.1");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPackage", "com.traveltriangle.traveller");
		capabilities.setCapability("appActivity", "com.traveltriangle.traveller.HomeActivity");
		capabilities.setCapability("clearSystemFiles", "true");
		

		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		Thread.sleep(3000);

		System.out.println("App Launched");

		driver.findElement(By.xpath(SKIP)).click();
		Thread.sleep(2000);
		driver.findElement(By.id(CANCEL)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Globeicon)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(DESTINATIONS)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Filters)).click();
		Thread.sleep(5000);
        driver.findElement(By.xpath(India)).click();
		Thread.sleep(5000);
		 driver.findElement(By.xpath(International)).click();
		Thread.sleep(5000);
		 driver.findElement(By.xpath(Destination_Type_CLEAR)).click();
			Thread.sleep(5000);
		
		
		
		driver.findElement(By.id(Sort)).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(CATEGORIES)).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(SearchIcon)).click();
		Thread.sleep(5000);
		driver.findElement(By.id(SearchTextBox)).click();
		Thread.sleep(5000);
		driver.findElement(By.id(BackIcon)).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(MyRequestIcon)).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(MYREQUESTS)).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(TRAVELKITS)).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(NotificationIcon)).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(Menu)).click();
		Thread.sleep(5000);
		
		driver.quit();

	}

}
