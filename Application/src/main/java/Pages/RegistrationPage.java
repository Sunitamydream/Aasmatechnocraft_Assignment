package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {

	  WebDriver driver;

	    // Locators
	    private By nameField = By.name("name");
	    private By emailField = By.name("email");
        private By passwordField = By.name("password");
	    private By signUpButton = By.xpath("//button[text()='Sign up Now']");
	    private By errorMessage = By.xpath("//div[contains(text(),'Request failed')]");

	    // Constructor
	    public RegistrationPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    // Actions
	    public void enterName(String username) {
	        driver.findElement(nameField).sendKeys(username);
	    }

	    public void enterEmail(String email) {
	        driver.findElement(emailField).sendKeys(email);
	    }

	    public void enterPassword(String password) {
	        driver.findElement(passwordField).sendKeys(password);
	    }

	    public void clickSignUpButton() {
	        driver.findElement(signUpButton).click();
	    }
	    public String getErrorMessage() {
	    	return driver.findElement(errorMessage).getText();
	    	
	    }
	}