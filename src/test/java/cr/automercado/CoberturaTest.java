package cr.automercado;

import base.BasePage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.HomePage;

import java.io.IOException;

public class CoberturaTest extends BasePage {

    public CoberturaTest() throws IOException {
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

    @Test
    public void endToEndTest() throws InterruptedException {
        HomePage home = new HomePage(driver);
        home.getBotonCobertura().click();

        home.getVerCoberturaCentro().click();
        home.getBotonVolverCobCentro().click();

        home.getBotonCobertura().click();

        home.getVerCoberturaDerecha();
        home.getBotonCerrarCobertura();


        home.getVerCoberturaIzquierda().click();
        home.getBotonCerrarCobertura();

    }
}
