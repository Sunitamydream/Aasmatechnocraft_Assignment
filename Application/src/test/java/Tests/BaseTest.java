package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Pages.LoginPage;
import Pages.RegistrationPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public static WebDriver driver;
    @BeforeMethod
    public void setUp() {
    	System.out.println("Open the Chrome Browser");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    	System.out.println("Maximize the Chrome Browser");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown() {
        if (driver != null) {
        	System.out.println("Close the Chrome Browser");
            driver.quit();
        }
    }
}
    




