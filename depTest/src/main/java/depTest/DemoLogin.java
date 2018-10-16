package depTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoLogin {
	
	@FindBy(id = "sb_form_q")
	private WebElement searchbox;
	
	public void search(String text) throws InterruptedException {
		searchbox.sendKeys(text);
		searchbox.submit();
	}
	

}
