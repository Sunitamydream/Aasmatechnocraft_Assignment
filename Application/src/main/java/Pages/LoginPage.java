package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver;

    // Locators
    private By usernameField = By.name("email");
    private By passwordField = By.name("password");
    private By loginButton = By.xpath("//button[text()='Sign in Now']");
    private By errorMessage = By.xpath("//div[text()='User not found']");
    private By forgotPasswordLink = By.linkText("Forgot password");


    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }
    public void clickForgotPasswordLink() {
        driver.findElement(forgotPasswordLink).click();
    }

}