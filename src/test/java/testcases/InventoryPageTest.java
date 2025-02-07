package testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.devtools.v120.browser.Browser;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.InventoryPage;
import pages.LoginPage;

public class InventoryPageTest extends TestBase{

	LoginPage login;
	InventoryPage inventorypage;
	
	@BeforeMethod
	public void setUp() throws IOException, InterruptedException {
		initialization();
		login=new LoginPage();
		inventorypage=new InventoryPage();
		login.verifyLoginFunctionality();
	}
	
	@Test
	public void verifyInventoryPageText() {
		String expText="Swag Labs";
		String actText=inventorypage.verifyInventoryPageText();
		Assert.assertEquals(expText, actText);
		Reporter.log(actText);
	}
	
	@Test
	public void VerifyInventoryPageProductTextTest() {
		String expText="Products";
		String actText=inventorypage.VerifyInventoryPageProductText();
		Assert.assertEquals(expText, actText);
		Reporter.log(actText);
	}
	
	
	@Test
	public void verityInventoryPageCartLogoTest() {
		 boolean logo = inventorypage.verityInventoryPageCartLogo();
		 Assert.assertEquals(logo, true);
		 Reporter.log("logo is present"+logo);
	}
	
	@Test
	public void verifyInventoryPageDropDownListTest() {
		String expText="Name (A to Z)";
		String actText=inventorypage.verifyInventoryPageDropDownList();
		Assert.assertEquals(expText, actText);
		Reporter.log(actText);
	}
	
	
	@Test
	public void verifyInventoryPageDropDownList1_Test() {
		String expText="Name (Z to A)";
		String actText=inventorypage.verifyInventoryPageDropDownList1();
		Assert.assertEquals(expText, actText);
		Reporter.log(actText);
		
	}
	
	@Test
	public void verifyInventoryPageDropDownList2_Test() {
		String expText="Price (low to high)";
		String actText=inventorypage.verifyInventoryPageDropDownList2();
		Assert.assertEquals(expText, actText);
		Reporter.log("The Actual Text is :" +actText);
	}
	
	@Test
	public void verifyInventoryPageDropDownList3Test() {
		String expText="Price (high to low)";
		String actText=inventorypage.verifyInventoryPageDropDownList3();
		Assert.assertEquals(expText,actText );
	}
	
	@Test
	public void verifyInventoryPageTwitterLogoTest() {
		boolean value = inventorypage.verifyInventoryPageTwitterLogo();
		Assert.assertEquals(value, true);
		Reporter.log("The Twitter Logo is Present !!"+value);
	}
	
	
	@Test
	public void verifyInventoryPageFacebookLogoTest(){
		boolean fb = inventorypage.verifyInventoryPageFacebookLogo();
		Assert.assertEquals(fb, true);
		Reporter.log("The Facebook Logo is Present"+fb);
	}
	
	
	@Test
	public void verifyInventoryPageLinkedInLogoTest() {
	boolean linkedIn=inventorypage.verifyInventoryPageLinkedInLogo();
	Assert.assertEquals(linkedIn, true);
	Reporter.log("The LinkedIn Logo is Present"+ linkedIn);
	}
		
	
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	
}
