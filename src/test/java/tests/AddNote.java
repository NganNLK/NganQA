package tests;

import com.fasterxml.jackson.databind.ObjectMapper;
import data.Data;
import driver.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.LaunchingPage;
import pom.LoginPage;
import pom.SuccessPage;

import java.io.File;
import java.io.IOException;

public class AddNote {

    private Data testData;
    private WebDriver driver;

    @BeforeMethod
    public void setUp() throws IOException {

        testData = getData();

        Driver chromeDriverForTest = new Driver();
        driver = chromeDriverForTest.getDriver();
    }

    @Test
    public void addNote() {
        driver.navigate().to(testData.getUrl());
        LaunchingPage launchingPage = new LaunchingPage(driver);
        launchingPage.clickLogin();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(testData.getUsername(), testData.getPassword());

        // Add note
        pom.AddNote addNote = new pom.AddNote(driver);
        addNote.addNewNote("title", "content");

        //Success
        SuccessPage successPage = new SuccessPage(driver);
        successPage.getAndVerifyTitle(2);

    }

    @AfterMethod
    public void endTest() {
        driver.quit();
    }

    private Data getData() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File(
                "C:\\Users\\NganNguyen\\NganTest\\src\\test\\java\\data\\test.json"), Data.class);
    }
}
