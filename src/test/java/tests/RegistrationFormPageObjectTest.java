package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.RegistrationFormPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationFormPageObjectTest extends BaseTest {
    RegistrationFormPage registrationPage = new RegistrationFormPage();


    @Test
    void registrationForm() {
        registrationPage.openPage()
                .setFirstName("Din")
                .setLastName("Din")
                .setUserEmail("DinDinov@gmail.com")
                .setGenderInput("Male")
                .setUserNumber("8777987654")
                .setDateBirthday("04","July","1997")
                .setSubject("Physics")
                .setSubject("Maths")
                .setHobbies("Sports")
                .setHobbies("Music")
                .setPicture()
                .setAdress("Challenger Ionia")
                .setState("NCR")
                .setCity("Noida")
                .setSubmit()

                .setCheckForm("Din Dinov")
                .setCheckForm("DinDinov@gmail.com")
                .setCheckForm("Male")
                .setCheckForm("8777987654")
                .setCheckForm("04 July,1997")
                .setCheckForm("Sports, Music")
                .setCheckForm("leeSin.jpg")
                .setCheckForm("Challenger Ionia")
                .setCheckForm("NCR Noida");









    }
}
