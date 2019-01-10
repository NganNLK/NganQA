import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;

public class AddNote {
    private WebDriver driver;
    public AddNote(WebDriver driver){
        this.driver = driver;
    }

    public void addNewNote(){
        By button = By.xpath("//*[@id='my-notes-page']/button");
        driver.findElement(button).click();
    }
}
