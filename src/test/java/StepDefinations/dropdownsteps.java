package StepDefinations;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.DropdownPage;
import pages.HomePage;
import pages.LoginPage;


public class dropdownsteps {
    static WebDriver driver;
    HomePage homePage;
    LoginPage loginPage;
    DropdownPage dropdownPage;

    @Given("^The user in HomePage(\\d+)$")
    public void the_user_in_HomePage(int arg1)  {

    }

    @Given("^Clicks on Dropdownoption$")
    public void clicks_on_Dropdownoption() {
        dropdownPage = homePage.clickonDropDown();

    }

    @When("^The user selects \"([^\"]*)\" from the dropdown$")
    public void the_user_selects_from_the_dropdown(String option) {
        dropdownPage.selectFromDropdown(option);

    }

    @Then("^\"([^\"]*)\" is selected$")
    public void is_selected(String arg1)  {

        System.out.println(dropdownPage.getSelectedoptions());
    }

}
