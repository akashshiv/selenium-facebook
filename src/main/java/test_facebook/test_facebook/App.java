package test_facebook.test_facebook;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	HashMap<String,Object> preference = new HashMap<String,Object>();
    	preference.put("profile.default_content_setting_values.notifications",2);
    	
    	System.setProperty("webdriver.chrome.driver","/Users/akash/Downloads/chromedriver");
     
    	ChromeOptions chromeoption =new ChromeOptions();
    	chromeoption.addArguments("--disable-extentions");
    	chromeoption.setExperimentalOption("prefs",preference);
    	
    	WebDriver driver= new ChromeDriver(chromeoption);
        
        driver.get("http://www.facebook.com");
        
        driver.findElement(By.cssSelector(".uiStickyPlaceholderInput.uiStickyPlaceholderEmptyInput input[name=\"firstname\"]")).sendKeys(Keys.TAB);
        driver.findElement(By.cssSelector(".uiStickyPlaceholderInput.uiStickyPlaceholderEmptyInput input[name=\"lastname\"]")).sendKeys(Keys.TAB);
        driver.findElement(By.cssSelector(".uiStickyPlaceholderInput.uiStickyPlaceholderEmptyInput input[name=\"reg_email__\"]")).sendKeys(Keys.TAB);
        driver.findElement(By.cssSelector(".uiStickyPlaceholderInput.uiStickyPlaceholderEmptyInput input[name=\"reg_passwd__\"]")).sendKeys(Keys.TAB);
        
        //driver.findElement(By.cssSelector(".uiStickyPlaceholderInput.uiStickyPlaceholderEmptyInput input[name=\"reg_email_confirmation__\"]")).sendKeys("selenium.test12345rt@gmail.com");
        
        Select option = new Select(driver.findElement(By.cssSelector("._5k_4 select[name=\"birthday_day\"]")));
        
        option.selectByValue("15");
        
        option = new Select(driver.findElement(By.cssSelector("._5k_4 select[name=\"birthday_month\"]")));
        
        option.selectByValue("3");
        
        option = new Select(driver.findElement(By.cssSelector("._5k_4 select[name=\"birthday_year\"]")));
        
        option.selectByValue("1994");
        
        driver.findElement(By.cssSelector("._5k_2._5dba [value=\"2\"]")).click();

        driver.findElement(By.cssSelector(".clearfix button[name=\"websubmit\"]")).click();
        
        try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			
		}
        driver.quit();
    }
}
