package com.shareNow.registrationtest;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ShareNowSelenide {


    @Test
    public void registrationPositivTest() {
        open("https://www.int.share-now.com/");
        Configuration.holdBrowserOpen = true;  //  не закрывать браузер после выполнения теста
        $("#reggie-link-register-now").click();


        $(By.xpath("//option[contains(text(),'\uD83C\uDDE9\uD83C\uDDEA')]")).click(); //Land
        $(By.xpath("//option[contains(text(),'Ulm')]")).click();  // Stadt

//        $(By.name("language")).click();  // почему не берёт такой код?
        $(By.xpath("//select[@name='language']")).click();
        $(By.xpath("//option[contains(text(),'Deutsch')]")).click(); // Sprache // не переключает на немецкий

        $(By.xpath("//input[@name='email']")).click();  // Email  // не проходит
        $(By.xpath("//input[@name='email']")).setValue("emailTest@gmail.com").pressEnter(); // не проходит

        $(By.xpath("//input[@name='password']")).click();  // Password  // не проходит
        $(By.xpath("//input[@name='password']")).setValue("passwordTest1").pressEnter();

        $(By.xpath("//input[@name='pin']")).click();
        $(By.xpath("//input[@name='pin']")).setValue("passwordTest1").pressEnter();


        $(By.xpath("//select[@name='salutation']/option[2]")).click();  // titel

        $(By.xpath("//*[@name='firstName']")).click();  // firstName
        $(By.xpath("//*[@name='firstName']")).setValue("Jonn").pressEnter();

        $(By.xpath("//*[@name='lastName']")).click();  // lastName
        $(By.xpath("//input[@name='lastName']")).setValue("Smitt").pressEnter();

        $(By.xpath("//select[@id = 'camelot-select-birth-date-day']/option[18]")).click();
        $(By.xpath("//select[@id = 'camelot-select-birth-date-month']/option[3]")).click();
        $(By.xpath("//select[@id = 'camelot-select-birth-date-year']/option[10]")).click();
        //option[contains(text(),'1973')]

        $(By.xpath("//select[@name='birthPlace']")).setValue("Deutschland");
    }
}
