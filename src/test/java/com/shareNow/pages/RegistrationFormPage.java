package com.shareNow.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationFormPage {

    public SelenideElement getCountrySelectionButton(String country) {
        return $(By.xpath(String.format("//option[@value = '%s']", country)));
    }

    public SelenideElement getCitySelectionButton(String city) {
        return $(By.xpath(String.format("//option[contains(text(),'%s')]", city)));
    }

    public SelenideElement getLanguageSelectionButton(String language) {
        return $(By.xpath(String.format("//option[contains(text(),'%s')]", language)));
    }

    public SelenideElement getEmailInput(String email) {
        return $(By.xpath(String.format("//input[@name='email']", email)));
    }

    public SelenideElement getPasswordInput(String password) {
        return $(By.xpath(String.format("//input[@addressStreet='%s']", password)));
    }

    public SelenideElement getPinInput(int pin) {
        return $(By.xpath(String.format("//input[@name='pin']", pin)));
    }

    public SelenideElement getTitleInput(String title) {
        return $(By.xpath(String.format("//option[@value='%s']", title)));
    }

    public SelenideElement getFirstNameInput() {
        return $(By.xpath("//input[@name='firstName']"));
    }

    public SelenideElement getLastNameInput() {
        return $(By.xpath(String.format("//input[@name='lastName']")));
    }

    //TODO  как указать дату явно?
    public SelenideElement getBirthDateDaySelect(int birdDate) {
        return $(By.xpath(String.format("//select[@id = 'camelot-select-birth-date-day']/option[15]", birdDate)));
    }

    public SelenideElement getBirthDateMonthSelect(String birthMonth) {
        return $(By.xpath(String.format("//option[contains(text(),'%s')]", birthMonth)));
    }

    //TODO  как указать дату явно?
    public SelenideElement getBirthDateYearSelect(int birthYear) {
        return $(By.xpath(String.format("//select[@id='camelot-select-birth-date-year']/option[15]", birthYear)));
    }

    public SelenideElement getBirthPlaceSelect() {
        return $(By.xpath("//input[@name='birthPlace']"));
    }

    public SelenideElement getAddressStreetInput() {
        return $(By.xpath("//input[@name='addressStreet']"));
    }

    public SelenideElement getAddressAdditionalStreetInput() {
        return $(By.xpath("//input[@name='addressAdditionalStreet']"));
    }

    public SelenideElement getAddressZipCodeInput() {
        return $(By.xpath("//input[@name='addressZipCode']"));
    }

    public SelenideElement getAddressCityInput() {
        return $(By.xpath("//input[@name='addressCity']"));
    }

    //TODO  как указать код явно?
    public SelenideElement getCountryCodInput(int countryCod) {
        return $(By.xpath(String.format("//option[contains(text(),'+34')]", countryCod)));
    }

    public SelenideElement getMobilePhoneInput() {
        return $(By.xpath("//input[@name='mobilePhone']"));
    }

    public SelenideElement getPromotionCodeInput() {
        return $(By.xpath("//input[@name='promotionCode']"));
    }
}
