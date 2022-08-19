package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CarritoPage {

    public WebDriver driver;

    By shoppingList = By.xpath("//am-main//am-navbar[@class='ng-star-inserted']/nav/div[@class='container-lg']/a[2]/am-shopping-cart/form/div//div[@class='col-sm-12 shopping-list-content']");

    By shoppingListItem = By.xpath("/html//am-main//am-navbar[@class='ng-star-inserted']/nav/div[@class='container-lg']/a[2]/am-shopping-cart/form/div//div[@class='col-sm-12 shopping-list-content']/div/div[2]");

    public CarritoPage (WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getShoppingList() {
        return driver.findElement(shoppingList);
    }

    public WebElement getShoppingListItem() {
        return driver.findElement(shoppingListItem);
    }
}
