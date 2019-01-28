package test_facebook.test_facebook;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;


import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/akash/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.cssSelector(".a4bIc .gLFyf.gsfi")).sendKeys("test plan");
		
		Actions builder=new Actions(driver);
		List<WebElement> link= new ArrayList<WebElement> ();
		Thread.sleep(3000);
		
		//Find element of all suggesion in search box
		link = driver.findElements(By.cssSelector(".sbct .sbtc .sbl1 span"));
		
		builder.click(link.get(0)).build().perform();
		
		@SuppressWarnings("deprecation")
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(30, TimeUnit.SECONDS) 			
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		
		WebElement clicks= wait.until(new Function<WebDriver, WebElement>(){
			
			public WebElement apply(WebDriver driver ) {
				return driver.findElement(By.cssSelector(".a4bIc .gLFyf.gsfi1"));
			}
		});
		
		clicks.click();
	}

}
