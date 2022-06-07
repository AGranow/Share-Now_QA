package com.shareNow.registrationtest;

import com.codeborne.selenide.Configuration;
import com.shareNow.pageobject.HomePage;
import com.shareNow.pageobject.RegistrationFormPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class ShareNowSelenide {

    HomePage homePage = new HomePage();
    RegistrationFormPage registrationFormPage = new RegistrationFormPage();

    @Test
    public void registrationPositivTest() {
        open("https://www.int.share-now.com/");
        Configuration.holdBrowserOpen = true;  //  не закрывать браузер после выполнения теста


        homePage.regButtonClick();

        registrationFormPage.citySelectionButtonClick();
        registrationFormPage.countrySelectionButtonClick();
        registrationFormPage.languageSelectionButtonClick();
        registrationFormPage.emailInputPositive();
        registrationFormPage.passwordInputPositive();
        registrationFormPage.pinInputPositive();

        registrationFormPage.titleInputSelect();
        registrationFormPage.firstNameInput();
        registrationFormPage.lastNameInput();
        registrationFormPage.birthDateDaySelect();
        registrationFormPage.birthDateMonthSelect();
        registrationFormPage.birthYearSelect();
        registrationFormPage.birthPlaceSelect();
        registrationFormPage.addressStreetInput();
        registrationFormPage.setAddressAdditionalStreetInput();
        registrationFormPage.addressZipCodeInput();
        registrationFormPage.addressCityInput();
        registrationFormPage.countryCodInput();
        registrationFormPage.mobilePhoneInput();
        registrationFormPage.promotionCodeInput();



        $$(By.xpath("//input[contains(@id, 'camelot-checkbox')]")).get(0);
        $$(By.xpath("//input[contains(@id, 'camelot-checkbox')]")).get(1).
                $$(By.xpath("//input[contains(@id, 'camelot-checkbox')]")).get(2);
        $$(By.xpath("//input[contains(@id, 'camelot-checkbox')]")).get(3);

        $(By.cssSelector("//button[@id='registration-save-button']"));
    }
}
