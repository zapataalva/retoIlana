package pageobjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class FormPageObject extends PageObject {
    By inputFirstName = By.id("firstName");
    By inputLastName = By.id("lastName");
    By inputUserEmail = By.id("userEmail");
    By inputGenderMale = By.xpath("//*[contains(text(),'Male')]");
    By inputGenderFemale = By.xpath("//*[contains(text(),'Female')]");
    By inputGenderOther = By.xpath("//*[contains(text(),'Other')]");
    By inputUserNumber = By.id("userNumber");
    By inputDateOfBirth = By.id("dateOfBirthInput");
    By inputDayDateOfBirth = By.xpath("//*[@class = 'react-datepicker__month']//*[@class = 'react-datepicker__week']//*[contains(text(),'7')]");
    By btnSubmit = By.xpath("//button[@id='submit']");
    By textRegisterSuccessful = By.id("example-modal-sizes-title-lg");
    By textFirstName = By.xpath("//*[@class = 'table table-dark table-striped table-bordered table-hover']//tbody//td[contains(text(),'Student Name')]//following-sibling::td");
    By textEmail = By.xpath("//*[@class = 'table table-dark table-striped table-bordered table-hover']//tbody//td[contains(text(),'Student Email')]//following-sibling::td");
    By textGender = By.xpath("//*[@class = 'table table-dark table-striped table-bordered table-hover']//tbody//td[contains(text(),'Gender')]//following-sibling::td");
    By textMobile = By.xpath("//*[@class = 'table table-dark table-striped table-bordered table-hover']//tbody//td[contains(text(),'Mobile')]//following-sibling::td");
    By textDateOfBirth = By.xpath("//*[@class = 'table table-dark table-striped table-bordered table-hover']//tbody//td[contains(text(),'Date of Birth')]//following-sibling::td");


    public By getInputFirstName() {
        return inputFirstName;
    }

    public By getInputLastName() {
        return inputLastName;
    }

    public By getInputUserEmail() {
        return inputUserEmail;
    }

    public By getInputGenderMale() {
        return inputGenderMale;
    }

    public By getInputGenderFemale() {
        return inputGenderFemale;
    }

    public By getInputGenderOther() {
        return inputGenderOther;
    }

    public By getInputDateOfBirth() {
        return inputDateOfBirth;
    }

    public By getInputUserNumber() {
        return inputUserNumber;
    }

    public By getBtnSubmit() {
        return btnSubmit;
    }

    public By getTextRegisterSuccessful() {
        return textRegisterSuccessful;
    }

    public By getTextFirstName() {
        return textFirstName;
    }

    public By getTextEmail() {
        return textEmail;
    }

    public By getTextGender() {
        return textGender;
    }

    public By getTextMobile() {
        return textMobile;
    }

    public By getTextDateOfBirth() {
        return textDateOfBirth;
    }

    public By getInputDayDateOfBirth() {
        return inputDayDateOfBirth;
    }
}
