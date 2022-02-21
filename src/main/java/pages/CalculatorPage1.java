package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.PageFactory.initElements;

public class CalculatorPage1 {

    @FindBy(css = "jlkklc")
    private WebElement Task;

    @FindBy(css = "#span[id=cwos]")
    private WebElement Final;

    public CalculatorPage1(WebDriver driver) {
        initElements(driver, this);
    }

    public String getTask() {
        return Task.getText();
    }

    public String getFinal() {
        return Final.getText();
    }

}
