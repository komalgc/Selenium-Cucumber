package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage extends HomePage {

    By dropdown = By.id("dropdown");

    public DropdownPage(WebDriver driver) {

        super(driver);
    }

    public void selectFromDropdown(String option) {
        findFromDropDownElement().selectByVisibleText(option);
    }

    public List<String> getSelectedoptions() {

        List<WebElement> selectedoptions = findFromDropDownElement().getAllSelectedOptions();

        // Every element in this  webelement list map each, and get its text and collect them in a List

        return selectedoptions.stream().map(e -> e.getText()).collect(Collectors.toList());
    }

    private Select findFromDropDownElement() {
        return new Select(driver.findElement(dropdown));
    }
}
