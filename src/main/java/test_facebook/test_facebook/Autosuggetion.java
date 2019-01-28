package test_facebook.test_facebook;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Autosuggetion {

	public static void main(String[] args) throws InterruptedException, AWTException {
		 
		System.setProperty("webdriver.chrome.driver", "/Users/akash/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		 
		driver.manage().window().maximize();
		 
		driver.get("http://www.google.com");
		 
		// Type something on Skill search box
		driver.findElement(By.cssSelector(".a4bIc .gLFyf.gsfi")).sendKeys("test plan");
		 
		// Create object on Actions class
		Actions builder=new Actions(driver);
		List<WebElement> link= new ArrayList<WebElement> ();
		Thread.sleep(3000);
		
		//Find element of all suggesion in search box
		link = driver.findElements(By.cssSelector(".sbct .sbtc .sbl1 span"));
		 
		// Give wait for 2 seconds 
		Thread.sleep(2000);
		 
		 // use Mouse hover action for that element
		builder.moveToElement(link.get(0)).build().perform();
		
		// finally click on that element
		builder.click(link.get(5)).build().perform();
		
		link = driver.findElements(By.cssSelector(".rc .r a"));
		
		builder.contextClick(link.get(6)).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		
		//driver.close();
	}
}
