package cr.automercado;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.*;

import java.io.IOException;

public class AgregarProductoAlCarritoTest extends BasePage {

    public AgregarProductoAlCarritoTest() throws IOException  {
        super();
    }

    @BeforeTest
    public void setup() throws IOException {
        driver = getDriver();
        driver.get(getUrl());
    }

    @AfterTest
    public void tearDown() {
        driver.close();
        driver = null;
    }

    @Test(dependsOnGroups = {"login_test"})
    public void agregar_producto_al_carrito_test() {

        HomePage home = new HomePage(driver);
        BuscarPage buscar = new BuscarPage(driver);
        ProductoPage producto = new ProductoPage(driver);
        MetodoDeEntregaModal metodoDeEntrega = new MetodoDeEntregaModal(driver);
        CarritoPage carrito = new CarritoPage(driver);

        home.getabarrotesOption().click();

        Assert.assertTrue(buscar.getProductList().isDisplayed());

        buscar.getProductElement().click();

        producto.getBotonAgregar().click();

        metodoDeEntrega.getOpcionPickUp().click();

        metodoDeEntrega.getOpcionPickUpRegular().click();

        metodoDeEntrega.getBotonGuardar().click();

        producto.getBotonAgregar().click();

        buscar.getCarrito().click();

        Assert.assertTrue(carrito.getShoppingListItem().isDisplayed());
    }
}

