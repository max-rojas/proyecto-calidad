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

    By widgetMusic = By.xpath("/html//am-main/am-playlist//img[@src='/content/images/playlist.svg']");

    By buttonPlay = By.cssSelector("body > am-main > am-playlist > div > div.music.p-3.active > div > div.row.no-gutters.actions.mx-3.flex-fill.ng-star-inserted > div:nth-child(2) > button > i");

    By buttonRight = By.xpath("/html/body/am-main/am-playlist/div/div[2]/div/div[2]/div[3]/button/i");

    By buttonLeft = By.cssSelector("body > am-main > am-playlist > div > div.music.p-3.active > div > div.row.no-gutters.actions.mx-3.flex-fill.ng-star-inserted > div:nth-child(1) > button > i");

    /*-------*/
    By botonCobertura = By.xpath("/html/body/am-main//am-navbar[@class='ng-star-inserted']/nav//ul[@class='navbar-nav row w-100']//p[@title='Ver cobertura y servicios']");

    By botonVerCobCentro = By.xpath("/html/body/ngb-modal-window/div/div/am-modal-select-method/div/div[2]/div[2]/div/div[2]/am-method-card/div/div[3]/div[2]/am-button/button");

    By botonVerCobDerecha = By.xpath("/html/body/ngb-modal-window/div/div/am-modal-select-method/div/div[2]/div[2]/div/div[3]/am-method-card/div/div[2]/div[2]/am-button/button");

    By botonVerCobIzquierda = By.xpath("/html/body/ngb-modal-window/div/div/am-modal-select-method/div/div[2]/div[2]/div/div[1]/am-method-card/div/div[2]/div[2]/am-button/button");

    By botonVolverCobCentro = By.xpath("/html/body/ngb-modal-window/div/div/am-modal-select-express/div/div[1]/div[1]/a");

    By botonCerrarCobertura = By.className("close");

    By recetasButton = By.xpath("//am-main//am-home[@class='ng-star-inserted']/am-home-menu/nav//ul[@class='navbar-nav']//a[@href='/recetas']");
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

    public WebElement getWidgetMusic() {return driver.findElement(widgetMusic);}

    public WebElement getButtonPlay() {return driver.findElement(buttonPlay);}

    public WebElement getButtonRight() {return driver.findElement(buttonRight);}

    public WebElement getButtonLeft() {return driver.findElement(buttonLeft);}
    public WebElement getBotonCobertura() {return driver.findElement(botonCobertura);}

    public WebElement getVerCoberturaCentro() { return driver.findElement(botonVerCobCentro);}

    public WebElement getVerCoberturaDerecha() { return driver.findElement(botonVerCobDerecha);}

    public WebElement getVerCoberturaIzquierda() { return driver.findElement(botonVerCobIzquierda);}
    public WebElement getBotonVolverCobCentro() { return driver.findElement(botonVolverCobCentro);}

    public WebElement getBotonCerrarCobertura() { return driver.findElement(botonCerrarCobertura);}

    public WebElement getRecetasBoton() { return driver.findElement(recetasButton);}

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


