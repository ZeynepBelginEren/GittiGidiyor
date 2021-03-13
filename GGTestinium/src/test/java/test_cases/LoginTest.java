package test_cases;

import org.openqa.selenium.support.PageFactory;
import org.junit.Test;
import pages.LoginPage;

public class LoginTest extends TestBase {

    @Test
    public void init() throws Exception {


        LoginPage loginpage =
                PageFactory.initElements(driver,
                        LoginPage.class);

        loginpage.setEmail("TestConnection202101@gmail.com");
        loginpage.clickOnNextButton();
        loginpage.setPassword("nimda2021");
        loginpage.clickOnNextButton();
    }
}