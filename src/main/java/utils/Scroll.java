package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scroll {
    public static void scrollToElement(WebDriver driver, By elemento) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(elemento);
        js.executeScript("arguments[0].scrollIntoView()", element);
    }
}
