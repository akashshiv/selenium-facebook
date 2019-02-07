package test_facebook.test_facebook;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConnectFromLinkByHTTP {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "/Users/akash/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		Logger log = Logger.getLogger("paytm");
		PropertyConfigurator.configure("log4j.properties");
		
		driver.manage().window().maximize();
		log.info("Window maximised");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		log.info("Perform Implicit wait");
		
	    URL url = new URL("http://www.google.com");
	    
	    HttpURLConnection httpconnect= (HttpURLConnection)url.openConnection();
	    httpconnect.connect();
	    
	    if(httpconnect.getResponseCode() == 200)
	    {
	    	System.out.print("hi");
	    }
 		log.info("open site");
	}

}
