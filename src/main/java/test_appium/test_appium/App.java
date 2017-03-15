package test_appium.test_appium;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class App {
	public static void Form1(AndroidDriver driver) throws MalformedURLException, InterruptedException {

		System.out.println("Form 1");
		driver.findElement(By
				.xpath("//android.view.ViewGroup[@resource-id='com.traveltriangle.traveller:id/fab_bottomMenu']/android.widget.ImageButton[@index='0']"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.android.packageinstaller:id/permission_deny_button")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.traveltriangle.traveller:id/destinationsSearchView")).sendKeys("Kerala");
		Thread.sleep(2000);
		driver.findElement(By.id("com.traveltriangle.traveller:id/inputCurrentLoc")).sendKeys("Noida");
		Thread.sleep(8000);

		driver.findElement(By
				.xpath("//android.widget.LinearLayout[@resource-id='com.traveltriangle.traveller:id/tripStageContainer']//android.widget.RelativeLayout[3]"))
				.click();
		Thread.sleep(2000);

		driver.findElement(By.id("com.traveltriangle.traveller:id/email")).sendKeys("kanika_1990@yopmail.com");
		Thread.sleep(2000);

		driver.findElement(By.id("com.traveltriangle.traveller:id/contact_num")).sendKeys("1024102448");
		Thread.sleep(2000);
		driver.findElement(By.id("com.traveltriangle.traveller:id/btn_submit")).click();
		Thread.sleep(8000);

	}

	public static void Form2(AndroidDriver driver) throws MalformedURLException, InterruptedException {

		System.out.println("Form 2");

		driver.findElement(By
				.xpath("//android.widget.LinearLayout[@resource-id='com.traveltriangle.traveller:id/ll_adult_container']//android.widget.TextView[4]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By
				.xpath("//android.widget.LinearLayout[@resource-id='com.traveltriangle.traveller:id/ll_child_container']//android.widget.TextView[1]"))
				.click();
		Thread.sleep(2000);

		driver.findElement(By
				.xpath("//android.widget.LinearLayout[@resource-id='com.traveltriangle.traveller:id/ll_container']//android.widget.LinearLayout[@index='0']//android.widget.Button[@index='0']"))
				.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//android.widget.Button[@text='Exclude']")).click();
		Thread.sleep(2000);
		driver.findElement(By
				.xpath("//android.widget.LinearLayout[@resource-id='com.traveltriangle.traveller:id/rangeContainer']//android.widget.LinearLayout[1]//android.widget.Button[1]"))
				.click();
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

	public static void Quotes(AndroidDriver driver) throws MalformedURLException, InterruptedException {
		driver.findElement(By
				.xpath("//android.widget.ListView[@resource-id='com.traveltriangle.traveller:id/listView']//android.widget.FrameLayout[@index='1']"))
				.click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//android.widget.Button[@text='Got It']")).getText());
		driver.findElement(By.xpath("//android.widget.Button[@text='Got It']")).click();
		Thread.sleep(5000);

		System.out.println(driver.findElement(By.id("txtAgentCompName")).getText());
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
		System.out.println(
				driver.findElement(By.xpath("//android.widget.TextView[@text='Traveler Information']")).getText());
		Thread.sleep(4000);
		System.out.println(driver.findElement(By.xpath("//android.widget.TextView[@text='Inclusions']")).getText());
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//android.widget.TextView[@text='Exclusions']")).getText());
		Thread.sleep(2000);

		System.out.println(driver.findElement(By.xpath("//android.widget.TextView[@text='Cabs for local sightseeing']"))
				.getText());
		Thread.sleep(3000);
		System.out.println(
				driver.findElement(By.xpath("//android.widget.TextView[@text='Terms & Conditions']")).getText());
		Thread.sleep(2000);

	}

	public static void BookNow(AndroidDriver driver) throws MalformedURLException, InterruptedException {
		driver.findElement(By
				.xpath("//android.widget.ListView[@resource-id='com.traveltriangle.traveller:id/listView']//android.widget.FrameLayout[@index='1']"))
				.click();
		Thread.sleep(3000);
	//	System.out.println(driver.findElement(By.xpath("//android.widget.TextView[@text='Debit Card/Credit Card']")).getText());
		driver.findElement(By.xpath("//android.widget.Button[@text='Reject Quote']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.Button[@text='CANCEL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.Button[@text='Reject Quote']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.RadioButton[@text='Want a different itinerary']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.Button[@text='REJECT QUOTE']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.Button[@text='Re-activate']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.Button[contains(@text,'BOOK FOR')]")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//android.widget.Button[@text='Wait for invoice']")).getText());
		System.out.println(driver.findElement(By.xpath("//android.widget.Button[@text='Pay Now']")).getText());
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath("//android.widget.Button[contains(@text,'PAY ')]")).click();
		Thread.sleep(5000);
		
		System.out.println(driver.findElement(By.xpath("//android.widget.TextView[@text='PAYMENT METHOD']")).getText());
		System.out.println(driver.findElement(By.xpath("//android.widget.TextView[@text='Saved Card']")).getText());
		System.out.println(driver.findElement(By.xpath("//android.widget.TextView[@text='Debit Card/Credit Card']")).getText());
		
		System.out.println(driver.findElement(By.xpath("//android.widget.TextView[@text='Net Banking']")).getText());
		
		System.out.println(driver.findElement(By.xpath("//android.widget.TextView[@text='NEFT']")).getText());
		
		System.out.println(driver.findElement(By.xpath("//android.widget.TextView[@text='Wallets']")).getText());
		
		System.out.println(driver.findElement(By.xpath("//android.widget.TextView[@text='PayU Money']")).getText());
		
		System.out.println(driver.findElement(By.xpath("//android.widget.TextView[@text='Emi - Credit Card']")).getText());
		
		System.out.println(driver.findElement(By.xpath("//android.widget.TextView[@text='Paytm']")).getText());
		

	}
	
	public static void Credit(AndroidDriver driver) throws MalformedURLException, InterruptedException{
		
		System.out.println("Credit called");
		/*driver.findElement(By
				.xpath("//android.widget.ListView[@resource-id='com.traveltriangle.traveller:id/listView']//android.widget.FrameLayout[1]"))
				.click();*/
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.Button[contains(@text,'PAY ')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Wallets']")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//android.widget.HorizontalScrollView[@resource-id='com.traveltriangle.traveller:id/tabs']//android.widget.LinearLayout[1]//android.widget.TextView[@index='0']")).getText());
		System.out.println(driver.findElement(By.xpath("//android.widget.HorizontalScrollView[@resource-id='com.traveltriangle.traveller:id/tabs']//android.widget.LinearLayout[1]//android.widget.TextView[@index='1']")).getText());
	
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//android.widget.TextView[@text='Processing Your Request']")).getText());
		
	}
	
public static void Package(AndroidDriver driver) throws MalformedURLException, InterruptedException{
		
		driver.findElement(By
				.xpath("//android.widget.HorizontalScrollView[@resource-id='com.traveltriangle.traveller:id/sliding_tabs']/android.widget.LinearLayout[@index='0']/android.widget.RelativeLayout[@index='0']"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Romantic']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Kerala']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.support.v4.view.ViewPager[@resource-id='com.traveltriangle.traveller:id/pager']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("com.traveltriangle.traveller:id/btn_sticky_text")).click();
		Thread.sleep(6000);
		
		
	}

public static void Wishlist(AndroidDriver driver) throws MalformedURLException, InterruptedException{
	
	driver.findElement(By
			.xpath("//android.widget.HorizontalScrollView[@resource-id='com.traveltriangle.traveller:id/sliding_tabs']/android.widget.LinearLayout[@index='0']/android.widget.RelativeLayout[@index='0']"))
			.click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//android.widget.TextView[@text='Romantic']")).click();
	Thread.sleep(3000);
	System.out.println(driver.findElement(By.xpath("//android.support.v7.widget.RecyclerView[@resource-id='com.traveltriangle.traveller:id/rv_destination']//android.widget.FrameLayout[1]//android.widget.TextView[@resource-id='com.traveltriangle.traveller:id/tv_destination_name']")).getText());
	Thread.sleep(3000);
	driver.findElement(By.xpath("//android.support.v7.widget.RecyclerView[@resource-id='com.traveltriangle.traveller:id/rv_destination']//android.widget.FrameLayout[1]//android.widget.CheckBox[@resource-id='com.traveltriangle.traveller:id/wishedItem']")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("com.traveltriangle.traveller:id/iconImage")).click();
	Thread.sleep(3000);
	System.out.println(driver.findElement(By.xpath("//android.support.v7.widget.RecyclerView[@resource-id='com.traveltriangle.traveller:id/rv_destination']//android.widget.LinearLayout[1]//android.widget.FrameLayout[1]//android.widget.RelativeLayout//android.widget.TextView[@resource-id='com.traveltriangle.traveller:id/tv_destination_name']")).getText());
	
	
}

public static void Cancelreq(AndroidDriver driver) throws MalformedURLException, InterruptedException{
	System.out.println("cancel Requset");
	driver.findElement(By
			.xpath("//android.widget.ImageButton[@index='0']"))
			.click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//android.widget.TextView[@text='Cancel Request']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//android.widget.RadioButton[@text='Not satisifed with the current quotes.']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//android.widget.Button[@text='CANCEL REQUEST']")).click();
	Thread.sleep(5000);
	driver.findElement(By
			.xpath("//android.widget.ImageButton[@index='0']"))
			.click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//android.widget.TextView[@text='Re-activate request']")).click();
	Thread.sleep(3000);
	
	
	
}

}
