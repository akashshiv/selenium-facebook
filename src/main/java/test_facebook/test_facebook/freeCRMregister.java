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
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.freecrm.com/index.html");
		List<WebElement> link = driver.findElements(By.cssSelector(".collapse.navbar-collapse .nav.navbar-nav.navbar-right a"));
		
		Thread.sleep(5000);
		link.get(1).click();
		
		Select option = new Select(driver.findElement(By.cssSelector(".form-group.has-feedback select.form-control.input-text")));
		
		option.selectByVisibleText("Free Edition");
		
		driver.findElement(By.cssSelector(".form-group.has-feedback .form-control.input-text[name='first_name']")).sendKeys("selenium");
		driver.findElement(By.cssSelector(".form-group.has-feedback .form-control.input-text[name='surname']")).sendKeys("freecrmtest");
		driver.findElement(By.cssSelector(".form-group.has-feedback .form-control.input-text[name='email']")).sendKeys("selenium12345@gmail.com");
		driver.findElement(By.cssSelector(".form-group.has-feedback .form-control.input-text[name='email_confirm']")).sendKeys("selenium12345@gmail.com");
		driver.findElement(By.cssSelector(".form-group.has-feedback .form-control.input-text[name='username']")).sendKeys("seleniumcrmtest");
		driver.findElement(By.cssSelector(".form-group.has-feedback .form-control.input-text[name='password']")).sendKeys("Selenium@12345");
		driver.findElement(By.cssSelector(".form-group.has-feedback .form-control.input-text[name='passwordconfirm']")).sendKeys("Selenium@12345");
		
		driver.findElement(By.cssSelector(".form-group.has-feedback [name='agreeTerms']")).click();
		driver.findElement(By.cssSelector(".myButton [name='submitButton']")).click();
		
		driver.findElement(By.cssSelector(".form-group.has-feedback .form-control.input-text[name='company_name']")).sendKeys("SeleniumTest");
		driver.findElement(By.cssSelector(".form-group.has-feedback .form-control.input-text[name='phone']")).sendKeys("7898787999");
		driver.findElement(By.cssSelector(".form-group .form-control.input-text[name='fax'")).sendKeys("fax@123");
		driver.findElement(By.cssSelector(".form-group .form-control.input-text[name='website']")).sendKeys("www.seleniumtestq.com");
		driver.findElement(By.cssSelector(".form-group.has-feedback .form-control.input-text[name='company_email']")).sendKeys("selenium2131@test.com");
		driver.findElement(By.cssSelector(".form-group .form-control.input-text[name='service'")).sendKeys("We provide better service opportunity");
		driver.findElement(By.cssSelector(".form-group .form-control.input-text[name='address']")).sendKeys("Remotely available");
		driver.findElement(By.cssSelector(".form-group .form-control.input-text[name='city'")).sendKeys("Gwalior");
		driver.findElement(By.cssSelector(".form-group .form-control.input-text[name='state']")).sendKeys("Madhya pradesh");
		driver.findElement(By.cssSelector(".form-group .form-control.input-text[name='postcode']")).sendKeys("476007");
		
		option = new Select(driver.findElement(By.cssSelector(".form-group [name='country']")));
		option.selectByVisibleText("India");
		
		driver.findElement(By.cssSelector(".form-group [name='copy_address']")).click();
		driver.findElement(By.cssSelector(".btnSubmit [name='btnSubmit']")).click();
		driver.findElement(By.cssSelector("button[name='finish']")).click();
		
	}

	
}
