package test_facebook.test_facebook;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotByRobot {

	public static void main(String[] args) throws IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "/Users/akash/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://paytm.com/");
		
		Robot r= new Robot();
		BufferedImage source = r.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
	
		
		ImageIO.write(source, "jpg", new File("/Users/akash/Downloads/newImagescreenshot.jpg"));
		//driver.quit();
	}

}
