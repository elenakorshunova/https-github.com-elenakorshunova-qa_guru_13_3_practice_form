package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class TextBoxTests extends TestBase {

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
