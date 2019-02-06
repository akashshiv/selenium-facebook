package test_facebook.test_facebook;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleScrollSelfMade {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/akash/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		Logger log = Logger.getLogger("paytm");
		PropertyConfigurator.configure("log4j.properties");
		
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		
		driver.manage().window().maximize();
		log.info("Window maximised");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		log.info("Perform Implicit wait");
		
		driver.get("https://codepen.io/sdras/pen/PVjPKa");
		log.info("open site");
		
		Thread.sleep(4000);

		List<WebElement> list = new LinkedList<WebElement>();
		
		list = driver.findElements(By.cssSelector(".CodeMirror-scroll"));
		
		for(int i=0;i<50;i++) {
			js.executeScript("arguments[0].scrollTop="+i*10+";",list.get(0));
			Thread.sleep(100);
		}
		
		for(int i=0;i<50;i++) {
			js.executeScript("arguments[0].scrollTop="+i*10+";",list.get(1));
			Thread.sleep(100);
		}
		
		for(int i=0;i<50;i++) {
			js.executeScript("arguments[0].scrollTop="+i*10+";",list.get(2));
			Thread.sleep(100);
		}
	}

}
