package tests;


import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class TestFormRegistration extends TestBase {

    @Test
    void successfulTest() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('#RightSide_Advertisement').remove()");

        $("#firstName").setValue("Elena");
        $("#lastName").setValue("Korshunova");
        $("#userEmail").setValue("elena@gmail.com");
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

        $(".modal-content").shouldHave(text("Thanks for submitting the form"));
        $$(".table-responsive tr").filterBy(text("Student Name")).shouldHave(texts(
                "Elena Korshunova"));
        $$(".table-responsive tr").filterBy(text("Student Email")).shouldHave(texts(
                "elena@gmail.com"));
        $$(".table-responsive tr").filterBy(text("Gender")).shouldHave(texts(
                "Female"));
        $$(".table-responsive tr").filterBy(text("Mobile")).shouldHave(texts(
                "0123456789"));
        $$(".table-responsive tr").filterBy(text("Date of Birth")).shouldHave(texts(
                "17 October,1989"));
        $$(".table-responsive tr").filterBy(text("Subjects")).shouldHave(texts(
                "Computer Science"));
        $$(".table-responsive tr").filterBy(text("Hobbies")).shouldHave(texts(
                "Music"));
        $$(".table-responsive tr").filterBy(text("Picture")).shouldHave(texts(
                "picture.jpeg"));
        $$(".table-responsive tr").filterBy(text("Address")).shouldHave(texts(
                "My current address"));
        $$(".table-responsive tr").filterBy(text("State and City")).shouldHave(texts(
                "Rajasthan Jaipur"));
    }
}