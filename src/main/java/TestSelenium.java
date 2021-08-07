import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class TestSelenium {
    @Test
            public void baseTest(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        webDriver.get("https://rozetka.com.ua/");

        Boolean wait = (new WebDriverWait(webDriver, 10)).until(new ExpectedCondition<Boolean>() {
           @NullableDecl
           @Override
            public Boolean apply(@NullableDecl  WebDriver webDriver1){
                return webDriver.findElement(By.xpath("/html/body/app-root/div/div/rz-main-page/div/aside/main-page-sidebar/a")).isDisplayed();
            }

        });
        System.out.println(wait.booleanValue());

//        Boolean wait1 = (new WebDriverWait(webDriver, 5)).until(new ExpectedCondition<Boolean>() {
//            @NullableDecl
//            @Override
//            public Boolean apply(@NullableDecl WebDriver webDriver) {
//                return webDriver.findElement(By.id("fat-menu")).isEnabled();
//            }
//        });
//        System.out.println(wait1.hashCode());

//
//        WebElement webElement = (new WebDriverWait(webDriver, 3)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/div/div/rz-main-page/div/aside/main-page-sidebar/sidebar-fat-menu//a")));
//        webElement.click();

//        WebElement webElement1 = (new WebDriverWait(webDriver, 3)).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='https://rozetka.com.ua/jobs/']")));
//        webElement1.click();

//        WebElement webElement2 = (new WebDriverWait(webDriver, 5)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/app-root/div/div/rz-header/header/div/div/ul/li[1]/rz-lang/ul/li[2]/a")));
//        webElement2.click();

//
//        WebElement webElement3 = (new WebDriverWait(webDriver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/app-root/div/div/rz-header/header/div/div/div/form/div/div/input"))));
//        webElement3.sendKeys("xiaomi");
//        WebElement webElement4 = webDriver.findElement(By.className("button_color_green"));
//        webElement4.click();
//        WebElement webElement5 = webDriver.findElement(By.cssSelector("a.goods-tile__picture"));
//        webElement5.click();
//
//        WebElement webElement6 = (new WebDriverWait(webDriver, 7).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/div/div/rz-header/header/div/div/ul/li[1]/rz-lang/ul/li[2]/a"))));
//        webElement6.click();
//        WebElement webElement7 = (new WebDriverWait(webDriver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".header__button"))));
//        webElement7.click();

    }

}
