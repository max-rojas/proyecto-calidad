package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationPages {
    public WebDriver driver;

    By logoAuto = By.xpath("/html/body/am-main/div[1]/am-navbar/nav/div[1]/a/img");

    By planAutofrecuente = By.xpath("/html/body/am-main/div[2]/am-home/am-home-menu/nav/div/ul/li[3]/a");

    By recetas = By.xpath("/html/body/am-main/div[2]/am-home/am-home-menu/nav/div/ul/li[4]/a");

    By proveedores = By.xpath("/html/body/am-main/div[2]/am-recipe/am-home-menu/nav/div/ul/li[5]/a");

    By trabajaConNostoros = By.xpath("/html/body/am-main/div[2]/am-suppliers/am-home-menu/nav/div/ul/li[6]/a");

    By responsabilidadSocial = By.xpath("/html/body/am-main/div[2]/am-work-with-us/am-home-menu/nav/div/ul/li[7]/a");

    By ayuda = By.xpath("/html/body/am-main/div[2]/am-responsability/am-home-menu/nav/div/ul/li[8]/a");

    public NavigationPages(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getLogoAuto() {
        return driver.findElement(logoAuto);
    }

    public WebElement getPlanAutoFrecuente() {
        return driver.findElement(planAutofrecuente);
    }

    public WebElement getRectas() {
        return driver.findElement(recetas);
    }

    public WebElement getProveedores() {
        return driver.findElement(proveedores);
    }

    public WebElement getTrabajaConNostoros() {
        return driver.findElement(trabajaConNostoros);
    }

    public WebElement getResponsabilidadSocial() {
        return driver.findElement(responsabilidadSocial);
    }

    public WebElement getAyuda() {
        return driver.findElement(ayuda);
    }

}

