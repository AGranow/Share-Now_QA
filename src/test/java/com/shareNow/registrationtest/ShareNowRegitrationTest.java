package com.shareNow.registrationtest;

import com.codeborne.selenide.ClickOptions;
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
        //   Configuration.browser = ("edge"); // выбор браузера
        open(URL);
        Configuration.holdBrowserOpen = true;  //  не закрывать браузер после выполнения теста
    }

    @Test
    public void registrationPositiveTest() {




        homePage.regButtonClick();

        registrationFormPage.getCountrySelectionButton("DE").click();
        registrationFormPage.getCitySelectionButton("Ulm").click();
        webdriver().shouldHave(url("https://www.int.share-now.com/de/en/ulm/registration/personal-data/"));
        registrationFormPage.getLanguageSelectionButton("Deutsch").click();
        registrationFormPage.getEmailInput().sendKeys(FakerAssistant.setFakerEmail());
        registrationFormPage.getPasswordInput().sendKeys("passwordTest7");
        //  registrationFormPage.getPasswordInput().sendKeys(creatingEmail());
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
        //   registrationFormPage.getPromotionCodeInput().sendKeys("45463473567987564357");


        $$(By.xpath("//input[contains(@id, 'camelot-checkbox')]")).get(0).click(ClickOptions.usingJavaScript());
        $$(By.xpath("//input[contains(@id, 'camelot-checkbox')]")).get(1).click(ClickOptions.usingJavaScript());
        $$(By.xpath("//input[contains(@id, 'camelot-checkbox')]")).get(2).click(ClickOptions.usingJavaScript());
        $$(By.xpath("//input[contains(@id, 'camelot-checkbox')]")).get(3).click(ClickOptions.usingJavaScript());

        $(By.xpath("//button[@id='registration-save-button']")).click(ClickOptions.usingJavaScript());
    }
}
