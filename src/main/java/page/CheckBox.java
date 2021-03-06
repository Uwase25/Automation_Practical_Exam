package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class CheckBox extends BasePage {

	WebDriver driver;
	
	public  CheckBox(WebDriver driver) {
	     this.driver = driver;
	}
	
	@FindBy(how= How.NAME, using="allbox") WebElement CheckBox_Field;	


public void validateCheckBox() {
	
	waitForElement(driver, 3, CheckBox_Field);
	CheckBox_Field.click();
	
	Assert.assertEquals(true, CheckBox_Field.isSelected());
}
}