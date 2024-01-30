package pageobjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePageObject extends PageObject {
    By btnForms = By.xpath("//*[contains(text(),'Forms')]");
    By btnPracticeForm = By.xpath("//*[contains(text(),'Practice Form')]");
    By btnElements = By.xpath("//*[@class = 'card-body']//*[contains(text(),'Elements')]");
    By btnLinks = By.xpath("//*[@class = 'text' and contains(text(),'Links')]");
    By btnWidgets = By.xpath("//*[contains(text(),'Widgets')]");
    By btnSlider = By.xpath("//*[@class = 'text' and contains(text(),'Slider')]");


    public By getBtnForms() {
        return btnForms;
    }

    public By getBtnPracticeForm() {
        return btnPracticeForm;
    }

    public By getBtnElements() {
        return btnElements;
    }

    public By getBtnLinks() {
        return btnLinks;
    }

    public By getBtnWidgets() {
        return btnWidgets;
    }

    public By getBtnSlider() {
        return btnSlider;
    }
}
