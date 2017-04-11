package test_appium.test_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSel {

	 public static WebDriver driver;
	 
		public static void main(String []args) {
			setUp();
			driver.navigate().to("http://google.com");
		}
		
		public static void setUp(){
			System.out.println("launching chrome browser");
			System.setProperty("webdriver.chrome.driver","/home/travel/Documents/workspace/test_appium/chromedriver");
			driver = new ChromeDriver();
		}

}
