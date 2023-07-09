package stepObject;

import PageObject.CartPage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartSteps extends CartPage {
    WebDriver driver;

    public CartSteps(WebDriver driver1) {
        driver = driver1;
    }

    @Step("check the presence of message about adding an items")
    public boolean addMessagePresent() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"portal-root\"]/div"))));

        return driver.findElement(By.xpath("//*[@id=\"portal-root\"]/div")).isDisplayed();
    }
    @Step("check the presence of message about removing an items")
    public boolean removeMessagePresent() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div[4]/div[1]/div[5]/div[2]/div"))));

        return driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div[4]/div[1]/div[5]/div[2]/div")).isDisplayed();
    }
    @Step("click on our cart field")
    public void clickOnMyCart(){
        driver.findElement(myCartButton).click();
    }
public void deleteItemFromCart(){
        driver.findElement(deleteButton).click();
}

}

