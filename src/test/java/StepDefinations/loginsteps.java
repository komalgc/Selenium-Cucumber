package StepDefinations;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.SecureAreaPage;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class loginsteps {
    static WebDriver driver;
    HomePage homePage;
    LoginPage loginPage;
    SecureAreaPage secureAreaPage;

    @Before
    public void setup() {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        homePage = new HomePage(driver);
    }

    @After
    public void teardown() {
        driver.quit();
    }



    @Given("^Clicks on FormAuthentication$")
    public void clicks_on_FormAuthentication() throws Throwable {
        loginPage = homePage.clickonAuthenticationPage();

    }

    @When("^The user Enters \"([^\"]*)\" in username field$")
    public void the_user_Enters_in_username_field(String arg1) throws Throwable {
        loginPage.setuserName(arg1);
    }

    @When("^The user Enters \"([^\"]*)\" in password field$")
    public void the_user_Enters_in_password_field(String arg1) throws Throwable {
        loginPage.setpassword(arg1);
    }

    @When("^Clicks on Login Button$")
    public void clicks_on_Login_Button() throws Throwable {
        secureAreaPage = loginPage.clickLogin();

    }

    @Then("^User is Navigated to Secure Area$")
    public void user_is_Navigated_to_Secure_Area() throws Throwable {
        assertNotNull(secureAreaPage);
        Assert.assertTrue(secureAreaPage.getAlertText().getText().contains("You logged into a secure area!"));

    }

}
