package TestByjus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Byjus.LoginBy;

public class TestBy {
	
	
	LoginBy lo;
	
	
	public static void main(String[]  args)
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://byjus.com/");
	
	
	
	
		LoginBy  lo = new LoginBy(driver);
	   
	   lo.login();
	   lo.mobile();
	   lo.next();
	}

}
