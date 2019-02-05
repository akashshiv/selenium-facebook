package test_facebook.test_facebook;

import java.util.logging.Logger;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SetProxyForBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/akash/Downloads/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		Logger log = Logger.getLogger("paytm");
		Proxy prox = new Proxy();
		
		prox.setHttpProxy("localhost:7777");
		
		DesiredCapabilities option = new DesiredCapabilities();
		option.setCapability(CapabilityType.PROXY, prox);
		
		driver.manage().window().maximize();
		log.info("browser maximized");
		
		driver.get("https://paytm.com/");
		log.info("Browser opened");
		
		
	}

}
