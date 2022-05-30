package com.shareNow.registrationtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ShareNow_Selenium {


    WebDriver wd;
    public static WebDriverWait webDriverWait;

    @BeforeMethod
    public void setUp() {
        wd = new ChromeDriver();
        webDriverWait = new WebDriverWait(wd, Duration.ofSeconds(10));
        wd.navigate().to("https://www.int.share-now.com/");
        wd.manage().window().maximize();
    }

    @Test
    public void registrationPositivTest() {
        wd.findElement(By.id("reggie-link-register-now")).click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Register for SHARE NOW')]")));
        wd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[2]/camelot-select[1]/div[1]/div[1]/select[1]/option[6]")).click();
        wd.findElement(By.xpath("//option[contains(text(),'Magyar')]")).click();
        //  wd.findElement(By.name("email")).sendKeys("emailtest@gmail.com");
        //  wd.findElement(By.name("password")).sendKeys("PasswordTest1!");
        // wd.findElement(By.name("pin")).sendKeys("5665");
    }


    @AfterMethod(enabled = false)
    public void tearDown() {
        wd.close();  // закрывает вкладку
        wd.quit();  // закрывает браузер
    }
}
