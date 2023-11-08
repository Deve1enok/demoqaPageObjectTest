package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationFormPage;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationFormPageObjectTest extends BaseTest {
    RegistrationFormPage registrationPage = new RegistrationFormPage();


    @Test
    void registrationForm() {
        registrationPage.openPage()
                .setFirstName("Din")
                .setLastName("Dinov")
                .setUserEmail("DinDinov@gmail.com")
                .setGenderInput("Male")
                .setUserNumber("8777987654")
                .setDateBirthday("04","July","1997")
                .setSubject("Physics")
                .setSubject("Maths")
                .setHobbies("Sports")
                .setHobbies("Music")
                .choiсePicture()
                .setAdress("Challenger Ionia")
                .setState("NCR")
                .setCity("Noida")
                .setSubmit()

                .CheckForm("Student Name", "Din Dinov")
                .CheckForm("Student Email","DinDinov@gmail.com")
                .CheckForm("Gender", "Male")
                .CheckForm("Mobile", "8777987654")
                .CheckForm("Date of Birth", "04 July,1997")
                .CheckForm("Subjects", "Physics, Maths")
                .CheckForm("Hobbies", "Sports, Music")
                .CheckForm("Picture", "CssNEO.jpg")
                .CheckForm("Address", "Challenger Ionia")
                .CheckForm("State and City", "NCR Noida");

    }
    @Test
    void minimalFieldsData() {
        registrationPage.openPage()
                .setFirstName("1")
                .setLastName("2")
                .setGenderInput("Male")
                .setUserNumber("1234567891")
                .setSubmit()

                .CheckForm("Student Name", "1 2")
                .CheckForm("Gender", "Male")
                .CheckForm("Mobile", "1234567891");
    }
    @Test
    void negativeTestData() {
        registrationPage.openPage()
                .setFirstName("")
                .setLastName("2")
                .setGenderInput("Male")
                .setUserNumber("1234567891")
                .setSubmit()

                .CheckField("")
                .CheckField("2")
                .CheckField("Male")
                .CheckField("1234567891");
    }
}
