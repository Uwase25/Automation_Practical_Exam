package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.CheckBox;
import util.BrowserFactory;

public class OpenBrowserTest {

	
	WebDriver driver;
	
	@Test
	public void validUserShouldBeAbleToGoToTheBrowser() {
		
		driver= BrowserFactory.init();
		
		CheckBox checkBox= PageFactory.initElements(driver, CheckBox.class);
		checkBox.validateCheckBox();
	
	
	}
}
