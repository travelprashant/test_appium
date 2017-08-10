package test_appium.test_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestSel {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		setUp();
		driver.get("http://traveltriangle.com/himachal-tourism");
		Thread.sleep(5000);
		System.out.println("First");
		System.out.println(driver.findElement(By.xpath("//h2[text()='Our Traveler Stories']")).getText());
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//h2[contains(text(),'Let's Go, Discover!')]")).getText());
		Thread.sleep(5000);
		driver.quit();
	}

	public static void setUp() {
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", "/home/travel/Documents/workspace/test_appium/chromedriver");
        /*ChromeOptions options = new ChromeOptions();

        options.addArguments("headless");

        options.addArguments("window-size=1200x600");*/
		driver = new ChromeDriver();
	}

}
