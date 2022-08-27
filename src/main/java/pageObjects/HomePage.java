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

    By loginError = By.xpath("/html/body/ngb-modal-window[@role='dialog']/div[@role='document']/div[@class='modal-content']/am-login-modal//form[@role='form']//div[@class='card-error mt-4']/div");

    By emailInptuInvalidError = By.xpath("/html/body/ngb-modal-window/div/div/am-login-modal/div/div/div/div[2]/div[2]/div/form/div[1]/div/small");

    By passwordInputInvalidError = By.xpath("/html/body/ngb-modal-window/div/div/am-login-modal/div/div/div/div[2]/div[2]/div/form/div[2]/div[2]/small");
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

    public WebElement getLoginError() {return driver.findElement(loginError); }

    public WebElement getEmailInptuInvalidError() {return driver.findElement(emailInptuInvalidError); }

    public WebElement getPasswordInputInvalidError() {return driver.findElement(passwordInputInvalidError); }
}


