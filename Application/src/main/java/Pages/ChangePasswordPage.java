package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChangePasswordPage {

	WebDriver driver;

    // Locators
    private By emailField = By.name("email");
    private By passwordField = By.name("password");
    private By resetButton = By.xpath("//button[text()='Reset']");
    private By submitButton = By.xpath("//button[text()='Submit']");

  
    // Constructor
    public ChangePasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }
    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickResetButton() {
        driver.findElement(resetButton).click();
    }
    public void clickSubmitButton() {
        driver.findElement(submitButton).click();

}
}