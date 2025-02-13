package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class CartPage extends TestBase{
	
	
	@FindBy(xpath="//span[text()='Your Cart']")private WebElement cartText;
	
	public CartPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String verifyYourCartText() {
		
		return cartText.getText();
	}

}
