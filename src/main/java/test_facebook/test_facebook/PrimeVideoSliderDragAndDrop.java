package test_facebook.test_facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PrimeVideoSliderDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/akash/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.primevideo.com/detail/0H7I8WKCDHA16CZZCCBEBZEP1T/ref=atv_hm_hom_c_8pZiqd_2_1");
		
		driver.findElement(By.cssSelector(".av-nav-accounts-single-link .av-nav-link-with-droplist ._2m95Bc")).click();
		driver.findElement(By.cssSelector(".a-input-text.a-span12.auth-autofocus.auth-required-field")).sendKeys("hemant.sharma010@gmail.com");
		driver.findElement(By.cssSelector(".a-input-text.a-span12.auth-required-field[name='password']")).sendKeys("hemant063");
		driver.findElement(By.cssSelector(".a-button-input")).click();
		
		Thread.sleep(3000);
//		driver.findElement(By.cssSelector(".DigitalVideoWebNodeStorefront_Card__Image [src='https://images-eu.ssl-images-amazon.com/images/"
//				                             +"S/sgp-catalog-images/region_GLOBAL/wb-888574345020_IN-Full-Image_GalleryCover-in-IN"
//				                             +"-1481934511402._UR1920,1080_RI_SX356_FMjpg_.jpg']")).click();
//		
		driver.findElement(By.cssSelector(".av-playbutton-wrapper.dv-record-reftag.avu-full-width-phablet .av-play"
											+"-icon .av-icon.av-icon--play-button-arrow")).click();
		Thread.sleep(5000);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.cssSelector(".seekBar .progressBarContainer .progressBarHandleWrapper"))).build().perform();;
		
		Thread.sleep(5000);
		action.dragAndDropBy(driver.findElement(By.cssSelector(".seekBar .progressBarContainer .progressBarHandleWrapper")), 50, 0);
	}

}
