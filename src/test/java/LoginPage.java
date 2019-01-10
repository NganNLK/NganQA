import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    String user = "login.username";
    String pass = "login.password";

    public void login(String name, String pw){
        By login = By.xpath("//*[@class = 'btn btn-lg btn-primary button-login' and @type = 'button']");
        driver.findElement(By.name(user)).sendKeys(name);
        driver.findElement(By.name(pass)).sendKeys(pw);
        driver.findElement(login).click();

    }
}
