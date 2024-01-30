package pageobjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SliderPageObject extends PageObject {
    By range = By.xpath("//*[@class='range-slider range-slider--primary']");
    By sliderValue = By.id("sliderValue");

    public By getRange() {
        return range;
    }

    public By getSliderValue() {
        return sliderValue;
    }
}
