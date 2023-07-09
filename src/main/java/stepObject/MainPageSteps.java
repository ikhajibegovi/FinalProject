package stepObject;

import PageObject.MainPage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPageSteps extends MainPage {
    WebDriver driver;
    public MainPageSteps(WebDriver driver1) {
        driver = driver1;
    }
    @Step("put ID in search bar")
    public void insertSearchTextInSearchBar(String ProductId){
        driver.findElement(searchBox).sendKeys(ProductId);
    }
    @Step("check the presence of product info")
    public boolean isProductMessagePresent() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div[4]/div[1]/div[4]"))));

        return driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div[4]/div[1]/div[4]")).isDisplayed();
    }

}
