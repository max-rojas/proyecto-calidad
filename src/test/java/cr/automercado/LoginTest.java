package cr.automercado;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.HomePage;

import java.io.IOException;

public class LoginTest extends BasePage {
    public LoginTest() throws IOException {
        super();
    }

    @BeforeTest
    public void setup() throws IOException {
        driver = getDriver();
        driver.get(getUrl());
    }

    @AfterTest
    public void tearDown() {
        driver.close();
        driver = null;
    }

    @Test(groups = {"login_test"})
    public void login_Test() {
        final String email = "isakart@gmail.com";
        final String password = "Test123";
        HomePage home = new HomePage(driver);
        boolean isPostLoginMenuPresent;

        home.getLoginButton().click();
        home.getLoginEmailInput().sendKeys(email);
        home.getLoginPasswordInput().sendKeys(password);
        home.getLoginButtonSubmit().click();
        isPostLoginMenuPresent = home.getPostLoginDropdown().isDisplayed();

        Assert.assertTrue(isPostLoginMenuPresent);
    }
}
