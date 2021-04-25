package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import libraries.webActionUtil;

public class homepage extends basepage 
{
	@FindBy(id = "logoutLink")
	private WebElement logoutLink;
	
	@FindBy(xpath = "//div[text()='Calls']")
	private WebElement CallsTask;
	
	@FindBy(xpath = "//div[text()='ACTIONS']")
	private WebElement ActionsBtn;
	
	@FindBy(xpath = "//div[text()='Copy to']")
	private WebElement CopyToLink;
	
	@FindBy(xpath = "//div[text()='- Select Customer -']")
	private WebElement SelectCustomerDropdown;
	
	@FindBy(xpath = "//div[text()='Big Bang Company']")
	private WebElement selectcustomer;
	
	@FindBy(xpath = "//div[text()='- Select Project -']")
	private WebElement selectProjectDropdown;
	
	@FindBy(xpath = "//div[text()='Flight operations']")
	private WebElement selectproject;
	
	@FindBy(xpath = "//div[text()='Copy']")
	private WebElement copyBtn;
	
	public homepage(WebDriver driver, webActionUtil webActionUtil) {
		super(driver, webActionUtil);
		// TODO Auto-generated constructor stub
	}
	
	
	public void clickOnTask()
	{
		webActionUtil.clickOnElement(CallsTask);
	}
	
	public void clickOnActionsBtn()
	{
		webActionUtil.clickOnElement(ActionsBtn);
	}
	
	public void clickOnCopyToLink()
	{
		webActionUtil.clickOnElement(CopyToLink);
	}
	
	public void selectCustomer()
	{
		webActionUtil.clickOnElement(SelectCustomerDropdown);
		webActionUtil.clickOnElement(selectcustomer);
	}
	
	public void selectProject()
	{
		webActionUtil.clickOnElement(selectProjectDropdown);
		webActionUtil.clickOnElement(selectproject);
	}
	
	public void clickOnCopyBtn()
	{
		webActionUtil.clickOnElement(copyBtn);
	}
	
	
	public void clickOnLogout()
	{
		webActionUtil.clickOnElement(logoutLink);
	}
	

}
