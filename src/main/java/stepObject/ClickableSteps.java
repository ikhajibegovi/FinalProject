package stepObject;

import PageObject.ClickablePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ClickableSteps extends ClickablePage {
    WebDriver driver;

    public ClickableSteps(WebDriver driver1) {
        driver = driver1;
    }
    public void clickNumber(){
        driver.findElement(contactNumber).click();
    }


    @Step("check the Clickable of number")
    public boolean isNumberClickable() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.elementToBeClickable(contactNumber));

        return driver.findElement(contactNumber).isDisplayed();
    }


}
