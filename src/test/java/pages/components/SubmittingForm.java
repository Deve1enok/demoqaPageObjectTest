package pages.components;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class SubmittingForm {
    public void checkForm (String value) {
        $(".table-responsive").shouldHave(text("Din Dinov"));
        $(".table-responsive").shouldHave(text("DinDinov@gmail.com"));
        $(".table-responsive").shouldHave(text("Male"));
        $(".table-responsive").shouldHave(text("8777987654"));
        $(".table-responsive").shouldHave(text("04 July,1997"));
        $(".table-responsive").shouldHave(text("Physics, Maths"));
        $(".table-responsive").shouldHave(text("Sports, Music"));
        $(".table-responsive").shouldHave(text("CssNEO.jpg"));
        $(".table-responsive").shouldHave(text("Challenger Ionia"));
        $(".table-responsive").shouldHave(text("NCR Noida"));
    }
}
