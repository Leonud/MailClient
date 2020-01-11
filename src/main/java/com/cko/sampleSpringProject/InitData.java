package com.cko.sampleSpringProject;

import com.github.javafaker.Faker;
import org.springframework.stereotype.Component;

@Component
public class InitData {

    Faker faker = new Faker();


    public void initData() {
        initFilms();
        initUserAndRoles();
    }
    public void initFilms() {

//        smscSender.send_sms("89775548911","TEST MESSAGE",1, "", "", 0, "", "");

    }

    private void initUserAndRoles() {

    }
}
