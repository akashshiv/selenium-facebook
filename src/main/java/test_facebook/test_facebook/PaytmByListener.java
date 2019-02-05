package test_facebook.test_facebook;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class PaytmByListener {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/akash/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		Logger log = Logger.getLogger("paytm");
		PropertyConfigurator.configure("log4j.properties");
		
		EventFiringWebDriver event = new EventFiringWebDriver(driver);
		
		GenricEventListener register = new GenricEventListener();
		event.register(register);
		
		
		event.manage().window().maximize();
		log.info("Window maximised");
		
		event.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		log.info("Perform Implicit wait");
		
		event.get("https://paytm.com/");
		log.info("open site");
	}

}
