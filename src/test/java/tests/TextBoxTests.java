package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class TextBoxTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void successfulTest() {
        open("/text-box");
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");

        $("[id=userName]").setValue("Elena");
        $("[id=userEmail]").setValue("elena@gmail.com");
        $("[id=currentAddress]").setValue("Address 1");
        $("[id=permanentAddress]").setValue("Address 2");
        $("[id=submit]").click();

        $("[id=output]").shouldHave(text("Elena"), text("elena@gmail.com"), text("Address 1"), text("Address 2"));

    }
}
