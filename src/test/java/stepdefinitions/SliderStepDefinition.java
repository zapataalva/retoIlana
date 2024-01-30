package stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import steps.SliderStep;

public class SliderStepDefinition {
    @Steps
    SliderStep sliderStep;

    @When("^Ingreso a la seccion de slider$")
    public void ingresoALaSeccionDeSlider() {
        sliderStep.ingresarSlider();
    }


    @When("^Posiciono el punto$")
    public void posicionoElPunto() {
        sliderStep.posicionoPunto();
    }

    @Then("^Valido el valor de la posicion actual$")
    public void validoElValorDeLaPosicionActual() {
        Assert.assertEquals("50", sliderStep.ultimaPosicionPunto());
    }

}
