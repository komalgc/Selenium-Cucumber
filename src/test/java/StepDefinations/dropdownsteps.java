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
import pages.DropdownPage;
import pages.HomePage;
import pages.LoginPage;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class dropdownsteps {
    static WebDriver driver;
    HomePage homePage;
    LoginPage loginPage;
    DropdownPage dropdownPage;
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



    @Given("^Clicks on Dropdownoption page$")
    public void clicks_on_Dropdownoption() {
        dropdownPage = homePage.clickonDropDown();

    }

    @When("^The user selects \"([^\"]*)\" from the dropdown$")
    public void the_user_selects_from_the_dropdown(String option) {
        dropdownPage.selectFromDropdown(option);

    }

    @Then("^\"([^\"]*)\" is selected$")
    public void is_selected(List<String> arg1)  {

        Assert.assertEquals(dropdownPage.getSelectedoptions(), arg1);
    }

}