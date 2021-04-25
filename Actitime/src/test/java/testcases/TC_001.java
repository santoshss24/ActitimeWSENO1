package testcases;

import org.testng.annotations.Test;

import pages.homepage;

public class TC_001 extends basetest 
{
	
	@Test
	public void copyTask()
	{
		homepage homepage=new homepage(driver, webActionUtil);
		homepage.clickOnTask();
		homepage.clickOnActionsBtn();
		homepage.clickOnCopyToLink();
		homepage.selectCustomer();
		homepage.selectProject();
		homepage.clickOnCopyBtn();
	}

}
