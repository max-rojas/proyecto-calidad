package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MetodoDeEntregaModal {

    public WebDriver driver;

    By opcionPickUp = By.xpath("/html/body/ngb-modal-window[@role='dialog']/div[@role='document']//am-modal-select-method/div[@class='modal-delivery-methods']//div[@class='container-fluid pt-2']/div[@class='row']/div[3]/am-method-card//am-button[@class='ng-star-inserted']/button[@type='button']");

    By opcionPickUpRegular = By.xpath("/html/body/ngb-modal-window[@role='dialog']/div[@role='document']//am-modal-pickup/div/div[2]/div[1]/div[1]/div[@class='container-input-radio-1']/div[@class='input-radio-1']");

    By botonGuardar = By.xpath("/html//ngb-modal-window[@role='dialog']/div[@role='document']//am-modal-pickup//am-button/button[@type='submit']");

    public MetodoDeEntregaModal(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getOpcionPickUp() {
        return driver.findElement(opcionPickUp);
    }

    public WebElement getOpcionPickUpRegular() {
        return driver.findElement(opcionPickUpRegular);
    }

    public WebElement getBotonGuardar() {
        return driver.findElement(botonGuardar);
    }
}
