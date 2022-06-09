package com.shareNow.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationFormPage {

    private final  String countrySelectionButtonLocator = "//option[@value = '%s']";


private SelenideElement method (String locator, String volume){
    String resLocator = String.format(locator,volume);
    return $(By.xpath(resLocator));
}

    private final SelenideElement countrySelectionButton = $(By.xpath("//option[@value = '%s']"));
    private final SelenideElement citySelectionButton = $(By.xpath("//option[contains(text(),'Ulm')]"));
    private final SelenideElement languageSelectionButton = $(By.xpath("//option[contains(text(),'Deutsch')]"));
    private final SelenideElement emailInput = $(By.xpath("//input[@name='email']"));
    private final SelenideElement passwordInput = $(By.xpath("//input[@name='password']"));
    private final SelenideElement pinInput = $(By.xpath("//input[@name='pin']"));
    private final SelenideElement titleInput = $(By.xpath("//select[@name='salutation']/option[2]"));
    private final SelenideElement firstNameInput = $(By.xpath("//input[@name='firstName']"));
    private final SelenideElement lastNameInput = $(By.xpath("//input[@name='lastName']"));
    private final SelenideElement birthDateDaySelect = $(By.xpath("//select[@id = 'camelot-select-birth-date-day']/option[18]"));
    private final SelenideElement birthDateMonthSelect = $(By.xpath("//option[contains(text(),'March')]"));
    private final SelenideElement birthDateYearSelect = $(By.xpath("//option[contains(text(),'1973')]"));
    private final SelenideElement birthPlaceSelect = $(By.xpath("//input[@name='birthPlace']"));
    private final SelenideElement addressStreetInput = $(By.xpath("//input[@name='addressStreet']"));
    private final SelenideElement addressAdditionalStreetInput = $(By.xpath("//input[@name='addressAdditionalStreet']"));
    private final SelenideElement addressZipCodeInput = $(By.xpath("//input[@name='addressZipCode']"));
    private final SelenideElement addressCityInput = $(By.xpath("//input[@name='addressCity']"));
    private final SelenideElement countryCodInput = $(By.xpath("//option[contains(text(),'+34')]"));
    private final SelenideElement mobilePhoneInput = $(By.xpath("//input[@name='mobilePhone']"));
    private final SelenideElement promotionCodeInput = $(By.xpath("//input[@name='promotionCode']"));


    SelenideElement locatorBuilderString (String locator,String value){
        return $(By.xpath(String.format(locator, value)));
    }

    SelenideElement locatorBuilderInt (String locator,int value){
        return $(By.xpath(String.format(locator, value)));
    }



    public void countrySelectionButtonClick(String country) {
      locatorBuilderString(countrySelectionButtonLocator, country).click();
    }

    public void citySelectionButtonClick() {
        citySelectionButton.click();
    }

    public void languageSelectionButtonClick() {
        languageSelectionButton.click();
    }

    public void emailInputPositive() {
        emailInput.setValue("emailTest@gmail.com");
    }

    public void passwordInputPositive() {
        passwordInput.setValue("passwordTest1");
    }

    public void pinInputPositive() {
        pinInput.setValue("2343");
    }

    public void titleInputSelect() {
        titleInput.click();
    }

    public void firstNameInput(String firstName) {
        firstNameInput.sendKeys(firstName);
    }

    public void lastNameInput(String lastName) {
        lastNameInput.sendKeys(lastName);
    }

    public void birthDateDaySelect() {
        birthDateDaySelect.click();

    }

    public void birthDateMonthSelect() {
        birthDateMonthSelect.click();
    }

    public void birthYearSelect() {
        birthDateYearSelect.click();
    }

    public void birthPlaceSelect() {
        birthPlaceSelect.sendKeys("Deutschland");
    }

    public void addressStreetInput() {
        addressStreetInput.sendKeys("Gartenstr,  39");
    }

    public void setAddressAdditionalStreetInput() {
        addressAdditionalStreetInput.sendKeys("Gartenplatz 3");
    }

    public void addressZipCodeInput() {
        addressZipCodeInput.sendKeys("13355");
    }

    public void addressCityInput() {
        addressCityInput.sendKeys("Berlin");
    }

    public void countryCodInput() {
        countryCodInput.click();
    }

    public void mobilePhoneInput() {
        mobilePhoneInput.sendKeys("65675776767");
    }

    public void promotionCodeInput() {
        promotionCodeInput.sendKeys("6767676767676767");
    }
}
