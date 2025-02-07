package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.TestBase;
import utility.HandeledDropdown;

public class InventoryPage extends TestBase {

	@FindBy(xpath = "//div[@class='app_logo']")
	private WebElement inventoryPageTitle;
	@FindBy(xpath = "//span[@class='title']")
	private WebElement ProductText;
	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	private WebElement cartlogo;
	@FindBy(xpath = "//span[@class='active_option']")
	private WebElement activeDropDownTxt;
	@FindBy(xpath = "//select[@class='product_sort_container']")
	private WebElement dropdownlist;
	@FindBy(xpath = "//a[@data-test='social-twitter']")
	private WebElement twitterLogo;
	@FindBy(xpath = "//a[@data-test='social-facebook']")
	private WebElement facebookLogo;
	@FindBy(xpath = "//a[@data-test='social-linkedin']")
	private WebElement linkedInLogo;

	// constructor
	public InventoryPage() {

		PageFactory.initElements(driver, this);

	}

	public String verifyInventoryPageText() {
		return inventoryPageTitle.getText();
	}

	public String VerifyInventoryPageProductText() {
		return ProductText.getText();

	}

	public boolean verityInventoryPageCartLogo() {
		return cartlogo.isDisplayed();

	}

	public String verifyInventoryPageDropDownList() {

		HandeledDropdown.handleDropdown(dropdownlist, "Name (A to Z)");
		return activeDropDownTxt.getText();
	}

	public String verifyInventoryPageDropDownList1() {

		HandeledDropdown.handleDropdown(dropdownlist, "Name (Z to A)");
		return activeDropDownTxt.getText();
	}

	public String verifyInventoryPageDropDownList2() {
		HandeledDropdown.handleDropdown(dropdownlist, "Price (low to high)");
		return activeDropDownTxt.getText();

	}

	public String verifyInventoryPageDropDownList3() {
		HandeledDropdown.handleDropdown(dropdownlist, "Price (high to low)");
		return activeDropDownTxt.getText();
	}

	public boolean verifyInventoryPageTwitterLogo() {
		return twitterLogo.isDisplayed();

	}

	public boolean verifyInventoryPageFacebookLogo() {
		return facebookLogo.isDisplayed();
	}

	public boolean verifyInventoryPageLinkedInLogo() {
		return linkedInLogo.isDisplayed();
	}

}
