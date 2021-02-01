package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressPage extends HomePage {

    private By inputField = By.id("target");
    private By result = By.id("result");

    public KeyPressPage(WebDriver driver) {
        super(driver);
    }

    public void enterText(String text){
        driver.findElement(inputField).sendKeys(text);
    }

    public String getResult(){
        return driver.findElement(result).getText();
    }
    public void pitest(){
        enterText(Keys.chord(Keys.ALT,"P")+ "=3.14");
    }
}

