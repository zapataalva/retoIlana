package stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import steps.LinkStep;

public class LinkStepDefinition {
    @Steps
    LinkStep linkStep;

    @When("^Ingreso a la seccion de links$")
    public void ingresoALaSeccionDeLinks() {
        linkStep.ingresarLinks();
    }


    @Then("^Valido el \"([^\"]*)\" y verifico el valor esperado \"([^\"]*)\"$")
    public void validoElYVerificoElValorEsperado(String link, String valor) {
        Assert.assertTrue(linkStep.validarLink(link, valor));
    }

    @Then("^Valido el \"([^\"]*)\" y verifico la redireccion \"([^\"]*)\"$")
    public void validoElYVerificoLaRedireccion(String link, String title) {
        Assert.assertTrue(linkStep.validarLinkWithRedirection(link, title));
    }
}
