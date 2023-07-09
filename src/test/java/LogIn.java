import Utils.ChromeRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import stepObject.logInSteps;

import java.time.Duration;
import java.util.Set;

import static DataObject.LogInData.*;
import static DataObject.LogInData.correctPassword;

public class LogIn extends ChromeRunner {
    @Test
    @Description("აღნინშლი ტესტით ვამოწმებთ დალოგინებას მცდარი მონაცემებით")
    @Severity(SeverityLevel.CRITICAL)
    public void logInWithIncorrectData() throws InterruptedException {
        logInSteps step1=new logInSteps(driver);
        step1.openLogInField();
        step1.emailInput(incorrectEmail);
        step1.passwordInput(incorrectPassword);
        step1.clickLogInButton();
        Thread.sleep(3000);
        Assert.assertTrue(step1.isErrorMessagePresent());
    }

    @Test
    @Description("აღნინშლი ტესტით ვამოწმებთ დალოგინებას სწორი მონაცემებით")
    @Severity(SeverityLevel.CRITICAL)
    public void logInWithCorrectData() throws InterruptedException {
        logInSteps step2=new logInSteps(driver);
        step2.openLogInField();
        step2.emailInput(correctEmail);
        step2.passwordInput(correctPassword);
        step2.clickLogInButton();
        Thread.sleep(3000);
    }


    @Test
    @Description("აღნიშნლი ტესტით ვამოწმებთ ელ.ფოსტით დალოგინების დროს გადავდივართ თუ არა შესაბამის გვერდზე")
    @Severity(SeverityLevel.CRITICAL)
    public void logInWithGmailButton() throws InterruptedException {
        logInSteps step3=new logInSteps(driver);
        step3.openLogInField();
        step3.clickLogInWithGmailButton();
        //Concentrate on second window
        Set<String> windowHandles = driver.getWindowHandles();
        for (String windowHandle : windowHandles) {
            driver.switchTo().window(windowHandle);
        }
        Thread.sleep(3000);
        String actualTitle=driver.getCurrentUrl();
        String expectedTitle="https://accounts.google.com/o/oauth2/auth/oauthchooseaccount?redirect_uri=storagerelay%3A%2F%2Fhttps%2Fveli.store%3Fid%3Dauth296512&response_type=permission%20id_token&scope=email%20profile%20openid&openid.realm&include_granted_scopes=true&client_id=1096281413165-ip9bksrgmpn8sb1k1sk0uqjdhsm1ab1i.apps.googleusercontent.com&ss_domain=https%3A%2F%2Fveli.store&prompt=select_account&fetch_basic_profile=true&gsiwebsdk=2&service=lso&o2v=1&flowName=GeneralOAuthFlow";
        Assert.assertEquals(actualTitle,expectedTitle);
        Thread.sleep(3000);

            }

    @Test
    @Description("აღნიშნლი ტესტით ვამოწმებთ ფეისბუქით დალოგინების დროს გადავდივართ თუ არა შესაბამის გვერდზე")
    @Severity(SeverityLevel.CRITICAL)
    public void logInWithFacebookButton() throws InterruptedException {
        logInSteps step4=new logInSteps(driver);
        step4.openLogInField();
        step4.clickLogInWithFacebookButton();
        //Concentrate on second window
        Set<String> windowHandles = driver.getWindowHandles();
        for (String windowHandle : windowHandles) {
            driver.switchTo().window(windowHandle);
        }
        Thread.sleep(3000);

        String actualTitle=driver.getCurrentUrl();
        String expectedTitle="https://www.facebook.com/login.php?skip_api_login=1&api_key=2502022626621856&kid_directed_site=0&app_id=2502022626621856&signed_next=1&next=https%3A%2F%2Fwww.facebook.com%2Fv2.3%2Fdialog%2Foauth%3Fapp_id%3D2502022626621856%26auth_type%26cbt%3D1688879611462%26channel_url%3Dhttps%253A%252F%252Fstaticxx.facebook.com%252Fx%252Fconnect%252Fxd_arbiter%252F%253Fversion%253D46%2523cb%253Df21012a00de4e4%2526domain%253Dveli.store%2526is_canvas%253Dfalse%2526origin%253Dhttps%25253A%25252F%25252Fveli.store%25252Ff31100d9396f764%2526relation%253Dopener%26client_id%3D2502022626621856%26display%3Dpopup%26domain%3Dveli.store%26e2e%3D%257B%257D%26fallback_redirect_uri%3Dhttps%253A%252F%252Fveli.store%252F%26locale%3Den_US%26logger_id%3Dfa325219b4ebac%26origin%3D1%26redirect_uri%3Dhttps%253A%252F%252Fstaticxx.facebook.com%252Fx%252Fconnect%252Fxd_arbiter%252F%253Fversion%253D46%2523cb%253Df35bc79fe4cfc4c%2526domain%253Dveli.store%2526is_canvas%253Dfalse%2526origin%253Dhttps%25253A%25252F%25252Fveli.store%25252Ff31100d9396f764%2526relation%253Dopener%2526frame%253Df6407435a9b73c%26response_type%3Dtoken%252Csigned_request%252Cgraph_domain%26return_scopes%3Dfalse%26scope%3Demail%26sdk%3Djoey%26version%3Dv2.3%26ret%3Dlogin%26fbapp_pres%3D0%26tp%3Dunspecified&cancel_url=https%3A%2F%2Fstaticxx.facebook.com%2Fx%2Fconnect%2Fxd_arbiter%2F%3Fversion%3D46%23cb%3Df35bc79fe4cfc4c%26domain%3Dveli.store%26is_canvas%3Dfalse%26origin%3Dhttps%253A%252F%252Fveli.store%252Ff31100d9396f764%26relation%3Dopener%26frame%3Df6407435a9b73c%26error%3Daccess_denied%26error_code%3D200%26error_description%3DPermissions%2Berror%26error_reason%3Duser_denied&display=popup&locale=en_US&pl_dbl=0";
        Assert.assertEquals(actualTitle,expectedTitle);
        Thread.sleep(3000);

    }
}
