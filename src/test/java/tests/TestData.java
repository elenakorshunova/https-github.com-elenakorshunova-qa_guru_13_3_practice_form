package tests;

import com.github.javafaker.Faker;

import java.util.Locale;

import static Utils.RandomUtils.*;

public class TestData {
//    for TestFormRegistrationWithTestData
//    public final static String FIRST_NAME = "Elena", LAST_NAME = "Korshunova";

    Faker faker = new Faker(new Locale("en"));
    String firstName = faker.address().firstName();
    String lastName = faker.address().lastName();
    String email = faker.internet().emailAddress();
    String gender = randomGender();
    String phoneNumber = String.valueOf(faker.number().randomNumber(10, true));
    String month = randomMonth();
    String year = String.valueOf(faker.number().numberBetween(1900, 2010));
    String day = String.valueOf(faker.number().numberBetween(1, 28));
    String fromSubject = randomSubject();
    String hobby = randomHobby();
    String currentAddress = faker.address().fullAddress();
    String state = "Rajasthan";
    String city = "Jaipur";
    String url = "picture.jpeg";
}
