package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BuscarPage {

    public WebDriver driver;

    By productList = By.xpath("/html/body/am-main//am-product-search[@class='ng-star-inserted']/div[@class='list ng-star-inserted']/div[@class='container']//div[@class='grid-square']/div[3]");

    By productElement = By.xpath("/html/body/am-main//am-product-search[@class='ng-star-inserted']/div[@class='list ng-star-inserted']/div[@class='container']/div//div[@class='grid-square']/div[1]/am-product-list//div[@class='card card-product']//div[@class='d-flex flex-column']/div[2]");

    By carrito = By.xpath("/html/body/am-main/div[1]/am-navbar/nav/div[1]/a[2]");

    public BuscarPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getProductList() {
        return driver.findElement(productList);
    }

    public WebElement getProductElement() {
        return driver.findElement(productElement);
    }

    public WebElement getCarrito() {
        return driver.findElement(carrito);
    }
}
