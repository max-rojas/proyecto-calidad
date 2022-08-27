package cr.automercado;

import base.BasePage;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.NavigationPages;

import java.io.IOException;

public class NavigationTest extends BasePage {


    public NavigationTest() throws IOException {
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
    public void searchTest() {
        NavigationPages navigation = new NavigationPages(driver);
        navigation.getPlanAutoFrecuente().click();
        navigation.getLogoAuto().click();
        navigation.getRectas().click();
        navigation.getProveedores().click();
        navigation.getTrabajaConNostoros().click();
        navigation.getResponsabilidadSocial().click();
        navigation.getAyuda().click();

    }

}
