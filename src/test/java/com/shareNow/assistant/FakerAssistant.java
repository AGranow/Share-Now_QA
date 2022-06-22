package com.shareNow.assistant;

import com.github.javafaker.Faker;

public class FakerAssistant {

    public static String setFakerEmail(){
        Faker faker = new Faker();
        String email = faker.internet().emailAddress();
        return email;
    }
}
