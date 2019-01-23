package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    public WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\NganNguyen\\NganTest\\src\\main\\resources\\chromedriver.exe");
        return new ChromeDriver();
    }
}
