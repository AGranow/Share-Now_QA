package com.shareNow.registrationtest;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class ShareNowSelenide {


    @Test
    public void registrationPositivTest() {
        open("https://www.int.share-now.com/");
        Configuration.holdBrowserOpen = true;  //  не закрывать браузер после выполнения теста
        $(By.id("reggie-link-register-now")).click();


        $(By.xpath("//option[@value = 'DE']")).click(); //Land

        $(By.xpath("//option[contains(text(),'Ulm')]")).click();

        $(By.xpath("//select[@name='language']")).click();
        $(By.xpath("//option[contains(text(),'Deutsch')]")).click();

        $(By.xpath("//input[@name='email']")).setValue("emailTest@gmail.com");

        $(By.xpath("//input[@name='password']")).setValue("passwordTest1");

        $(By.xpath("//input[@name='pin']")).setValue("passwordTest1");


        $(By.xpath("//select[@name='salutation']/option[2]")).click();  // titel

        $(By.xpath("//input[@name='firstName']")).sendKeys("Jonn");

        $(By.xpath("//input[@name='lastName']")).sendKeys("Smitt");

        $(By.xpath("//select[@id = 'camelot-select-birth-date-day']/option[18]")).click();
        $(By.xpath("//select[@id = 'camelot-select-birth-date-month']/option[3]")).click(); //задать месяц явно
        $(By.xpath("//option[contains(text(),'1973')]")).click();

//      $(By.xpath("//input[contains(@name, 'birthPlace')]")).sendKeys("Deutschland");  // код Ивана
//      $(By.name("birthPlace")).sendKeys("Deutschland"); // почему не проходит ?

        $(By.xpath("//input[@name='birthPlace']")).sendKeys("Deutschland");
        $(By.xpath("//input[@name='addressStreet']")).sendKeys("Gartenstr,  39");
        $(By.xpath("//input[@name='addressAdditionalStreet']")).sendKeys("Gartenplatz,  3");
        $(By.xpath("//input[@name='addressZipCode']")).sendKeys("13355");
        $(By.xpath("//input[@name='addressCity']")).sendKeys("Berlin");

        $(By.xpath("//option[contains(text(),'+34')]")).click();
        $(By.xpath("//input[@name='mobilePhone']")).sendKeys("314151514151615");

        $(By.xpath("//input[@name='promotionCode']")).sendKeys("1212231232323");

        $$(By.xpath("//input[contains(@id, 'camelot-checkbox')]")).get(0);
        $$(By.xpath("//input[contains(@id, 'camelot-checkbox')]")).get(1);
        $$(By.xpath("//input[contains(@id, 'camelot-checkbox')]")).get(2);
        $$(By.xpath("//input[contains(@id, 'camelot-checkbox')]")).get(3);


//     (By.cssSelector("//button[@id='registration-save-button']")).click();





    }
}
