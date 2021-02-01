package HorizontalSlider;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.HorizontalSliderPage;
import pages.KeyPressPage;

import java.util.concurrent.TimeUnit;

public class HorizontalSteps {


    static WebDriver driver;
    HomePage homePage;
    HorizontalSliderPage horizontalSliderPage;

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

    @Given("^the user is on the Horizontalslider page$")
    public void the_user_is_on_the_Horizontalslider_page() throws Throwable {

        horizontalSliderPage = homePage.clickonHorizontalSlider();
    }

    @When("^slide the slider to right till the value is \"([^\"]*)\"$")
    public void slide_the_slider_to_right_till_the_value_is(String arg1) {
        horizontalSliderPage.setSlider(arg1);
    }

    @Then("^slide is moved$")
    public void slide_is_moved() throws Throwable {
        Assert.assertEquals("4", horizontalSliderPage.getSliderText());

    }

}
