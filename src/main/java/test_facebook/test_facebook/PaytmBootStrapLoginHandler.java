package test_facebook.test_facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaytmBootStrapLoginHandler {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/akash/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://paytm.com/");
		
		//Here implicit wait won't work so we need to use sleep because implicit wait work for all element are present or not 
		//some time all elements present but focus is not visible on it so that time implicit wait won't work on it.
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("._3huM ._1Vt1 ._3ac-")).click();
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("._1MBe.transparent ._1AkQ iframe")));
		
		driver.findElement(By.cssSelector(".qrcode-footer-text [screen-name='auth-init/QRlogin']")).click();;
	}

}
