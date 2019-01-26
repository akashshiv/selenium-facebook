package test_facebook.test_facebook;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Autosuggetion {

	public static void main(String[] args) throws InterruptedException {
		 
		System.setProperty("webdriver.chrome.driver", "/Users/akash/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		 
		driver.manage().window().maximize();
		 
		driver.get("http://www.google.com");
		 
		// Type something on Skill search box
		driver.findElement(By.cssSelector(".a4bIc .gLFyf.gsfi")).sendKeys("test");
		 
		// Create object on Actions class
		Actions builder=new Actions(driver);
		List<WebElement> link= new ArrayList<WebElement> ();
		Thread.sleep(3000);
		
		//Find element of all suggesion in search box
		link = driver.findElements(By.cssSelector(".sbct .sbtc .sbl1 span"));
		
		// use Mouse hover action for that element
		builder.moveToElement(link.get(5)).build().perform();
		 
		// Give wait for 2 seconds 
		Thread.sleep(2000);
		 
		// finally click on that element
		builder.click(link.get(5)).build().perform();
		
		driver.close();
	}
}
