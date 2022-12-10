package Byjus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginBy {
	
@FindBy(xpath="(//a[text()='Login'])[2]") private WebElement login;
	
	@FindBy(xpath="//input[@class='phone-text-input  form-control']") private WebElement mobileno;
	
	
	@FindBy(xpath="//button[text()='Next'] ") private WebElement next;
	
	
	public LoginBy(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	public void login()
	{
		login.click();
	}
	
	public void mobile()
	{
		mobileno.sendKeys("7248971215");
	}
	
	public void next()
	{
		next.click();
	}


}
