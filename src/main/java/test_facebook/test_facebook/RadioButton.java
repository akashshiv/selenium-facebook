package test_facebook.test_facebook;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

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
		
		driver.findElement(By.cssSelector(".noprint [title='Preferences']")).click();
		
		List<WebElement>  list = driver.findElements(By.cssSelector(".datafield [name='lookup_mode']"));
		
		Thread.sleep(10000);
		
//		If you element is visible but not enable to isenabled use for it
//		System.out.println(list.get(0).isEnabled());
//		System.out.println(list.get(1).isEnabled());
//		
//		
//		for checking element is selected or not.
//		System.out.println(list.get(1).isSelected());
//		list.get(1).click();
//		System.out.println(list.get(1).isSelected());
//		
//		System.out.println(list.get(0).isSelected());
		
		
		//If element is visible so it will give true 
		//if element is there but not visible so it will give you false 
		// if element is not there like Div is not there so it will give exception
		// but if element is not there so it will take time to element to find in whole DOM then it will give you null 
		//and on that null is selected perform and it will give you exception actually find elements give you exception
		
//		Thread.sleep(30000);
//		System.out.println(list.get(0).isDisplayed());
//		System.out.println(list.get(1).isDisplayed());
//		
//		System.out.println(list.get(0).isDisplayed());
//		System.out.println(list.get(1).isDisplayed());
//		
		//Exception
		WebElement div = driver.findElement(By.cssSelector(".datafield [name='lookup_mode'] [name='lookup_mode']"));
		System.out.println(div);
		//System.out.println(div.isDisplayed());
		
	}

}
