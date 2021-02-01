package Hover;


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
import pages.HoverPage;
import pages.LoginPage;
import java.util.concurrent.TimeUnit;



public class hoversteps {

    static WebDriver driver;
    HomePage homePage;
    HoverPage hoverPage;
    HoverPage.FigureCaption caption;

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


    @Given("^Click on HoverPage$")
    public void click_on_HoverPage() {

        hoverPage = homePage.clickonHover();
    }

    @When("The user Hovers on figure (\\d+)")
    public void theUserHoversOnFigure(int index) {
        caption = hoverPage.hoverOnFigure(index);
    }

    @Then("^Caption is Displayed$")
    public void caption_is_Displayed() throws Throwable {
        Assert.assertTrue(caption.isCaptionDisplayed());

    }

    @Then("^The title is \"([^\"]*)\"$")
    public void the_title_is(String arg1) throws Throwable {
        Assert.assertEquals("Komaluser not found", "name: user1", caption.getTitle());

    }

    @Then("^The link text is \"([^\"]*)\"$")
    public void the_link_text_is(String arg1) throws Throwable {
        Assert.assertEquals("View profile", caption.getLink());
    }


}
