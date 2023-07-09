import Utils.ChromeRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import stepObject.MainPageSteps;

import static DataObject.ProductIdData.adidasMenId;
import static Utils.ChromeRunner.driver;

public class MainSearch extends ChromeRunner {
    @Test
    @Description("აღნიშნული ტესტით ვამოწმებთ მუშაობს თუ არა ძებნის ფუნქცია id მნიშვნელობით")
    @Severity(SeverityLevel.CRITICAL)
    public void SearchById() throws InterruptedException {
        MainPageSteps step1=new MainPageSteps(driver);
        step1.insertSearchTextInSearchBar(adidasMenId);
        Thread.sleep(5000);
        Assert.assertTrue(step1.isProductMessagePresent());
        Thread.sleep(3000);



    }
}
