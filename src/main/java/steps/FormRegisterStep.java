package steps;

import models.Student;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pageobjects.FormPageObject;
import pageobjects.HomePageObject;
import utils.Data;
import utils.Scroll;

public class FormRegisterStep {
    HomePageObject homePageObject = new HomePageObject();
    FormPageObject formPageObject = new FormPageObject();
    Student studend = Data.generateStudent();

    @Step
    public void ingresarFormulario() {
        Scroll.scrollToElement(homePageObject.getDriver(), homePageObject.getBtnForms());
        homePageObject.getDriver().findElement(homePageObject.getBtnForms()).click();
        homePageObject.getDriver().findElement(homePageObject.getBtnPracticeForm()).click();
    }

    @Step
    public void llenarFormulario() {
        formPageObject.getDriver().findElement(formPageObject.getInputFirstName()).sendKeys(studend.getFirstName());
        formPageObject.getDriver().findElement(formPageObject.getInputLastName()).sendKeys(studend.getLastName());
        formPageObject.getDriver().findElement(formPageObject.getInputUserEmail()).sendKeys(studend.getEmail());
        formPageObject.getDriver().findElement(formPageObject.getInputGenderMale()).click();
        formPageObject.getDriver().findElement(formPageObject.getInputUserNumber()).sendKeys(studend.getMobile());
        Scroll.scrollToElement(formPageObject.getDriver(), formPageObject.getInputDateOfBirth());
        formPageObject.getDriver().findElement(formPageObject.getInputDateOfBirth()).click();
        formPageObject.getDriver().findElement(formPageObject.getInputDayDateOfBirth()).click();
        formPageObject.getDriver().findElement(formPageObject.getInputDateOfBirth()).sendKeys(Keys.RETURN);
    }

    @Step
    public void enviarFormulario() {
        WebElement invisibleElement = formPageObject.getDriver().findElement(formPageObject.getBtnSubmit());
        JavascriptExecutor jsExecutor = (JavascriptExecutor) formPageObject.getDriver();
        jsExecutor.executeScript("arguments[0].click();", invisibleElement);
    }

    @Step
    public String obtenerMensajeRegistro() {
        return formPageObject.getDriver().findElement(formPageObject.getTextRegisterSuccessful()).getText();
    }

    @Step
    public boolean validarData(String dato, By element) {
        return dato.equals(formPageObject.find(element).getText());
    }

    @Step
    public boolean validarInformacion() {
        return validarData(studend.getFirstName().concat(" ").concat(studend.getLastName()), formPageObject.getTextFirstName())
                && validarData(studend.getEmail(), formPageObject.getTextEmail())
                && validarData(studend.getGender(), formPageObject.getTextGender())
                && validarData(studend.getMobile(), formPageObject.getTextMobile())
                && validarData(studend.getDateBirth(), formPageObject.getTextDateOfBirth());
    }
}
