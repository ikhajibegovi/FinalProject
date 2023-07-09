import Utils.ChromeRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import stepObject.ClickableSteps;

public class ClickableNumber extends ChromeRunner {

    @Test
    @Description("აღნიშნული ტესტით ვამოწმებთ დაკლიკვადია თუ არა მითითებული საკონტაქტო ნომერი")
    @Severity(SeverityLevel.TRIVIAL)
    public void clickableOfNumber() throws InterruptedException {
        ClickableSteps step1 = new ClickableSteps(driver);
        Thread.sleep(3000);
        Assert.assertTrue(step1.isNumberClickable());
    }
}
