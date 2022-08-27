package cr.automercado;

import base.BasePage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.RecetaPage;

import java.io.IOException;

public class ObservarRecetaTest extends BasePage {


    public ObservarRecetaTest() throws IOException {
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
        RecetaPage recetaPage  = new RecetaPage(driver);

        home.getRecetasBoton().click();
        recetaPage.getReceta().click();
        recetaPage.getBotonRegresar().click();
    }

}
