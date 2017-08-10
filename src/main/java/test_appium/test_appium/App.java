package test_appium.test_appium;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.Activity;

public class App {
	
	 static DateFormat dateFormat;
	 
	 public static  String APP_ACTIVITY_LIST = ".LoginActivity,.SignUpActivity,.QuoteViewActivity,com.facebook.FacebookActivity,"
				+".HomeActivity,com.clevertap.android.sdk.InAppNotificationActivity,.ViewActivity,.SearchActivity,.DestinationDetailActivity,"
				+".ContactUsActivity,.ThankYouMessageActivity,.ViewPhotosActivity,.ViewMoreActivity,.QuoteItineraryActivity,.TravelerInfoDetailActivity,"
				+".NotificationsActivity,.ChangePasswordActivity,.AllBookingsActivity,.MapActivity,.RequestCreationActivity,.PaymentActivity,"
				+".PaymentBrowserActivity,.PaymentNewBrowserActivity,.QuoteSelectionActivity,.CompareQuoteActivity,.ComparePackageActivity,.VouchersActivity,"
				+".AttachmentBuilderActivity,com.soundcloud.android.crop.CropImageActivity, .AgentProfileDetailActivity,.WishlistActivity,.CallbackRequestActivity,.PackageDetailActivity,com.paytm.pgsdk.PaytmPGActivity,"
				+".ProfileActivity,.InvoiceActivity,.PackageItineraryActivity,.PackageListActivity,.DestinationCatalogActivity,.InAppBrowserActivity,.HotelDetailActivity,.QuoteAccommodationActivity,.OffersActivity,.RequestCallbackActivity";
	
 public static void swipe(String swipeType,AndroidDriver driver){
		int screenWidth = 0;
		int screenHight = 0;
		Dimension screenSize = driver.manage().window().getSize();
		screenWidth = Integer.valueOf(String.valueOf(screenSize
				.getWidth())) / 2;
		screenHight = Integer.valueOf(String.valueOf(screenSize
				.getHeight())) / 2;
		
		if(swipeType.trim().toLowerCase().contains("up")){
			driver.swipe(screenWidth, (2*screenHight)-240, screenWidth, screenHight, 2000);	
		}else if(swipeType.trim().toLowerCase().contains("down")){
			driver.swipe(screenWidth, screenHight, screenWidth, (2*screenHight)-100, 2000);	
		}
		else if(swipeType.trim().toLowerCase().contains("left")){
			
			driver.swipe((2*screenWidth)-100, screenHight, 20, screenHight, 2000);
		}
	 
	}
	

	
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
				.xpath("//android.widget.RadioButton[@text=’Anytime’]"))
				.click();
		Thread.sleep(2000);
		
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
		/*driver.findElement(By.xpath("//android.widget.TextView[@text='Read More']")).click();
		Thread.sleep(3000);*/
		System.out.println(driver.findElement(By.xpath("//android.widget.Button[@text='Read Less']")).getText());
		
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
	MobileElement el = (MobileElement) driver.findElementByAndroidUIAutomator("text('Log in')");
	System.out.println(el.isDisplayed());
	
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

public static void CompareQuote(AndroidDriver driver) throws MalformedURLException, InterruptedException{
	System.out.println("CompareQuote");
	driver.findElement(By
			.xpath("//android.widget.ListView[@resource-id='com.traveltriangle.traveller:id/listView']//android.widget.FrameLayout[1]"))
			.click();
	Thread.sleep(3000);
	System.out.println(driver.findElement(By.xpath("//android.widget.HorizontalScrollView[@resource-id='com.traveltriangle.traveller:id/sliding_tabs']//android.widget.LinearLayout[1]//android.widget.RelativeLayout[1]//android.widget.TextView[@resource-id='com.traveltriangle.traveller:id/agent_name']")).getText());
	System.out.println(driver.findElement(By.xpath("//android.widget.HorizontalScrollView[@resource-id='com.traveltriangle.traveller:id/sliding_tabs']//android.widget.LinearLayout[1]//android.widget.RelativeLayout[1]//android.widget.TextView[@resource-id='com.traveltriangle.traveller:id/price']")).getText());
	System.out.println(driver.findElement(By.xpath("//android.widget.HorizontalScrollView[@resource-id='com.traveltriangle.traveller:id/sliding_tabs']//android.widget.LinearLayout[1]//android.widget.RelativeLayout[2]//android.widget.TextView[@resource-id='com.traveltriangle.traveller:id/agent_name']")).getText());
	System.out.println(driver.findElement(By.xpath("//android.widget.HorizontalScrollView[@resource-id='com.traveltriangle.traveller:id/sliding_tabs']//android.widget.LinearLayout[1]//android.widget.RelativeLayout[2]//android.widget.TextView[@resource-id='com.traveltriangle.traveller:id/price']")).getText());
	Thread.sleep(3000);
	driver.findElement(By.xpath("//android.widget.ListView[@resource-id='com.traveltriangle.traveller:id/quote_list']//android.widget.FrameLayout[@index='1']//android.widget.LinearLayout[1]//android.widget.CheckBox[1]")).click();
	Thread.sleep(000);	
	
}

public static void ComparePackage(AndroidDriver driver) throws MalformedURLException, InterruptedException{
	System.out.println("ComparePackage");
	driver.findElement(By
			.xpath("//android.widget.HorizontalScrollView[@resource-id='com.traveltriangle.traveller:id/sliding_tabs']/android.widget.LinearLayout[@index='0']/android.widget.RelativeLayout[@index='0']"))
			.click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//android.widget.TextView[@text='Romantic']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//android.widget.TextView[@text='Kerala']")).click();
	Thread.sleep(3000);
	swipe("up", driver);
	driver.findElement(By.id("com.traveltriangle.traveller:id/action_share")).click();
	/*driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'View all')]")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//android.support.v7.widget.RecyclerView[@resource-id='com.traveltriangle.traveller:id/recyclerView']//android.widget.RelativeLayout[2]//android.widget.CheckBox[@resource-id='com.traveltriangle.traveller:id/wished_item']")).click();
	Thread.sleep(3000);
	swipe("up", driver);
	driver.findElement(By.xpath("//android.support.v7.widget.RecyclerView[@resource-id='com.traveltriangle.traveller:id/recyclerView']//android.widget.RelativeLayout[2]//android.widget.CheckBox[@resource-id='com.traveltriangle.traveller:id/wished_item']")).click();
	Thread.sleep(3000);
	swipe("up", driver);
	swipe("up", driver);
	driver.findElement(By.xpath("//android.support.v7.widget.RecyclerView[@resource-id='com.traveltriangle.traveller:id/recyclerView']//android.widget.RelativeLayout[2]//android.widget.CheckBox[@resource-id='com.traveltriangle.traveller:id/wished_item']")).click();
	Thread.sleep(3000);
	swipe("up", driver);
	swipe("up", driver);
	driver.findElement(By.xpath("//android.support.v7.widget.RecyclerView[@resource-id='com.traveltriangle.traveller:id/recyclerView']//android.widget.RelativeLayout[2]//android.widget.CheckBox[@resource-id='com.traveltriangle.traveller:id/wished_item']")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("com.traveltriangle.traveller:id/iconImage")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("com.traveltriangle.traveller:id/addToCompare")).click();
	Thread.sleep(3000);
	swipe("up", driver);
	swipe("up", driver);
	driver.findElement(By.id("com.traveltriangle.traveller:id/addToCompare")).click();
	Thread.sleep(3000);
	swipe("up", driver);
	swipe("up", driver);
	driver.findElement(By.id("com.traveltriangle.traveller:id/addToCompare")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("com.traveltriangle.traveller:id/compare")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//android.widget.TextView[@text='SUMMARY']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//android.widget.TextView[@text='HOTELS']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//android.widget.TextView[@text=\"WHAT'S INCLUDED\"]")).click();
	Thread.sleep(3000);*/
	
}

public static void Sort(AndroidDriver driver) throws MalformedURLException, InterruptedException{
	System.out.println("Sort");
	driver.findElement(By
			.xpath("//android.widget.HorizontalScrollView[@resource-id='com.traveltriangle.traveller:id/sliding_tabs']/android.widget.LinearLayout[@index='0']/android.widget.RelativeLayout[@index='0']"))
			.click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//android.widget.TextView[@text='DESTINATIONS']")).click();
	Thread.sleep(8000);
	driver.findElement(By.id("com.traveltriangle.traveller:id/layout_sort")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//android.widget.TextView[@text='Price - L To H']")).click();
	Thread.sleep(3000);
	List ll=driver.findElements(By.id("com.traveltriangle.traveller:id/tv_destination_name"));
	System.out.println(ll.size());
	System.out.println(driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.traveltriangle.traveller:id/tv_destination_name']")).getText());
	swipe("up", driver);
	swipe("up", driver);
	Thread.sleep(5000);
	System.out.println(driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.traveltriangle.traveller:id/tv_destination_name'][1]")).getText());
	swipe("up", driver);
	swipe("up", driver);
	Thread.sleep(5000);
	System.out.println(driver.findElement(By.id("com.traveltriangle.traveller:id/tv_destination_name")).getText());
	swipe("up", driver);
	swipe("up", driver);
	Thread.sleep(5000);
	System.out.println(driver.findElement(By.id("com.traveltriangle.traveller:id/tv_destination_name")).getText());
	swipe("up", driver);
	swipe("up", driver);
	Thread.sleep(5000);
	System.out.println(driver.findElement(By.id("com.traveltriangle.traveller:id/tv_destination_name")).getText());
	
}

public static void fireIntent (AndroidDriver driver)throws MalformedURLException, InterruptedException{
	System.out.println("fireIntent");
	//".PackageListActivity,.DestinationCatalogActivity"
	//String deeplink="http://traveler-api.ttdev.in/travel-to/165-Gujarat";
	String deeplink="http://bookings-qa4.ttdev.in/handle_link_authentication?new_page=http%3A%2F%2Fbookings-qa4.ttdev.in%2Frequested_trips%2F1623842-Tt-App&token=RDDLyuiB0t5oorxKJvvaX%2Bg56GiISiWjUVsrjDLT9ys%3D&cta_role=traveller&utm_nooverride=1&tracked_email_id=7135995&quote_id=2923519&tt_mailer=quote_summary&trip_id=1623842";
	
	try{
	driver.startActivity("com.traveltriangle.traveller", "com.traveltriangle.traveller.HomeActivity", "com.traveltriangle.traveller",APP_ACTIVITY_LIST, "", "", "", " -a android.intent.action.VIEW -d "+deeplink );
	//Activity activity = new Activity("com.traveltriangle.traveller", "com.traveltriangle.traveller.HomeActivity");
	//driver.startActivity(activity);
	Thread.sleep(10000);
	System.out.println(driver.currentActivity());
	//System.out.println(driver.findElement(By.xpath("//android.widget.TextView[@text='Kerala']")).getText());
	}
	catch(Exception e){
		System.out.println(e.getMessage());
	}
	
}

public static void takeScreenShot(AndroidDriver driver) throws MalformedURLException, InterruptedException{
	
	String destDir = "screenshots";
	  // Capture screenshot.
	  File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	  // Set date format to set It as screenshot file name.
	  dateFormat = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
	  // Create folder under project with name "screenshots" provided to destDir.
	  new File(destDir).mkdirs();
	  // Set file name using current date time.
	  String destFile = dateFormat.format(new Date()) + ".png";

	  try {
	   // Copy paste file at destination folder location
	   FileUtils.copyFile(scrFile, new File(destDir + "/" + destFile));
	  } catch (IOException e) {
	   e.printStackTrace();
	  }
	
}

}


