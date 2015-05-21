package stepDefination;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;

public class GoogleSearchSteps {
//	private WebUIWorkFlow _webUIWorkFlow;
	
	public GoogleSearchSteps(){
//		_webUIWorkFlow = new WebUIWorkFlow();
	}
	
	@Given("^As user viewing Google Search page$")
	public void as_user_viewing_Google_Search_page() throws Throwable {
		WebDriver driver;
		driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.store.demoqa.com");
//		WebUIWorkFlow _webUIWorkFlow = new WebUIWorkFlow();
//		_webUIWorkFlow.OpenApplication();
	}
	
}
