package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LaunchingPage {

    private WebDriver driver;

    public LaunchingPage(WebDriver driver) {
        this.driver = driver;
    }

    private static final By LOGIN_BUTTON_BY = By.cssSelector(".btn");

    public void clickLogin() {
        driver.findElement(LOGIN_BUTTON_BY).click();
    }
}
