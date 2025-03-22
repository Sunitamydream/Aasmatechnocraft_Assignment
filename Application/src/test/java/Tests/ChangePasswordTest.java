package Tests;
import Pages.ChangePasswordPage;
import Pages.LoginPage;
import generics.GmailReader;
import generics.Utils;
import org.testng.annotations.*;
public class ChangePasswordTest extends BaseTest {
   
    LoginPage loginPage;


    @Test
    public void testChangePassword() throws InterruptedException {
    	//Open the Login page
        driver.get("https://next-boilerplate-umber.vercel.app/login");
        loginPage = new LoginPage(driver);
        //Click on Forgot Password Link
        loginPage.clickForgotPasswordLink();
        Thread.sleep(5000);
        //Switching driver object from login page to Change password page
        ChangePasswordPage changePasswordPage = new ChangePasswordPage(driver);
        Thread.sleep(3000);
        //Enter the Email id for which the password needs to be changed
        changePasswordPage.enterEmail("sunitamydream38@gmail.com");
        //Click on Reset button
        changePasswordPage.clickResetButton();
        Thread.sleep(10000);
        //A Mail will be triggered to the Gmail id, fetch the "Mail Body"
         String message = GmailReader.readMessagesFromGmail();
         //Fetch only the link from mail body
         String link = Utils.fetchOnlyLink(message);
         System.out.println(message);
         System.out.println(link);
         //Open the link on the same window
         driver.get(link);
         //Enter the new password which we want to change/reset
         changePasswordPage.enterPassword("Piyusunita@789#");
         //Click on Submit button
         changePasswordPage.clickSubmitButton();
            }

}