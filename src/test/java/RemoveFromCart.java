import Utils.ChromeRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import stepObject.CartSteps;

public class RemoveFromCart extends ChromeRunner {
    @Test
    @Description("აღნიშნული ტესტით ვამოწმებთ კალათიდან ნივთის წაშლის ფუნქციას")
    @Severity(SeverityLevel.CRITICAL)
    public void removeItemsFromCart() throws InterruptedException {
        driver.get("https://veli.store/details/%E1%83%AE%E1%83%95%E1%83%98%E1%83%A9%E1%83%90-%E1%83%99%E1%83%95%E1%83%90%E1%83%A0%E1%83%90%E1%83%AA%E1%83%AE%E1%83%94%E1%83%9A%E1%83%98%E1%83%90-%E1%83%9C%E1%83%90%E1%83%9E%E1%83%9D%E1%83%9A%E1%83%98%E1%83%A1-%E1%83%94%E1%83%A5%E1%83%A1%E1%83%99%E1%83%9A%E1%83%A3%E1%83%96%E1%83%98%E1%83%A3%E1%83%A0%E1%83%98-%E1%83%9B%E1%83%90%E1%83%98%E1%83%A1%E1%83%A3%E1%83%A0%E1%83%98-20222023/?sku=7427252274752");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"cart-button-z\"]/span[1]")).click();
        CartSteps step1=new CartSteps(driver);
        step1.clickOnMyCart();
        Thread.sleep(3000);
        step1.deleteItemFromCart();
        Thread.sleep(3000);

        Assert.assertTrue(step1.removeMessagePresent());
    }
}
