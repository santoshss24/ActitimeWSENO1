package libraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webActionUtil 
{
	public WebDriver driver;
	WebDriverWait wait;
	public long ETO;
	public webActionUtil(WebDriver driver, long ETO) {
	
		this.driver=driver;
		this.ETO=ETO;
		wait=new WebDriverWait(driver,ETO);
	}

	public void clickOnElement(WebElement target)
	{
		wait.until(ExpectedConditions.elementToBeClickable(target));
		target.click();
	}
	
	public void enterKeys(WebElement target, String keys)
	{
		wait.until(ExpectedConditions.visibilityOf(target));
		target.sendKeys(keys);
	}
}
