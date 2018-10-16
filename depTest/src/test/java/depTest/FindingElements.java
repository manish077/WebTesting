package depTest;


import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class FindingElements {
	public WebDriver driver = null;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/Manish/Desktop/chromedriver");
		driver = new ChromeDriver();
	}
	
	@Test
	public void searchText	() throws InterruptedException, IOException {
		driver.get("https://www.bing.com/");
		BingLandingPage bingPage = PageFactory.initElements(driver, BingLandingPage.class);
		BingSearchedPage bingSearchPage = PageFactory.initElements(driver, BingSearchedPage.class);
		
		bingPage.search("Selenium");
		assertEquals("Selenium", bingSearchPage.getSearch().getText());	
	}

	@After
	public void tearDown() {
		driver.quit();
	}
}
