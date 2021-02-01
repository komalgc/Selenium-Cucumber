package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

    public class HoverPage extends HomePage {

     By figureBox = By.className("figure");

        public HoverPage(WebDriver driver) {
        super(driver);

    }

    public FigureCaption hoverOnFigure(int index) {
        WebElement figure = driver.findElements(figureBox).get(index - 1);
        Actions action = new Actions(driver);
        action.moveToElement(figure).perform();
        return new FigureCaption(figure.findElement(By.className("figcaption")));
    }

    public class FigureCaption {

        private WebElement caption;
        private By header = By.tagName("h5");
        private By link = By.tagName("a");
        public FigureCaption(WebElement figCaption) {
            this.caption = figCaption;
        }

        public boolean isCaptionDisplayed() {
            return caption.isDisplayed();
        }

        public String getTitle() {
            return caption.findElement(header).getText();
        }

        public String getLink(){
            return caption.findElement(link).getText();
        }
    }
}
