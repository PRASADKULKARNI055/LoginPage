package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandeledDropdown {
	
	public static String handleDropdown(WebElement ele, String value) {
		
		Select s=new Select(ele);
		s.selectByVisibleText(value);
		
		return null;
		
	}

}
