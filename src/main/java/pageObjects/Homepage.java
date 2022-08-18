package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {

    public WebDriver driver;

    By toggle = By.id("navbarToggle");
    By loginButton = By.cssSelector("button.solid");
    By loginButtonSubmit = By.xpath("/html/body/ngb-modal-window[@role='dialog']/div[@role='document']//am-login-modal//form[@role='form']//am-button/button[@type='submit']");

    By loginEmailInput = By.id("email");

    By loginPasswordInput = By.id("password");

    By postLoginDropdown = By.id("dropdownManual");

    public Homepage(WebDriver driver) {
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
}
