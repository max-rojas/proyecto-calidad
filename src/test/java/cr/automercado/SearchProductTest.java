package cr.automercado;

import base.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.HomePage;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SearchProductTest extends BasePage {

    public SearchProductTest() throws IOException {
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
        HomePage home = new HomePage(driver);
        home.getInputSearchBar().sendKeys("Arroz");
        home.getInputSearchBar().sendKeys(Keys.ENTER);
        home.getRiceProduct().click();
    }
}
