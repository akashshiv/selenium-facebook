package test_facebook.test_facebook;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWait {

	public static void main(String[] args) throws InterruptedException
	{
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
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".a4bIc .gLFyf.gsfi1")));
		
		System.out.print(element.isDisplayed());
		
	}
}
