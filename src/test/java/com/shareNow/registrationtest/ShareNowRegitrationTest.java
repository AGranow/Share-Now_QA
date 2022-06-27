package com.shareNow.registrationtest;

import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.shareNow.assistant.FakerAssistant;
import com.shareNow.pages.HomePage;
import com.shareNow.pages.RegistrationFormPage;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;
import static io.netty.handler.codec.rtsp.RtspHeaders.Values.URL;

public class ShareNowRegitrationTest {

    HomePage homePage = new HomePage();
    RegistrationFormPage registrationFormPage = new RegistrationFormPage();
    Properties prop = new Properties();
    public static final String CONFIG_PROPERTIES = "src/main/resources/config.properties";

    //TODO Заполнить BeforeSuite
    //TODO Выполнить ещё пару тестов


    @BeforeSuite


    @BeforeTest
    public void setUp() throws IOException {
        FileInputStream configFile = new FileInputStream(CONFIG_PROPERTIES);
        prop.load(configFile);
        Configuration.baseUrl = prop.getProperty("baseURL");
        //   Configuration.browser = ("edge"); // выборирает браузер
        open(URL);
        Configuration.holdBrowserOpen = true;  //  оставляет браузер открытым после выполнения теста
    }

    @Test
    public void registrationPositiveTest() {
        homePage.getRegButton().click();
        registrationFormPage.getCountrySelectionButton("DE").click();
        registrationFormPage.getCitySelectionButton("Ulm").click();
        webdriver().shouldHave(url("https://www.int.share-now.com/de/en/ulm/registration/personal-data/"));
        registrationFormPage.getLanguageSelectionButton("Deutsch").click();
        registrationFormPage.getEmailInput().sendKeys(FakerAssistant.setFakerEmail());
        registrationFormPage.getPasswordInput().sendKeys("passwordTest7");
        registrationFormPage.getPinInput().sendKeys("6775");
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
        registrationFormPage.getCountryCodInput(+49).click();
        registrationFormPage.getMobilePhoneInput().sendKeys(FakerAssistant.setFakerPhoneNumber());

        registrationFormPage.getChekBox().get(0).click(ClickOptions.usingJavaScript());
        registrationFormPage.getChekBox().get(1).click(ClickOptions.usingJavaScript());
        registrationFormPage.getChekBox().get(2).click(ClickOptions.usingJavaScript());
        registrationFormPage.getChekBox().get(3).click(ClickOptions.usingJavaScript());

        registrationFormPage.getRegistrationSaveButton().click(ClickOptions.usingJavaScript());

        webdriver().shouldHave(url("https://www.int.share-now.com/de/en/ulm/registration/payment/"));

        $(By.xpath("//button[@data-test-id = 'save-payment-form']")).should(Condition.visible);
    }

    @Test
    public void emailNotCorrectFormatRegistrationNegativeTest() {
        homePage.getRegButton().click();
        registrationFormPage.getCountrySelectionButton("DE").click();
        registrationFormPage.getCitySelectionButton("Ulm").click();
        webdriver().shouldHave(url("https://www.int.share-now.com/de/en/ulm/registration/personal-data/"));
        registrationFormPage.getLanguageSelectionButton("Deutsch").click();
        registrationFormPage.getEmailInput().sendKeys(prop.getProperty("emailNotCorrectFormat"));

        registrationFormPage.getPasswordInput().sendKeys("passwordTest7");
        registrationFormPage.getPinInput().sendKeys("6775");
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
        registrationFormPage.getCountryCodInput(+49).click();
        registrationFormPage.getMobilePhoneInput().sendKeys(FakerAssistant.setFakerPhoneNumber());

        registrationFormPage.getChekBox().get(0).click(ClickOptions.usingJavaScript());
        registrationFormPage.getChekBox().get(1).click(ClickOptions.usingJavaScript());
        registrationFormPage.getChekBox().get(2).click(ClickOptions.usingJavaScript());
        registrationFormPage.getChekBox().get(3).click(ClickOptions.usingJavaScript());

        registrationFormPage.getRegistrationSaveButton().click(ClickOptions.usingJavaScript());
        registrationFormPage.getRegistrationSaveButton().should(Condition.visible);
    }


}
