package test_facebook.test_facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class GenricEventListener implements WebDriverEventListener{

	public void afterAlertAccept(WebDriver arg0) {
		
	}

	public void afterAlertDismiss(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	public void afterChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		// TODO Auto-generated method stub
		
	}

	public void afterClickOn(WebElement arg0, WebDriver arg1) {
		System.out.println("------------------------------");
		System.out.println("Aftre Click"+arg0.toString());
		System.out.println("Aftre Click"+arg1.toString());
		System.out.println("------------------------------");
	}

	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		System.out.println("------------------------------");
		System.out.println("Aftre FindBy"+arg0.toString());
		System.out.println("Aftre FindBy"+arg1.toString());
		System.out.println("Aftre FindBy"+arg2.toString());
		System.out.println("------------------------------");
		
	}

	public <X> void afterGetScreenshotAs(OutputType<X> arg0, X arg1) {
		// TODO Auto-generated method stub
		
	}

	public void afterGetText(WebElement arg0, WebDriver arg1, String arg2) {
		// TODO Auto-generated method stub
		
	}

	public void afterNavigateBack(WebDriver arg0) {
		System.out.println("------------------------------");
		System.out.println("Aftre NavigationBack"+arg0.toString());
		System.out.println("------------------------------");	
	}

	public void afterNavigateForward(WebDriver arg0) {
		System.out.println("------------------------------");
		System.out.println("Aftre NavigationForward"+arg0.toString());
		System.out.println("------------------------------");
	}

	public void afterNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	public void afterNavigateTo(String arg0, WebDriver arg1) {
		System.out.println("------------------------------");
		System.out.println("Aftre NavigatteTo"+arg0.toString());
		System.out.println("Aftre NavigatteTo"+arg1.toString());
		System.out.println("------------------------------");
	}

	public void afterScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	public void afterSwitchToWindow(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	public void beforeAlertAccept(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	public void beforeAlertDismiss(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		// TODO Auto-generated method stub
		
	}

	public void beforeClickOn(WebElement arg0, WebDriver arg1) {
		System.out.println("------------------------------");
		System.out.println("Before ClickOn"+arg0.toString());
		System.out.println("Before ClickOn"+arg1.toString());
		System.out.println("------------------------------");
	}

	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		System.out.println("------------------------------");
		System.out.println("Before BeforeFindBy"+arg0.toString());
		System.out.println("Before BeforeFindBy"+arg1.toString());
		System.out.println("------------------------------");
	}

	public <X> void beforeGetScreenshotAs(OutputType<X> arg0) {
		// TODO Auto-generated method stub
		
	}

	public void beforeGetText(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	public void beforeNavigateBack(WebDriver arg0) {
		System.out.println("------------------------------");
		System.out.println("Before NavigateBack"+arg0.toString());
		System.out.println("------------------------------");
	}

	public void beforeNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	public void beforeNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	public void beforeNavigateTo(String arg0, WebDriver arg1) {
		System.out.println("------------------------------");
		System.out.println("Before NavigateTo"+arg0.toString());
		System.out.println("Before NavigateTo"+arg1.toString());
		System.out.println("------------------------------");
	}

	public void beforeScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	public void beforeSwitchToWindow(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	public void onException(Throwable arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

}
