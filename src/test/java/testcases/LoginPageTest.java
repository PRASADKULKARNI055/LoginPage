package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.InventoryPage;
import pages.LoginPage;


public class LoginPageTest extends TestBase {

	LoginPage login;
	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		login=new LoginPage();
	}
	@Test
	public void verifyURLofApplicationTest() {
		
		String expcURL="https://www.saucedemo.com/";
		String actURL=login.verifyURLofApplication();
		Assert.assertEquals(expcURL, actURL);
		Reporter.log("The Actual URL is : "+actURL);
	
	}
	@Test
	public void verifyTitleofApplicationTest() {
		
		String expTitle="Swag Labs";
		String actTitle=login.verifyTitleofApplication();
		Assert.assertEquals(expTitle,actTitle);
		Reporter.log("The Actual Title is : "+actTitle);
		
	}
	@Test
	public void verifyLoginFunctionalityTest() throws InterruptedException, IOException {
		String expURL="https://www.saucedemo.com/inventory.html";
		String actURL=login.verifyLoginFunctionality();
		Assert.assertEquals(expURL, actURL);
		
		Reporter.log("After Login the Actual URL is :"+actURL);
		
	}
	
	
	
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	

}
