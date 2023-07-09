import Utils.ChromeRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import stepObject.LanguageStep;

public class Language extends ChromeRunner {
    @Test
    @Description("აღნიშნული ტესტით ვამოწმებთ იცვლება თუ არა ენა ")
    @Severity(SeverityLevel.CRITICAL)
    public void LanguageChangeButton() throws InterruptedException {
        LanguageStep step1=new LanguageStep(driver);
        step1.clickLanguageButton();

      Thread.sleep(5000);
        String actualTitle=driver.getCurrentUrl();
        String expectedTitle="https://veli.store/en/";
        Assert.assertEquals(actualTitle,expectedTitle);
    }
}
