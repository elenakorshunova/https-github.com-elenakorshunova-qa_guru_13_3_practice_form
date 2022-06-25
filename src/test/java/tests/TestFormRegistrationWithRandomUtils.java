package tests;


import org.junit.jupiter.api.Test;

import static Utils.RandomUtils.getRandomEmail;
import static Utils.RandomUtils.getRandomString;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TestFormRegistrationWithRandomUtils extends TestBase {
    //move to Test Data
    String firstName = getRandomString(10);
    String lastName = getRandomString(10);
    String email = getRandomEmail();

    @Test
    void successfulTest() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('#RightSide_Advertisement').remove()");

        $("#firstName").setValue(firstName);
        $("#lastName").setValue(lastName);
        $("#userEmail").setValue(email);
        $("#genterWrapper").$(byText("Female")).click();
        $("#userNumber").setValue("0123456789");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").click();
        $(".react-datepicker__month-select").selectOption("October");
        $(".react-datepicker__year-select").click();
        $(".react-datepicker__year-select").selectOption("1989");
        $(".react-datepicker__day--017").click();
        $("#subjectsInput").sendKeys("c");
        $(byText("Computer Science")).click();
        $("#hobbiesWrapper").$(byText("Music")).click();
        $("#uploadPicture").uploadFromClasspath("picture.jpeg");
        $("#currentAddress").setValue("My current address");
        $("#state").click();
        $("#stateCity-wrapper").$(byText("Rajasthan")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Jaipur")).click();
        $("#submit").click();

        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(text(firstName), text(lastName),
                text(email), text("My current address"), text("30 July,1989"));
    }
}