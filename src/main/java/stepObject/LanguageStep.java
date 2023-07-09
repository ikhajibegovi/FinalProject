package stepObject;

import PageObject.LanguagePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LanguageStep extends LanguagePage {
    WebDriver driver;
    public LanguageStep(WebDriver driver1) {
        driver = driver1;
    }
    @Step("click button of language changer")
    public void clickLanguageButton(){
        driver.findElement(languageButton).click();
    }

}
