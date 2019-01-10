import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;

public class SuccessPage {
    private WebDriver driver;
    public SuccessPage(WebDriver driver){
        this.driver = driver;
    }

    public void verifySuccessPage(){
        By act = By.xpath("//*[@id = 'my-notes-page']/h2");
        String actual = driver.findElement(act).getText();
        String expect = "My Notes";
        assertEquals(actual, expect, "Actual result should be same as expect result");
    }
}
