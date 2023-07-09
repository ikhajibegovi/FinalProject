package PageObject;

import org.openqa.selenium.By;

public class LogInPage {
   protected By
    emailField=By.id("sigin-email"),
   logInFieldButton=By.xpath("//*[@id=\"__next\"]/header/div[4]/div[1]/div[3]/button[2]"),
    passwordField=By.id("signin-password"),
    logInButton=By.xpath("//*[@id=\"portal-root\"]/div/div/div/form/button[2]"),
   logInWithGmailButton=By.xpath("//*[@id=\"portal-root\"]/div/div/div/div[2]/button[2]"),
   LogInWithFacebookButton=By.xpath("//*[@id=\"portal-root\"]/div/div/div/div[2]/button[1]/span");





}
