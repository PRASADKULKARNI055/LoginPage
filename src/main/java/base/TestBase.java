package base;

import java.io.IOException;
import java.sql.DriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ReadData;

public class TestBase {
	
	public static WebDriver driver;
	
	public void initialization() throws IOException {
		
		//First Code for chrome only
		/*WebDriverManager.chromedriver();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.saucedemo.com/");*/
		
		String browser = ReadData.readData("browser");
		
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver();
			driver=new ChromeDriver();
		}
		else if(browser.equals("edge"))
		{
			WebDriverManager.edgedriver();
			driver=new EdgeDriver();
			
		}
		else if (browser.equals("safari")) 
		{
			WebDriverManager.safaridriver();
			driver=new SafariDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get(ReadData.readData("url"));
		
		
	}
		

}
