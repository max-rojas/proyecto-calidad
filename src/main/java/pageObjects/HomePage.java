package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    public WebDriver driver;

    By toggle = By.id("navbarToggle");
    By loginButton = By.cssSelector("button.solid");
    By loginButtonSubmit = By.xpath("/html/body/ngb-modal-window[@role='dialog']/div[@role='document']//am-login-modal//form[@role='form']//am-button/button[@type='submit']");

    By loginEmailInput = By.id("email");

    By loginPasswordInput = By.id("password");

    By postLoginDropdown = By.id("dropdownManual");

    By homeButton = By.xpath("/html/body/am-main/div[1]/am-navbar/nav/div[1]/a[1]");

    By landingModalCloseButton = By.xpath("/html//div[@role='dialog']/div[@class='introjs-tooltip-header']/a[@role='button']");

    By abarrotesOption = By.xpath("/html//am-main//am-home[@class='ng-star-inserted']/am-explore-products//section//drag-scroll/div[@class='drag-scroll-content']/div[1]/am-product-category//span[.='Abarrotes']");

    By inputSearchBar = By.xpath("/html/body/am-main/div[1]/am-navbar/nav/div[1]/div/ul/div[2]/li/am-product-search-navbar/form/span/input");

    By riceProduct = By.xpath("/html/body/am-main/div[2]/am-product-search/div/div/div/div[2]/div/div[2]/div/div[1]/am-product-list/div/div/div/div/div/div[3]/a/span");

    //Register
    By registerBtn = By.xpath("/html/body/am-main/div[1]/am-navbar/nav/div[1]/div/ul/div[3]/li[1]/am-button/button");

    By idType = By.id("tipoId");

    By idNumber = By.id("numeroId");

    By btnConfirmIdentity = By.xpath("/html/body/ngb-modal-window/div/div/am-register/div/div/div/div[2]/div[2]/div/form/div[3]/am-button/button");

    By userName = By.id("names");

    By userLastName = By.id("lastName");

    By btnUserRegisterData = By.xpath("/html/body/ngb-modal-window/div/div/am-register-foreign/div/div/div/div[2]/div[2]/div/form/div/am-button/button");

    By birthDate = By.id("birthDate");

    By phoneNumber = By.id("phoneNumber");

    By userEmail = By.id("email");

    By btnCompleteUserData = By.xpath("/html/body/ngb-modal-window/div/div/am-register-foreign/div/div/div/div[2]/div[2]/div/form/div/am-button/button");

    By userPassword = By.id("password");

    By confirmPassword = By.id("passwordConfirm");

    By termsCheckbox = By.id("terms");

    By otherTypeId = By.xpath("/html/body/ngb-modal-window/div/div/am-register/div/div/div/div[2]/div[2]/div/form/div[1]/select/option[3]");

    By btnCompleteRegistration = By.xpath("/html/body/ngb-modal-window/div/div/am-register-foreign/div/div/div/div[2]/div[2]/div/form/div/am-button");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getToggle() {
        return driver.findElement(toggle);
    }

    public WebElement getLoginButton() {
        return driver.findElement(loginButton);
    }

    public WebElement getLoginEmailInput() {
        return driver.findElement(loginEmailInput);
    }

    public WebElement getLoginPasswordInput() {
        return driver.findElement(loginPasswordInput);
    }

    public WebElement getLoginButtonSubmit() {
        return driver.findElement(loginButtonSubmit);
    }

    public WebElement getPostLoginDropdown() {
        return driver.findElement(postLoginDropdown);
    }

    public WebElement getabarrotesOption() {
        return driver.findElement(abarrotesOption);
    }

    public WebElement getLandingModalCloseButton() {return driver.findElement(landingModalCloseButton); }

    public WebElement getHomeButton() {return driver.findElement(homeButton); }

    public WebElement getInputSearchBar() {return driver.findElement(inputSearchBar);}

    public WebElement getRiceProduct() {return driver.findElement(riceProduct);};

    public WebElement getRegisterBtn() {return driver.findElement(registerBtn);};

    public WebElement getIdType() {return driver.findElement(idType);};

    public WebElement getIdNumber() {return driver.findElement(idNumber);};

    public WebElement getBtnConfirmIdentity() {return driver.findElement(btnConfirmIdentity);};

    public WebElement getUserName() {return driver.findElement(userName);};

    public WebElement getLastName() {return driver.findElement(userLastName);};

    public WebElement getBtnUserRegisterData() {return driver.findElement(btnUserRegisterData);};

    public WebElement getBirthDate() {return driver.findElement(birthDate);};

    public WebElement getPhoneNumber() {return driver.findElement(phoneNumber);};

    public WebElement getUserEmail() {return driver.findElement(userEmail);};

    public WebElement getBtnCompleteUserData() {return driver.findElement(btnCompleteUserData);};

    public WebElement getUserPassword() {return driver.findElement(userPassword);};

    public WebElement getConfirmPassword() {return driver.findElement(confirmPassword);};

    public WebElement getCheckBox() {return driver.findElement(termsCheckbox);};

    public WebElement getOtherTypeId() {return driver.findElement(otherTypeId);};

    public WebElement getBtnCompleteRegistration() {return driver.findElement(btnCompleteRegistration);};
}


