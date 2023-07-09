import Utils.ChromeRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Title extends ChromeRunner {
    @Test
    @Description("აღნიშნული ტესტით ვამოწმებთ სწორად ჩანს თუ არა ვებ.გვერდის სათაური")
    @Severity(SeverityLevel.NORMAL)
    public void TiTleTest() throws InterruptedException {


        String actualTitle=driver.getTitle();
        String expectedTitle="ონლაინ მაღაზია - Veli Store";
        Assert.assertEquals(actualTitle,expectedTitle);
        Thread.sleep(3000);
    }
}
