package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import libraries.webActionUtil;

public class basepage 
{
	WebDriver driver;
	webActionUtil webActionUtil;
	
	public basepage(WebDriver driver, webActionUtil webActionUtil) {
	
		this.driver=driver;
		this.webActionUtil=webActionUtil;
		PageFactory.initElements(driver, this);
	}

}
