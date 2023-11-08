package pages.components;

import static com.codeborne.selenide.Selenide.$;

public class StateCityComponent {
    public void setState (String value) {
        $("#react-select-3-input").setValue("NCR").pressEnter();
    }
    public void setCity (String value) {
        $("#react-select-4-input").setValue("Noida").pressEnter();
    }
}
