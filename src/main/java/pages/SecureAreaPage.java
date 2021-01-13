package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SecureAreaPage extends HomePage {

     By alertText = By.id("flash");

    public SecureAreaPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getAlertText() {
        return driver.findElement(alertText);
    }
}
