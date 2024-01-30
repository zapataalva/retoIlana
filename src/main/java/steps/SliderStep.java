package steps;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pageobjects.HomePageObject;
import pageobjects.SliderPageObject;
import utils.Scroll;

public class SliderStep {
    HomePageObject homePageObject = new HomePageObject();
    SliderPageObject sliderPageObject = new SliderPageObject();

    @Step
    public void ingresarSlider() {
        homePageObject.getDriver().findElement(homePageObject.getBtnWidgets()).click();
        Scroll.scrollToElement(homePageObject.getDriver(), homePageObject.getBtnSlider());
        homePageObject.getDriver().findElement(homePageObject.getBtnSlider()).click();
    }

    @Step
    public void posicionoPunto() {
        Actions actions = new Actions(sliderPageObject.getDriver());
        WebElement rangeSlider = sliderPageObject.element(sliderPageObject.getRange());
        actions.moveToElement(rangeSlider, 0, 0).click().build().perform();
    }

    @Step
    public String ultimaPosicionPunto() {
        WebElement inputElement = sliderPageObject.getDriver().findElement(sliderPageObject.getSliderValue());
        return inputElement.getAttribute("value");
    }

}
