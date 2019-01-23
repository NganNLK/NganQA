package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private static final By USERNAME_BY = By.name("login.username");
    private static final By PASSWORD_BY = By.name("login.password");
    private static final By LOGIN_BUTTON_BY = By.cssSelector(".button-login");


    public void login(String username, String password) {
        driver.findElement(USERNAME_BY).sendKeys(username);
        driver.findElement(PASSWORD_BY).sendKeys(password);
        driver.findElement(LOGIN_BUTTON_BY).click();
    }

    private static final By ERROE_MSG = By.id("login-error-message");

    public void loginFail(String name, String pw) {
        login(name, pw);
        String actual = driver.findElement(ERROE_MSG).getText();
        String expect = "The username or password are incorrect";
        assertEquals(actual, expect, "Actual result should be same as expect result");
    }


}
