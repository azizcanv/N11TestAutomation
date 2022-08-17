package pages;

import PageObjectModel.AbstractClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class N11Page extends AbstractClass {

    WebDriver driver;

    public N11Page(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[@class='btn baseBtn-green']")
    private WebElement onayButton;

    public void clickOnayButton(){
        clickFunction(onayButton);
    }

    @FindBy(xpath = "//span[text()='Tümünü Kabul Et']")
    private WebElement cookiesButton;

    public void clickCookiesButton(){
        clickFunction(cookiesButton);
    }

    @FindBy(xpath = "//a[@title='Markalar']")
    private WebElement magazalarButton;

    public void clickMagazalarButton(){
        clickFunction(magazalarButton);
    }

    @FindBy(xpath = "//a[@href='https://www.n11.com/markalar?brand=A']")
    private WebElement aMarkaButton;

    public void clickAMarkaButton() {clickFunction(aMarkaButton); }

    @FindBy(id = "searchData")
    private WebElement searchArea;

    public void typeSearchData(String urun){
        sendKeysFunction(searchArea,urun);
    }

    @FindBy(xpath = "//span[@class='iconsSearch']")
    private WebElement searchButton;

    public void clickSearchButton(){
        clickFunction(searchButton);
    }

}
