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
				floating_icon="//android.view.ViewGroup[@resource-id='com.traveltriangle.traveller:id/fab_bottomMenu']/android.widget.ImageButton[@index='0']";
		
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("BROWSER_NAME", "Android");
		capabilities.setCapability("deviceName", "Android");
		capabilities.setCapability("platformVersion", "6.0.1");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPackage", "com.traveltriangle.traveller");
		capabilities.setCapability("appActivity", "com.traveltriangle.traveller.HomeActivity");
		capabilities.setCapability("clearSystemFiles", "true");

		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		Thread.sleep(3000);

		System.out.println("App Launched");
		
		/*Thread.sleep(5000);
		driver.findElement(By.id("btn_skip")).click();
		Thread.sleep(2000);
		driver.findElement(By.id(CANCEL)).click();
		Thread.sleep(2000);*/
		driver.findElement(By.xpath(Globeicon)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.HorizontalScrollView[@resource-id='com.traveltriangle.traveller:id/sliding_tabs']/android.widget.LinearLayout[@index='0']/android.widget.RelativeLayout[@index='2']")).click();
		Thread.sleep(5000);
	    
		StartApplication.Quotes();
		//driver.runAppInBackground(1);
		StartApplication.Form1();
	//StartApplication.Form2();
		
		
		
		driver.quit();

	}
	
	public static void Form1() throws MalformedURLException, InterruptedException{
		
		System.out.println("Form 1");
		driver.findElement(By.xpath("//android.view.ViewGroup[@resource-id='com.traveltriangle.traveller:id/fab_bottomMenu']/android.widget.ImageButton[@index='0']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("permission_deny_button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("com.traveltriangle.traveller:id/destinationsSearchView")).sendKeys("Kerala");
		Thread.sleep(2000);
		driver.findElement(By.id("com.traveltriangle.traveller:id/inputCurrentLoc")).sendKeys("Noida");
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("//android.widget.LinearLayout[@resource-id='com.traveltriangle.traveller:id/tripStageContainer']//android.widget.RelativeLayout[3]")).click();
		Thread.sleep(2000);
		/*driver.findElement(By.id("com.traveltriangle.traveller:id/email")).sendKeys("kanika_1990@yopmail.com");
		Thread.sleep(2000);*/
		driver.findElement(By.id("com.traveltriangle.traveller:id/contact_num")).sendKeys("1024102448");
		Thread.sleep(2000);
		driver.findElement(By.id("com.traveltriangle.traveller:id/btn_submit")).click();
		Thread.sleep(8000);
		
	}
	
   public static void Form2() throws MalformedURLException, InterruptedException{
		
	   System.out.println("Form 2");
		/*driver.findElement(By.xpath("//android.widget.LinearLayout[@resource-id='com.traveltriangle.traveller:id/ll_adult_container']//android.widget.TextView[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.LinearLayout[@resource-id='com.traveltriangle.traveller:id/ll_child_container']//android.widget.TextView[1]")).click();
		Thread.sleep(2000);*/
		driver.findElement(By.xpath("//android.widget.LinearLayout[@resource-id='com.traveltriangle.traveller:id/ll_container']//android.widget.LinearLayout[@index='0']//android.widget.Button[@index='0']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//android.widget.Button[@text='Exclude']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.LinearLayout[@resource-id='com.traveltriangle.traveller:id/rangeContainer']//android.widget.LinearLayout[1]//android.widget.Button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Button[@text=' Yes ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Button[@text=' Small (driver + 3) ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Button[@text=' English ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.RadioButton[@text=' later sometime ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.CheckBox[@text=' Kochi ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.RadioButton[@text=' Adventure ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.traveltriangle.traveller:id/btn_submit")).click();
		Thread.sleep(2000);
	}
   
   public static void Quotes() throws MalformedURLException, InterruptedException{
	   driver.findElement(By.xpath("//android.widget.ListView[@resource-id='com.traveltriangle.traveller:id/listView']//android.widget.FrameLayout[@index='1']")).click();
		Thread.sleep(2000);
		/*System.out.println(driver.findElement(By.id("txtAgentCompName")).getText());
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("btnCall")).getText());
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("btnRequestCall")).getText());
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("btnMessage")).getText());
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("txtTripPlace")).getText());
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("txt_new_price")).getText());
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("getOffersBtn")).getText());
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("txt_itinerary")).getText());
		Thread.sleep(4000);
		System.out.println(driver.findElement(By.id("btn_schedule")).getText());
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//android.widget.TextView[@text='Traveler Information']")).getText());
		Thread.sleep(4000);
		System.out.println(driver.findElement(By.xpath("//android.widget.TextView[@text='Inclusions']")).getText());
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//android.widget.TextView[@text='Exclusions']")).getText());
		Thread.sleep(2000);*/
		System.out.println(driver.findElement(By.xpath("//android.widget.TextView[@text='Cabs for local sightseeing']")).getText());
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//android.widget.TextView[@text='Terms & Conditions']")).getText());
		Thread.sleep(2000);
		
		
	   
   }
   
   

}
