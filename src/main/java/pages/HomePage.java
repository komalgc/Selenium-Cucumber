package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    protected WebDriver driver;
    private final By basicAuthentication = By.linkText("Form Authentication");
    private final By dropdown = By.linkText("Dropdown");
    private final By hovers = By.linkText("Hovers");
    private final By keyPress = By.cssSelector("li:nth-child(31) > a");
    private final By horizontalslider = By.linkText("Horizontal Slider");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickonAuthenticationPage() {
        driver.findElement(basicAuthentication).click();
        return new LoginPage(driver);
    }


    public DropdownPage clickonDropDown() {
        driver.findElement(dropdown).click();
        return new DropdownPage(driver);

    }

    public HoverPage clickonHover() {
        driver.findElement(hovers).click();
        return new HoverPage(driver);

    }

    public KeyPressPage clickonKeyPress() {

        driver.findElement(keyPress).click();
        return new KeyPressPage(driver);
    }

    public HorizontalSliderPage clickonHorizontalSlider() {

        driver.findElement(horizontalslider).click();
        return new HorizontalSliderPage(driver);
    }
}

