package test_facebook.test_facebook;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class BlujeansAccessibilityTest {

	public static void main(String[] args) throws InterruptedException {
		
		HashMap<String,Object> preference = new HashMap<String,Object>();
		preference.put("profile.default_content_setting_values.notifications",2);
		
		System.setProperty("webdriver.chrome.driver", "/Users/akash/Downloads/chromedriver");
		
		ChromeOptions chromeoption = new ChromeOptions();
		chromeoption.addArguments("--disable-extentions");
		chromeoption.setExperimentalOption("prefs",preference);
		
		WebDriver driver = new ChromeDriver(chromeoption);
    	
		driver.get("https://a.bluejeans.com/266636122/7898/webrtc");
		
		//Actions a = new Actions(driver);
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector(".name")).sendKeys(Keys.TAB);
		
		for(int i=0; i< 10;i++)
		{
			Thread.sleep(3000);
			System.out.println(driver.switchTo().activeElement().getAttribute("class"));
			driver.switchTo().activeElement().sendKeys(Keys.TAB);
		}
		
		
		driver.quit();
	}

	
}
