package com.shareNow.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PaymentPage {

    public SelenideElement getConfirmButton(){
        return $(By.xpath("//button[@data-test-id = 'save-payment-form']"));
    }
}
