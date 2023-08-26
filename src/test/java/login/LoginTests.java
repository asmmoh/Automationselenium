package login;

import Pages.HomePage;
import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import reader.ReadDataFromJson;

import java.io.FileNotFoundException;

public class LoginTests extends BaseTests {

    ReadDataFromJson readDataFromJson;
    WebDriver driver;
    HomePage homePage;

    @BeforeClass
    public void setup() throws FileNotFoundException {
        readDataFromJson = new ReadDataFromJson();
        driver = new EdgeDriver();
        driver.get(readDataFromJson.readJsonFile().URL);
        homePage = new HomePage(driver);
    }


    @Test
    public void testSuccessfulLogin(){
        homePage.clickOnLoginLink();

    }

}
