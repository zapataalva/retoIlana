package stepdefinitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import steps.FormRegisterStep;
import steps.InicioStep;


public class FormRegisterStepDefinition {
    @Steps
    InicioStep inicioStep;

    @Steps
    FormRegisterStep formRegisterStep;

    @Given("^Ingreso en la pagina demoqa$")
    public void ingresoEnLaPaginaDemoqa() {
        inicioStep.abrirNavegador();
    }


    @When("^Ingreso a la seccion formulario de practica$")
    public void ingresoALaSeccionFormularioDePractica() {
        formRegisterStep.ingresarFormulario();
    }

    @When("^Ingreso la información de registro$")
    public void ingresoLaInformaciónDeRegistro() {
        formRegisterStep.llenarFormulario();
        formRegisterStep.enviarFormulario();
    }

    @Then("^Se evidencia el mensaje \"([^\"]*)\"$")
    public void seEvidenciaElMensaje(String mensaje) {
        Assert.assertEquals(mensaje, formRegisterStep.obtenerMensajeRegistro());
    }

    @Then("^Se evidencia la información del registro$")
    public void seEvidenciaLaInformaciónDelRegistro() {
        Assert.assertTrue(formRegisterStep.validarInformacion());
    }
}
