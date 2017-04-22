package test_appium.test_selenium;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSel {

	public static WebDriver driver;

	public static void main(String[] args) {
		setUp();
		driver.get("http://traveltriangle.com/Tour-Packages");
		String oldTab = driver.getWindowHandle();
		driver.findElement(By.linkText("View Details")).click();
		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		newTab.remove(oldTab);
		driver.switchTo().window(newTab.get(0));
		driver.switchTo().window(oldTab);
	}

	public static void setUp() {
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", "/home/travel/Documents/workspace/test_appium/chromedriver");
		driver = new ChromeDriver();
	}

}
