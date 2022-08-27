package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RecetaPage {

    By receta = By.xpath("/html/body/am-main//am-recipe[@class='ng-star-inserted']/div[@class='container recipe']//div[@class='col-sm-12 mt-3 ng-star-inserted']/div/div[1]/am-recipe-card[@class='ng-star-inserted']//a[@title='Tortitas de puré de papa']/h3[.='Tortitas de puré de papa']");

    By botonRegresar = By.xpath("/html/body/am-main//am-detail[@class='ng-star-inserted']/div[@class='container detail-recipe']//a[@href='javascript:;']");

    public WebDriver driver;

    public RecetaPage (WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getReceta() {
        return driver.findElement(receta);
    }
    public WebElement getBotonRegresar() {
        return driver.findElement(botonRegresar);
    }
}
