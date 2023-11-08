package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;
import pages.components.StateCityComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationFormPage {
    private static SelenideElement firstNameInput = $("#firstName"),
    lastNameInput = $("#lastName"),
    userEmailInput = $("#userEmail"),
    genderInput = $("#genterWrapper"),
    userNumber = $("#userNumber"),
    calendarInput = $("#dateOfBirthInput"),
    subjectInput = $("#subjectsInput"),
    hobbiesInput = $("#hobbiesWrapper"),
    pictureLoad = $("#uploadPicture"),
    adressField = $("#currentAddress"),
    stateInput = $("#react-select-3-input"),
    cityInput = $("#react-select-4-input"),
    submitInput = $("#submit"),
    checkForm = $(".table-responsive");



    CalendarComponent calendarComponent = new CalendarComponent();
    StateCityComponent stateComponent = new StateCityComponent();
    StateCityComponent cityComponent = new StateCityComponent();


    public RegistrationFormPage openPage() {
        open("/automation-practice-form");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        return this;
    }

    public RegistrationFormPage setFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }
    public RegistrationFormPage setLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }
    public RegistrationFormPage setUserEmail (String value) {
        userEmailInput.setValue(value);
        return this;
    }
    public RegistrationFormPage setGenderInput(String value) {
        genderInput.$(byText(value)).click();
        return this;
    }
    public RegistrationFormPage setUserNumber(String value) {
        userNumber.setValue(value);
        return this;
    }
    public RegistrationFormPage setDateBirthday(String day, String month, String year) {
        calendarInput.click();
        calendarComponent.setDate(day, month, year);
        return this;
    }
    public RegistrationFormPage setSubject(String value) {
        subjectInput.setValue(value).pressEnter();
        return this;
    }
    public RegistrationFormPage setHobbies(String value) {
        hobbiesInput.$(byText(value)).click();
        return this;
    }
    public RegistrationFormPage setPicture () {
        pictureLoad.uploadFromClasspath("leeSin.jpg");
        return this;
    }
    public RegistrationFormPage setAdress (String value) {
        adressField.setValue(value);
        return this;
    }
    public RegistrationFormPage setState (String value) {
        stateInput.pressEnter();
        stateComponent.setState(value);
        return this;
    }
    public RegistrationFormPage setCity (String value) {
        cityInput.pressEnter();
        cityComponent.setCity(value);
        return this;
    }
    public RegistrationFormPage setSubmit () {
        submitInput.click();
        return this;
    }
    public RegistrationFormPage setCheckForm (String value) {
        checkForm.shouldHave(text(value));
        return this;
    }
}

