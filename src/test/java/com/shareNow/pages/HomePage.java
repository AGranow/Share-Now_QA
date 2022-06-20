package com.shareNow.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

 private SelenideElement regButton = $(By.id("reggie-link-register-now"));

 public void regButtonClick(){
     regButton.click();
 }
}
