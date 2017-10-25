package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	protected BrowserAction actions;
	protected UserRoles userRole;
	
	protected BasePage(WebDriver driver, String userRole){
		PageFactory.initElements(driver, this);
		actions = new BrowserAction(driver);
		this.userRole = new UserRoles(userRole);
	}
}
