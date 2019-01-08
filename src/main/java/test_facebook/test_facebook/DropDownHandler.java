package test_facebook.test_facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandler {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","/Users/akash/Downloads/chromedriver");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.freecrm.com/index.html");
		driver.findElement(By.cssSelector(".navbar-form .form-control[name='username']")).sendKeys("seleniumcrmtest");
		driver.findElement(By.cssSelector(".navbar-form .form-control[name='password']")).sendKeys("Selenium@12345");
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".input-group-btn .btn.btn-small")).click();
		driver.switchTo().frame("mainpanel");
		Thread.sleep(3000);
		
		
		Select option = new Select(driver.findElement(By.cssSelector(".calendartitle .select[name='slctMonth']")));
		option.selectByVisibleText("March");
		
	}
}
