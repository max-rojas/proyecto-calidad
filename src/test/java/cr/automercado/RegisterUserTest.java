package cr.automercado;

import base.BasePage;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.HomePage;

import java.io.IOException;

public class RegisterUserTest extends BasePage {


    public RegisterUserTest() throws IOException {
        super();
    }

    @BeforeTest
    public void setup() throws IOException {
        driver = getDriver();
        driver.get(getUrl());
    }

    @AfterTest
    public void tearDown() {
//        driver.close();
//        driver = null;
    }

    @Test
    public void registerTest() {
        final String idNumber = "9817523429"; //Cambiar al realizar test
        final String userName = "Adrian";
        final String lastName = "Vargas";
        final String birthDate = "01/01/1990";
        final String phoneNumber = "88884444";
        final String email = "fovek53710@seinfaq.com"; //Cambiar al realizar test
        final String password = "Qwerty1!";
        final String confirmPassword = "Qwerty1!";
        HomePage home = new HomePage(driver);
        home.getRegisterBtn().click();
        home.getIdType().click();
        home.getOtherTypeId().click();
        home.getIdNumber().sendKeys(idNumber);
        home.getBtnConfirmIdentity().click();
        home.getUserName().sendKeys(userName);
        home.getLastName().sendKeys(lastName);
        home.getBtnUserRegisterData().click();
        home.getBirthDate().sendKeys(birthDate);
        home.getPhoneNumber().sendKeys(phoneNumber);
        home.getUserEmail().sendKeys(email);
        home.getBtnCompleteUserData().click();
        home.getUserPassword().sendKeys(password);
        home.getConfirmPassword().sendKeys(confirmPassword);
        home.getCheckBox().click();
        home.getBtnCompleteRegistration().click();
    }

}

