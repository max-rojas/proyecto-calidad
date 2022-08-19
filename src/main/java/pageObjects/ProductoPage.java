package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductoPage {

    public WebDriver driver;

    By botonAgregar = By.id("add-to-cart-100166");

    public ProductoPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getBotonAgregar() {
        return driver.findElement(botonAgregar);
    }
}
