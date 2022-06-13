package com.shareNow.registrationtest;

import com.codeborne.selenide.Configuration;
import com.shareNow.pages.HomePage;
import com.shareNow.pages.RegistrationFormPage;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class ShareNow {

    // TODO как выбрать браузер ?

    HomePage homePage = new HomePage();
    RegistrationFormPage registrationFormPage = new RegistrationFormPage();

    //TODO Before EACH
    //TODO как в TESTNG создать конфигурационный файл
    //TODO как переменную из config передать в код

    @BeforeTest
    public void setUp() {
        open("https://www.int.share-now.com/");
        Configuration.holdBrowserOpen = true;  //  не закрывать браузер после выполнения теста
    }


    @Test
    public void registrationPositiveTest() {


        homePage.regButtonClick();

        registrationFormPage.getCountrySelectionButton("DE").click();
        registrationFormPage.getCitySelectionButton("Ulm").click();
        registrationFormPage.getLanguageSelectionButton("Deutsch").click();
        registrationFormPage.getEmailInput("emailTest@gmail.com");
        registrationFormPage.getPasswordInput("passwordTest1");
        registrationFormPage.getTitleInput("HERR").click();
        registrationFormPage.getFirstNameInput().sendKeys("Jonn");
        registrationFormPage.getLastNameInput().sendKeys("Smitt");
        registrationFormPage.getBirthDateDaySelect(18).click();
        registrationFormPage.getBirthDateMonthSelect("March").click();
        registrationFormPage.getBirthDateYearSelect(25).click();
        registrationFormPage.getBirthPlaceSelect().sendKeys("Germany");
        registrationFormPage.getAddressStreetInput().sendKeys("Gartenstr,39");
        registrationFormPage.getAddressAdditionalStreetInput().sendKeys("Gartenplatz 2");
        registrationFormPage.getAddressZipCodeInput().sendKeys("13346");
        registrationFormPage.getAddressCityInput().sendKeys("Berlin");
        registrationFormPage.getCountryCodInput(+34).click();
        registrationFormPage.getMobilePhoneInput().sendKeys("657438363637");;
        registrationFormPage.getPromotionCodeInput().sendKeys("45463473");





        $$(By.xpath("//input[contains(@id, 'camelot-checkbox')]")).get(0);
        $$(By.xpath("//input[contains(@id, 'camelot-checkbox')]")).get(1);
        $$(By.xpath("//input[contains(@id, 'camelot-checkbox')]")).get(2);
        $$(By.xpath("//input[contains(@id, 'camelot-checkbox')]")).get(3);

        $(By.cssSelector("//button[@id='registration-save-button']"));
    }
}
