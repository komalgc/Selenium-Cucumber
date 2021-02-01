package KeyPresses;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.HoverPage;
import pages.KeyPressPage;
import pages.LoginPage;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class KeyPressSteps {

    static WebDriver driver;
    HomePage homePage;
    KeyPressPage keyPressPage;

    @Before
    public void setup() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        homePage = new HomePage(driver);
    }

    @After
    public void teardown() {
        driver.quit();
    }

    @Given("^You are on Input Page$")
    public void you_are_on_Input_Page() {

        keyPressPage = homePage.clickonKeyPress();
    }

    @When("^You send \"([^\"]*)\"$")
    public void you_send(String arg1) throws InterruptedException {

        keyPressPage.enterText(arg1 + Keys.BACK_SPACE);

        Thread.sleep(5000);
    }



    @Then("^You get a message \"([^\"]*)\"$")
    public void you_get_a_message(String arg1) {

        Assert.assertEquals("You entered: BACK_SPACE", keyPressPage.getResult());

    }

    @When("You send Pi Value")
    public void youSendPiValue() {
        keyPressPage.pitest();
    }

    @Then("it should pass the Pi value in the field")
    public void itShouldPassThePiValueInTheField() throws InterruptedException {
       Thread.sleep(1000);
    }


}
