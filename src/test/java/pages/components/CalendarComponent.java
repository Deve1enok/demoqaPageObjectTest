package pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {
    private final static SelenideElement chooseMonth = $(".react-datepicker__month-select"),
            chooseYear = $(".react-datepicker__year-select"),
            chooseDay = $(".react-datepicker__day--004");
        public void setDate(){
            chooseMonth.selectOption("July");
            chooseYear.selectOption("1997");
            chooseDay.click();
        }
}
