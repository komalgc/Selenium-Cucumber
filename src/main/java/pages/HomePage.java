package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    protected WebDriver driver;
    private By basicAuthentication = By.linkText("Form Authentication");
    private By dropdown = By.linkText("Dropdown");
    private By hovers = By.linkText("Hovers");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickonAuthenticationPage() {
        driver.findElement(basicAuthentication).click();
        return new LoginPage(driver);
    }


    public DropdownPage clickonDropDown(){
        driver.findElement(dropdown).click();
        return new DropdownPage(driver);

    }

    public HoverPage clickonHover() {
        driver.findElement(hovers).click();
        return new HoverPage(driver);

    }

    }

