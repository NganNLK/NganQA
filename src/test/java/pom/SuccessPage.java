package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class SuccessPage {
    private WebDriver driver;
    public SuccessPage(WebDriver driver){
        this.driver = driver;
    }

    private static final By LIST_TITLE_CSS_BY = By.cssSelector("#my-notes-page a > h4");

    public void getAndVerifyTitle(int position) {
        List<WebElement> listTitleByElement = driver.findElements(LIST_TITLE_CSS_BY);
        assertEquals(listTitleByElement.get(position).getText(), "title", "Actual result should be same as expect result");
    }
}
