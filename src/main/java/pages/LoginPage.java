package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import utility.ReadData;



public class LoginPage extends TestBase {
	
	@FindBy(xpath = "//input[@id='user-name']") private WebElement UsernameTextBox;
	@FindBy(xpath="//input[@id='password']") private WebElement PasswordTextBox;
	@FindBy(xpath="//input[@id='login-button']")private WebElement LoginButton;
	
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	public String verifyURLofApplication() {
		
		return driver.getCurrentUrl();
	}
	
	public String verifyTitleofApplication() {
		return driver.getTitle();
		
	}
	
	public String verifyLoginFunctionality() throws InterruptedException, IOException {
		
		UsernameTextBox.sendKeys(ReadData.readData("username"));
		PasswordTextBox.sendKeys(ReadData.readData("password"));
		Thread.sleep(3000);
		LoginButton.click();
		
		return driver.getCurrentUrl();
		
	}

}
