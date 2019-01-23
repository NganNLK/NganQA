package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;

public class AddNote {
    private WebDriver driver;
    public AddNote(WebDriver driver){
        this.driver = driver;
    }

    private static final By ADD_NOTE_BTN = By.cssSelector(".btn");
    private static final By TITLE = By.name("note.title");
    private static final By CONTENT = By.name("note.description");
    private static final By ADD_BTN = By.cssSelector(".btn-primary");

    public void addNewNote(String titleText, String contentText){
        driver.findElement(ADD_NOTE_BTN).click();
        driver.findElement(TITLE).sendKeys(titleText);
        driver.findElement(CONTENT).sendKeys(contentText);
        driver.findElement(ADD_BTN).click();
    }
}
