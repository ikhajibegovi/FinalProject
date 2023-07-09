package stepObject;

import PageObject.LogInPage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class logInSteps extends LogInPage {
    WebDriver driver;

    public logInSteps(WebDriver driver1) {
        driver = driver1;
    }

    @Step("open log in field")
public void openLogInField() {
        driver.findElement(logInFieldButton).click();
    }

    @Step("fill email in emailField")
    public void emailInput(String s) {
        driver.findElement(emailField).sendKeys(s);
    }

    @Step("fill password in passwordField")
    public void passwordInput(String s) {
        driver.findElement(passwordField).sendKeys(s);
    }

    @Step("click log in button")
    public void clickLogInButton() {
        driver.findElement(logInButton).click();
    }
    @Step ("click log in with gmail button")
    public void clickLogInWithGmailButton(){
        driver.findElement(logInWithGmailButton).click();
    }
    @Step ("click log in with facebook button")
    public void clickLogInWithFacebookButton(){
        driver.findElement(LogInWithFacebookButton).click();
    }

    @Step ("check the presence of error message")
    public boolean isErrorMessagePresent() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"portal-root\"]/div/div/div/div[1]"))));

        return driver.findElement(By.xpath("//*[@id=\"portal-root\"]/div/div/div/div[1]")).isDisplayed();
    }



}
