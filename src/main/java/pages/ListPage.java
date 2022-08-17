package pages;

import PageObjectModel.AbstractClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ListPage extends AbstractClass {

    WebDriver driver;

    public ListPage() {
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//label[@id='freeShipmentOption']")
    private WebElement cargoButton;

    public void clickCargoButton() {
        clickFunction(cargoButton);
    }

    @FindBy(xpath = "//div[@class='selected-item']")
    private WebElement listButton;

    public void clickListButton(){
        clickFunction(listButton);
    }

    @FindBy(xpath = "//div[@data-value='REVIEWS']")
    private WebElement yorumButton;

    public void clickYorumButton(){
        clickFunction(yorumButton);
    }

    @FindBy(xpath = "(//div[@data-position='1'])[1]")
    private WebElement firstProductButton;

    public void clickFirstProductButton() {
        clickFunction(firstProductButton);
    }

    @FindBy(xpath = "(//div[@data-position='27'])[1]")
    private WebElement secondProductButton;

    public void clickSecondProductButton() {
        clickFunction(secondProductButton);
    }

    @FindBy(xpath = "//div[@class='product-add-cart']")
    private WebElement addProductButton;

    public void clickAddProductButton() {
        clickFunction(addProductButton);
    }

    public void goBack() {
        driver.navigate().back();
    }
}
