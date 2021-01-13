package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends HomePage {


    By userNameField = By.id("username");
    By passwordField = By.id("password");
    By loginButton = By.cssSelector("#login button");

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public  void setuserName(String username) {
        driver.findElement(userNameField).sendKeys(username);
    }

    public  void setpassword(String password) {

        driver.findElement(passwordField).sendKeys(password);
    }

    public  SecureAreaPage clickLogin() {
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }
}
