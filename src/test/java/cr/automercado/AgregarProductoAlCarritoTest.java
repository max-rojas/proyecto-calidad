package cr.automercado;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.*;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class AgregarProductoAlCarritoTest extends BasePage {
    private FluentWait<WebDriver> wait;
    private Actions actions;
    public AgregarProductoAlCarritoTest() throws IOException  {
        super();
    }

    @BeforeTest
    public void setup() throws IOException {
        driver = getDriver();
        driver.get(getUrl());
        wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        actions = new Actions(driver);
    }

    @AfterTest
    public void tearDown() {
        driver.close();
        driver = null;
    }

    @Test
    public void agregar_producto_al_carrito_test() {

        final String email = "isakart@gmail.com";
        final String password = "Test123";
        HomePage home = new HomePage(driver);

        BuscarPage buscar = new BuscarPage(driver);
        ProductoPage producto = new ProductoPage(driver);
        MetodoDeEntregaModal metodoDeEntrega = new MetodoDeEntregaModal(driver);
        CarritoPage carrito = new CarritoPage(driver);

        home.getLoginButton().click();
        wait.withTimeout(Duration.ofSeconds(5));
        home.getLoginEmailInput().sendKeys(email);
        home.getLoginPasswordInput().sendKeys(password);
        home.getLoginButtonSubmit().click();
        wait.withTimeout(Duration.ofSeconds(20));
        home.getLandingModalCloseButton().click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.navigate().to("https://www.automercado.cr/");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html//am-main//am-home[@class='ng-star-inserted']/am-explore-products//section//drag-scroll/div[@class='drag-scroll-content']/div[1]/am-product-category//span[.='Abarrotes']")));

        actions.moveToElement(home.getabarrotesOption()).click().build().perform();
        wait.withTimeout(Duration.ofSeconds(10));
        home.getabarrotesOption().click();

        buscar.getProductElement().click();

        producto.getBotonAgregar().click();
        metodoDeEntrega.getOpcionPickUp().click();
        actions.moveToElement(metodoDeEntrega.getOpcionPickUpRegular()).perform();
        actions.moveToElement(metodoDeEntrega.getBotonVolver()).perform();
        actions.moveToElement(metodoDeEntrega.getOpcionPickUpRegular()).perform();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/ngb-modal-window/div/div/am-modal-pickup/div/div[2]/div[1]/div[1]")));
        actions.moveToElement(metodoDeEntrega.getOpcionPickUpRegular()).click().build().perform();
        actions.moveToElement(metodoDeEntrega.getBotonGuardar()).click().build().perform();

        actions.moveToElement(producto.getBotonAgregar()).click().build().perform();

        wait.withTimeout(Duration.ofSeconds(20));
        driver.navigate().to("https://www.automercado.cr/");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/am-main/div[1]/am-navbar/nav/div[1]/a[2]")));
        actions.moveToElement(buscar.getCarrito()).perform();
        actions.moveToElement(buscar.getCarrito()).sendKeys(Keys.ENTER).build().perform();

        Assert.assertTrue(carrito.getShoppingListItem().isDisplayed());
    }
}

