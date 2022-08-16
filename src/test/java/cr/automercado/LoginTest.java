package cr.automercado;

import base.BasePage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.Homepage;

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
    public void endToEndTest() {
        final String email = "maxter.rojas@gmail.com";
        final String password = "Pa$$w0rd";
        Homepage home = new Homepage(driver);

        home.getLoginButton().click();
        home.getLoginEmailInput().sendKeys(email);
        home.getLoginPasswordInput().sendKeys(password);
        home.getLoginButtonSubmit().click();
    }
}
