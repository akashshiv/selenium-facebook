package test_facebook.test_facebook;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class freeCRMregister {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/akash/Downloads/chromedriver");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.freecrm.com/index.html");
		List<WebElement> link = driver.findElements(By.cssSelector(".collapse.navbar-collapse .nav.navbar-nav.navbar-right a"));
		
		Thread.sleep(5000);
		link.get(1).click();
		
		Select option = new Select(driver.findElement(By.cssSelector(".form-group.has-feedback select.form-control.input-text")));
		
		option.selectByVisibleText("Free Edition");
		
		driver.findElement(By.cssSelector(".form-group.has-feedback .form-control.input-text[name='first_name']")).sendKeys("selenium");
		driver.findElement(By.cssSelector(".form-group.has-feedback .form-control.input-text[name='surname']")).sendKeys("freecrmtest");
		driver.findElement(By.cssSelector(".form-group.has-feedback .form-control.input-text[name='email']")).sendKeys("selenium23451@gmail.com");
		driver.findElement(By.cssSelector(".form-group.has-feedback .form-control.input-text[name='email_confirm']")).sendKeys("selenium23451@gmail.com");
		driver.findElement(By.cssSelector(".form-group.has-feedback .form-control.input-text[name='username']")).sendKeys("seleniumfreecrmtest");
		driver.findElement(By.cssSelector(".form-group.has-feedback .form-control.input-text[name='password']")).sendKeys("Selenium@12345");
		driver.findElement(By.cssSelector(".form-group.has-feedback .form-control.input-text[name='passwordconfirm']")).sendKeys("Selenium@12345");
		
		driver.findElement(By.cssSelector(".form-group.has-feedback [name='agreeTerms']")).click();
		driver.findElement(By.cssSelector(".myButton [name='submitButton']")).click();

		

		
	}

	
}
