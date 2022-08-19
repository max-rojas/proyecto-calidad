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

    By abarrotesOption = By.xpath("/html//am-main//am-home[@class='ng-star-inserted']/am-explore-products//section//drag-scroll/div[@class='drag-scroll-content']/div[1]/am-product-category//img[@alt='Abarrotes']");

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
}


