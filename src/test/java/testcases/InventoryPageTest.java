package testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.devtools.v120.browser.Browser;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.InventoryPage;
import pages.LoginPage;
import utility.ReadData;

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
	public void verifyInventoryPageText() throws EncryptedDocumentException, IOException {
		String expText=ReadData.getExcelData(1,0);
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
		
	@Test
	public void VerifyInventoryPageFooterTextTest() {
		String expText="© 2025 Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy";
		String actText=inventorypage.VerifyInventoryPageFooterText();
		Assert.assertEquals(expText, actText);
		Reporter.log(actText);
				
	}
	@Test
	public void add6CartsTest() {
		String expCount="6";
		String actCount=inventorypage.add6Carts();
		Assert.assertEquals(expCount, actCount);
		Reporter.log("The Count of Product added in the Cart : "+actCount);
	}
	
	@Test
	public void remove2ProductsTest() {
		String expCount="4";
		String actCount=inventorypage.remove2Products();
		Assert.assertEquals(expCount, actCount);
		Reporter.log("The Count of Remaining Products in Cart :"+actCount);
	}
		
	@Test
	public void clickOnCartLogoTest() {
		String expURL="https://www.saucedemo.com/cart.html";
		String actURL=inventorypage.clickOnCartLogo();
		Assert.assertEquals(expURL, actURL);
		Reporter.log("After Clicking on Cart Logo the Actual URL is : "+actURL);
	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	
}
