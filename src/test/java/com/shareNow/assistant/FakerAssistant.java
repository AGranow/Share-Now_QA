package com.shareNow.assistant;

import com.github.javafaker.Faker;

public class FakerAssistant {


    static Faker faker = new Faker();
    public static String setFakerEmail(){

        String email = faker.internet().emailAddress();
        return email;
    }

    public static String setFakerPhoneNumber(){
        String phoneNumber = faker.numerify("############");;
        return phoneNumber;
    }

    public static void main(String[] args) {
        System.out.println(setFakerPhoneNumber());
    }


}
