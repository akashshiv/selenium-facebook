package test_facebook.test_facebook;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import javax.imageio.ImageIO;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoggerForPaytm {

	public static void main(String[] args) throws AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "/Users/akash/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		 
		Logger log = Logger.getLogger("paytm");
		PropertyConfigurator.configure("log4j.properties");
	
		driver.manage().window().maximize();
		log.info("Browser maximized");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		log.info("Browser implycit time wait");
		
		driver.get("https://paytm.com/");
		log.info("Browser opened");
		
		Robot r= new Robot();
		log.info("Browser robot class");
		
		BufferedImage source = r.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		log.info("Browser screen captured");
		
		ImageIO.write(source, "jpg", new File("/Users/akash/Downloads/newImagescreenshot.jpg"));
		log.info("Browser screen saved");
		
		driver.quit();

	}

}
