package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import libraries.IAutoConstants;
import libraries.getPhoto;
import libraries.webActionUtil;
import pages.homepage;
import pages.loginPage;

public class basetest implements IAutoConstants
{
	WebDriver driver;
	webActionUtil webActionUtil;
	
	@BeforeClass
	public void launchApp()
	{
		if (BROWSERNAME.equalsIgnoreCase("chrome")) {
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			
			driver=new ChromeDriver();
		}else if (BROWSERNAME.equalsIgnoreCase("firefox")) {
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			
			driver=new FirefoxDriver();
		}else {
			System.out.println(BROWSERNAME+" Not supported");
		}
		driver.manage().window().maximize();
		long implicit = Long.parseLong(ITO);
		driver.manage().timeouts().implicitlyWait(implicit, TimeUnit.SECONDS);
		long explicit=Long.parseLong(ETO);
		webActionUtil=new webActionUtil(driver,explicit);
		
		driver.get(APP_URL);
	}
	
	@BeforeMethod
	public void loginToApp()
	{
		loginPage login=new loginPage(driver, webActionUtil);
		login.login(USERNAME, PASSWORD);
	}
	
	@AfterMethod
	public void logoutFromApp(ITestResult result)
	{
		if (result.getStatus()==2) {
			
			getPhoto.getPic(driver);
		}
		homepage homepage=new homepage(driver, webActionUtil);
		homepage.clickOnLogout();
	}
	
	@AfterClass(enabled = false)
	public void closeApp()
	{
		driver.quit();
	}

}
