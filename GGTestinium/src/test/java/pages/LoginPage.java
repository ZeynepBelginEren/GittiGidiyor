package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Using FindBy for locating elements
    @FindBy(how = How.XPATH, using =
            "// input[@type='text']]")
    WebElement emailTextBox;

    @FindBy(how = How.XPATH, using =
            "// input[@type='password']")

    WebElement passwordTextBox;
    @FindBy(how = How.XPATH, using =
            "// input [@id  = 'gg-login-enter']")

            WebElement nextButton;


    public void setEmail(String strEmail) {
        emailTextBox.sendKeys(strEmail);
    }
    // This method is to set Password in the password text box
    public void setPassword(String strPassword) {
        passwordTextBox.sendKeys(strPassword);
    }
    // This method is to click on Next Button
    public void clickOnNextButton() {
        nextButton.click();

    }

}