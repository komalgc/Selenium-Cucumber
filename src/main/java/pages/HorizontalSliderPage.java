package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage extends HomePage {

    private By sliderText = By.id("range");

    private By slider = By.cssSelector(".sliderContainer input");

    public HorizontalSliderPage(WebDriver driver) {
        super(driver);
    }

    public void setSlider(String value) {

        while (!getSliderText().equals(value)) {
            driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);

        }
    }

    public String getSliderText() {
        return driver.findElement(sliderText).getText();

    }
}
