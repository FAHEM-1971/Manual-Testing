
public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriver driver = new ChromeDriver();
       
	}

}
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class EmailBoxTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        // Make sure chromedriver is in PATH or use WebDriverManager
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testEmailInputBox() {
        driver.get("https://example.com"); // replace with the actual URL

        // Locate the email input box (adjust the selector as needed)
        WebElement emailBox = driver.findElement(By.id("email")); // or By.name("email"), By.cssSelector, etc.

        // Input a test email
        String testEmail = "test@example.com";
        emailBox.sendKeys(testEmail);

        // Assert that the value was entered correctly
        assertEquals(testEmail, emailBox.getAttribute("value"));
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
