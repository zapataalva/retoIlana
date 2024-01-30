package steps;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import pageobjects.HomePageObject;
import pageobjects.LinkPageObject;
import utils.Scroll;

public class LinkStep {
    HomePageObject homePageObject = new HomePageObject();
    LinkPageObject linkPageObject = new LinkPageObject();

    @Step
    public void ingresarLinks() {
        Scroll.scrollToElement(homePageObject.getDriver(), homePageObject.getBtnElements());
        homePageObject.getDriver().findElement(homePageObject.getBtnElements()).click();
        homePageObject.getDriver().findElement(homePageObject.getBtnLinks()).click();
    }

    @Step
    public boolean validarLink(String link, String valor) {
        homePageObject.getDriver().findElement(new By.ByXPath("//*[contains(text(),'" + link + "')]")).click();
        return valor.equals(linkPageObject.getDriver().findElement(linkPageObject.getLinkResponse()).getText());
    }

    @Step
    public boolean validarLinkWithRedirection(String link, String title) {
        homePageObject.getDriver().findElement(new By.ById(link)).click();
        return title.equals(linkPageObject.getDriver().getTitle());
    }
}
