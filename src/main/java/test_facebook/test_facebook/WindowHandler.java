package test_facebook.test_facebook;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandler {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/akash/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		 
		driver.manage().window().maximize();
		 
		driver.get("http://naukri.com");
		 
		String parent = driver.getWindowHandle();
		Set<String> s = driver.getWindowHandles();
		
		Iterator<String> itr = s.iterator();
		
		while(itr.hasNext())
		{
			String child = itr.next();
			if(!parent.equals(child))
			{
				Thread.sleep(5000);
				driver.switchTo().window(child);
				System.out.println(driver.getTitle());
				driver.close();
			}
		}
		
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
	}

}
