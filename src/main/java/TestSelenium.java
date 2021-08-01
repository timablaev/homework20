import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;

public class TestSelenium {
    @Test
            public void baseTest(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://rozetka.com.ua/");
        WebElement webElement1 = webDriver.findElement(By.xpath("//a[@href='https://rozetka.com.ua/jobs/']"));
        webElement1.click();

//        WebElement webElement2 = webDriver.findElement(By.xpath("/html/body/app-root/div/div/rz-main-page/div/aside/main-page-sidebar/sidebar-fat-menu//a"));
//        webElement2.click();

//        WebElement webElement3 = webDriver.findElement(By.cssSelector(".lang__link"));
//        webElement3.click();

//        WebElement webElement4 = webDriver.findElement(By.xpath("/html/body/app-root/div/div/rz-header/header/div/div/div/form/div/div/input"));
//        webElement4.sendKeys("xiaomi");
//        WebElement webElement5 = webDriver.findElement(By.className("button_color_green"));
//        webElement5.click();
//        WebElement webElement6 = webDriver.findElement(By.cssSelector("a.goods-tile__picture"));
//        webElement6.click();


//        WebElement webElement7 = webDriver.findElement(By.xpath("/html/body/app-root/div/div/rz-header/header/div/div/ul/li[1]/rz-lang/ul/li[2]/a"));
//        webElement7.click();
//        WebElement webElement8 = webDriver.findElement(By.cssSelector(".header__button"));
//        webElement8.click();



    }



}
