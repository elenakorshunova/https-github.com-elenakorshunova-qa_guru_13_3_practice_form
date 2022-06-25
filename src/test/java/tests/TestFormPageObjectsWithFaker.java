package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationFormPage;


public class TestFormPageObjectsWithFaker extends TestBase {

    RegistrationFormPage registrationFormPage = new RegistrationFormPage();

    @Test
    void successfulTest() {

        registrationFormPage.openPage()
                .setFirstName(testData.firstName)
                .setLastName(testData.lastName)
                .setEmail(testData.email)
                .chooseGender(testData.gender)
                .setNumber(testData.phoneNumber)
                .setBirthDate(testData.day, testData.month, testData.year)
                .chooseSubject(testData.fromSubject)
                .chooseHobbies(testData.hobby)
                .uploadPicture(testData.url)
                .setAddress(testData.currentAddress)
                .chooseState(testData.state)
                .chooseCity(testData.city)
                .pressSubmit()
                .checkOpenedResultForm()
                .checkResult("Student Name", testData.firstName + " " + testData.lastName)
                .checkResult("Student Email", testData.email)
                .checkResult("Gender", testData.gender)
                .checkResult("Mobile", testData.phoneNumber)
                .checkResult("Date of Birth", testData.day + " " + testData.month + "," + testData.year)
                .checkResult("Subjects", testData.fromSubject)
                .checkResult("Hobbies", testData.hobby)
                .checkResult("Picture", "picture.jpeg")
                .checkResult("Address", testData.currentAddress)
                .checkResult("State and City", testData.state + " " + testData.city);
    }
}