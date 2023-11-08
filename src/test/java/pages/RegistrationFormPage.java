package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;

import static com.codeborne.selenide.Condition.*;
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
            checkForm = $(".table-responsive"),
            checkNameField = $("#firstName");


    CalendarComponent calendarComponent = new CalendarComponent();


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

    public RegistrationFormPage setUserEmail(String value) {
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

    public RegistrationFormPage choiсePicture() {
        pictureLoad.uploadFromClasspath("img/CssNEO.jpg");
        return this;
    }

    public RegistrationFormPage setAdress(String value) {
        adressField.setValue(value);
        return this;
    }

    public RegistrationFormPage setState(String value) {
        stateInput.setValue(value).pressEnter();
        return this;
    }

    public RegistrationFormPage setCity(String value) {
        cityInput.setValue(value).pressEnter();
        return this;
    }

    public RegistrationFormPage setSubmit() {
        submitInput.click();
        return this;
    }

    public RegistrationFormPage CheckForm(String key, String value) {
        checkForm.$(byText(key)).parent().shouldHave(text(value));
        return this;
    }

    public RegistrationFormPage CheckField(String value) {
        checkNameField.shouldBe(empty);
        checkNameField.shouldHave(cssValue("border-color", "rgb(220, 53, 69)"));
        return this;
    }
}

