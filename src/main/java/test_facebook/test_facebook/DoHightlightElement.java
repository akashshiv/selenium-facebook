package test_facebook.test_facebook;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DoHightlightElement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/akash/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		Logger log = Logger.getLogger("paytm");
		PropertyConfigurator.configure("log4j.properties");
		
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		
		driver.manage().window().maximize();
		log.info("Window maximised");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		log.info("Perform Implicit wait");
		
		driver.get("https://google.com");
		log.info("open site");
		
		WebElement element = driver.findElement(By.cssSelector(".a4bIc .gLFyf.gsfi"));
		
		js.executeScript("arguments[0].setAttribute('style','background: yellow; border: 2px solid red;')", element);
	}

}
