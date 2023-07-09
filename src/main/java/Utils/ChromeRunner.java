package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class ChromeRunner {
    public static WebDriver driver=new ChromeDriver();
    @BeforeTest
    public void openChrome() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://veli.store/");
        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div[4]/div[1]/div[3]/button[2]")).click();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div[4]/div[1]/div[3]/button[2]"))));

    }
    @AfterTest
    public void closeChrome(){
        driver.close();
    }
}
