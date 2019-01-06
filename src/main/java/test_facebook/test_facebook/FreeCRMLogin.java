package test_facebook.test_facebook;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class FreeCRMLogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/Users/akash/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.freecrm.com/index.html");
		
		driver.findElement(By.cssSelector(".navbar-form .form-control[name='username']")).sendKeys("seleniumcrmtest");
		driver.findElement(By.cssSelector(".navbar-form .form-control[name='password']")).sendKeys("Selenium@12345");
		
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector(".input-group-btn .btn.btn-small")).click();
		
		Thread.sleep(3000);
		driver.switchTo().frame("mainpanel");
		
//		This one we can click because it a button
//		Thread.sleep(3000);
//		List<WebElement> list= driver.findElements(By.cssSelector(".noprint a[title='Call List']"));
//		
//		list.get(1).click();
//		
		
//		 Not available because this one available on list first you have to click on list then drop down will come then 
//		 you can click on it.
//		Thread.sleep(3000);
//		List<WebElement> list= driver.findElements(By.cssSelector(".noprint a[title='Call List']"));
//		
//		list.get(0).click();
		
//		This one only once place and form of button so it you try 1 index of list it will fail.
//		Thread.sleep(3000);
//		List <WebElement> list= driver.findElements(By.cssSelector(".noprint a[title='Schedule Call']"));
//		
//		list.get(0).click();
	
	}

}
