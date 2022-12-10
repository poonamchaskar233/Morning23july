package Byjus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logoutby {
	
@FindBy(xpath="//img[@class='rounded-circle']") private WebElement log;
	
	@FindBy(xpath="(//a[@class='dropdown-item notify-item'])[1]") private WebElement logbutton;
	
	public Logoutby(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void log()
	{
		log.click();
	}
	
	public void logbutton()
	{
		logbutton.click();
	}

}
