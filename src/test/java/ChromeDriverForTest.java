import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverForTest {
    public WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\NganNguyen\\NganTest\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        return driver;
    }
}
