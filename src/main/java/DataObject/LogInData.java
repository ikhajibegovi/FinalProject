package DataObject;

import com.github.javafaker.Faker;

import java.util.Locale;

public interface LogInData {
    Faker faker=new Faker();
    String
        incorrectEmail=faker.bothify("????##@gmail.com"),
        correctEmail="khajibegovi.iri@gmail.com",
        incorrectPassword=faker.bothify("????##"),
        correctPassword="paposhvili123.";






}
