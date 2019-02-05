package test_facebook.test_facebook;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ScrollingForMultipleScroll {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/akash/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		Logger log = Logger.getLogger("paytm");
		PropertyConfigurator.configure("log4j.properties");
		
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		EventFiringWebDriver event = new EventFiringWebDriver(driver);
		
		GenricEventListener register = new GenricEventListener();
		event.register(register);
		
		
		event.manage().window().maximize();
		log.info("Window maximised");
		
		event.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		log.info("Perform Implicit wait");
		
		event.get("https://codepen.io/sdras/pen/PVjPKa");
		log.info("open site");
		
		Thread.sleep(4000);

			event.executeScript("document.querySelector('.CodeMirror-scroll').scrollTop=100");
			Thread.sleep(100);
		

	}

}
