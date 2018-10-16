package depTest;


	import java.util.regex.Pattern;
	import java.util.concurrent.TimeUnit;
	import org.junit.*;
	import static org.junit.Assert.*;
	import static org.hamcrest.CoreMatchers.*;
	import org.openqa.selenium.*;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.Select;

	public class enterDetails {

	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

		public WebDriver driver = null;
		
		@Before
		public void setup() {
			System.setProperty("webdriver.chrome.driver", "/Users/Manish/Desktop/chromedriver");
			driver = new ChromeDriver();
			
		}

	  @Test
	  public void testUntitledTestCase() throws Exception {
	    driver.get("http://thedemosite.co.uk/addauser.php");
	    driver.findElement(By.name("username")).click();
	    driver.findElement(By.name("username")).clear();
	    driver.findElement(By.name("username")).sendKeys("test123");
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("test123");
	    driver.findElement(By.name("FormsButton2")).click();
	    driver.findElement(By.linkText("4. Login")).click();
	    driver.findElement(By.name("username")).click();
	    driver.findElement(By.name("username")).clear();
	    driver.findElement(By.name("username")).sendKeys("test123");
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("test123");
	    driver.findElement(By.name("FormsButton2")).click();
	    assertTrue(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='The status was:'])[1]/following::b[1]")).getText().matches("^[\\s\\S]*[\\s\\S]*Successful Login[\\s\\S]*[\\s\\S]*$"));
	  }

		@After
		public void tearDown() {
			driver.quit();
		}

	  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }
	}

