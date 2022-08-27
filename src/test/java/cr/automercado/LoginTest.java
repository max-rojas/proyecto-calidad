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

    @Test
    public void login_success_Test() {
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

    @Test
    public void login_with_wrong_email_Test() {
        final String email = "wrong.email@gmail.com";
        final String password = "Test123";

        HomePage home = new HomePage(driver);

        home.getLoginButton().click();
        home.getLoginEmailInput().sendKeys(email);
        home.getLoginPasswordInput().sendKeys(password);
        home.getLoginButtonSubmit().click();

        Assert.assertTrue(home.getLoginError().isDisplayed());
    }

    @Test
    public void login_with_wrong_password_Test() {
        final String email = "isakart@gmail.com";
        final String password = "wrongPassword";
        HomePage home = new HomePage(driver);

        home.getLoginButton().click();
        home.getLoginEmailInput().sendKeys(email);
        home.getLoginPasswordInput().sendKeys(password);
        home.getLoginButtonSubmit().click();

        Assert.assertTrue(home.getLoginError().isDisplayed());
    }

    @Test
    public void login_with_invalid_email_Test() {
        final String email = "A".repeat(3);
        final String password = "Test123";
        final String invalidEmailErrorText = "El correo electrónico es inválido";
        HomePage home = new HomePage(driver);

        home.getLoginButton().click();
        home.getLoginEmailInput().sendKeys(email);
        home.getLoginPasswordInput().sendKeys(password);
        Assert.assertTrue(home.getEmailInptuInvalidError().isDisplayed());
        Assert.assertEquals(home.getEmailInptuInvalidError().getText(), invalidEmailErrorText);
    }

    @Test
    public void login_with_invalid_password_Test() {
        final String email = "isakart@gmail.com";
        final String invalidPasswordText = "Una contraseña es requerida";
        HomePage home = new HomePage(driver);

        home.getLoginButton().click();
        home.getLoginEmailInput().sendKeys(email);
        home.getLoginPasswordInput().click();
        home.getLoginEmailInput().click();
        Assert.assertTrue(home.getPasswordInputInvalidError().isDisplayed());
        Assert.assertEquals(home.getPasswordInputInvalidError().getText(), invalidPasswordText);
    }
}
