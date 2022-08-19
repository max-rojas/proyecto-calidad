package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BuscarPage {

    public WebDriver driver;

    By productList = By.xpath("/html/body/am-main//am-product-search[@class='ng-star-inserted']/div[@class='list ng-star-inserted']/div[@class='container']//div[@class='grid-square']/div[3]");

    By productElement = By.xpath("/html/body/am-main//am-product-search[@class='ng-star-inserted']/div[@class='list ng-star-inserted']/div[@class='container']/div//div[@class='grid-square']/div[1]/am-product-list//div[@class='card card-product']//div[@class='d-flex flex-column']/div[2]");

    By carrito = By.xpath("/html//am-main//am-navbar[@class='ng-star-inserted']/nav/div[@class='container-lg']/a[2]/am-shopping-cart//img[@src='../../../content/images/home/cart.svg']");

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
