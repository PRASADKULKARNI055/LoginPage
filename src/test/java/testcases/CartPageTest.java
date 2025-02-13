package testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.CartPage;
import pages.InventoryPage;
import pages.LoginPage;
import utility.ReadData;

public class CartPageTest extends TestBase {

	LoginPage login;
	InventoryPage inventorypage;
	CartPage cartPage;
	
	@BeforeMethod
	public void setUp() throws IOException, InterruptedException {
		initialization();
		login=new LoginPage();
		inventorypage=new InventoryPage();  
		cartPage=new CartPage();
		login.verifyLoginFunctionality();
		inventorypage.clickOnCartLogo();
	}
	
	@Test
	/*public void verifyYourCartTextTest() {
		String expText="Your Cart"; 
		String actText=cartPage.verifyYourCartText();
		Assert.assertEquals(expText, actText);
		Reporter.log("The Actual Text on Cart Page is : "+actText);
	}*/
	
	
	public void verifyYourCartTextTest() throws EncryptedDocumentException, IOException {
		
		String expText=ReadData.getExcelData(0, 0); 
		String actText=cartPage.verifyYourCartText();
		Assert.assertEquals(expText, actText);
		Reporter.log("The Actual Text on Cart Page is : "+actText);
	}
	
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}  
