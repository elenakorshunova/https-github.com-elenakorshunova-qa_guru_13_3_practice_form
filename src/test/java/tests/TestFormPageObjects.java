package tests;

import org.junit.jupiter.api.Test;

public class TestFormPageObjects extends TestBase {

    @Test
    void successfulTest() {

        String firstName = "Elena";
        String lastName = "Korshunova";
        String email = "elena@gmail.com";
        String phoneNumber = "1234567890";
        String gender = "Female";
        String month = "October";
        String year = "1989";
        String day = "17";
        String fromSubject = "Computer Science";
        String hobby = "Music";
        String currentAddress = "My current address";
        String state = "Rajasthan";
        String city = "Jaipur";


        registrationFormPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .chooseGender(gender)
                .setNumber(phoneNumber)
                .setBirthDate(day, month, year)
                .chooseSubject(fromSubject)
                .chooseHobbies(hobby)
                .uploadPicture()
                .setAddress(currentAddress)
                .chooseState(state)
                .chooseCity(city)
                .pressSubmit()
                .openedForm()
                .checkResult("Student Name", firstName + " " + lastName)
                .checkResult("Student Email", email)
                .checkResult("Gender", gender)
                .checkResult("Mobile", phoneNumber)
                .checkResult("Date of Birth", day + " " + month + "," + year)
                .checkResult("Subjects", fromSubject)
                .checkResult("Hobbies", hobby)
                .checkResult("Picture", "picture.jpeg")
                .checkResult("Address", currentAddress)
                .checkResult("State and City", state + " " + city);
    }
}