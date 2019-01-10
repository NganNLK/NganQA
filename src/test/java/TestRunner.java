import org.openqa.selenium.WebDriver;

public class TestRunner {
    @org.testng.annotations.Test
    public void runTest() throws InterruptedException {
        ChromeDriverForTest  chromeDriverForTest = new ChromeDriverForTest();
        WebDriver driver = chromeDriverForTest.getDriver();
        String url = "http://testapp.galenframework.com/";

        //Login
        driver.navigate().to(url);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("testuser@example.com","test123");

        //Success
        SuccessPage successPage = new SuccessPage(driver);
        successPage.verifySuccessPage();

        //Create


    }
}
