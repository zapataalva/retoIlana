package steps;

import net.thucydides.core.annotations.Step;
import pageobjects.HomePageObject;

import static utils.Constants.URL;

public class InicioStep {
    HomePageObject homePageObject = new HomePageObject();

    @Step
    public void abrirNavegador() {
        homePageObject.getDriver().navigate().to(URL);
    }
}
