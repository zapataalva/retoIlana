package pageobjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LinkPageObject extends PageObject {
    By linkResponse = By.id("linkResponse");

    public By getLinkResponse() {
        return linkResponse;
    }
}
