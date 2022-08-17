package pages;

import PageObjectModel.AbstractClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import java.io.BufferedWriter;
import java.io.File;
import org.openqa.selenium.By;
import java.io.FileWriter;

public class MarketersPage extends AbstractClass {

    WebDriver driver;

    public MarketersPage() {
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    public void marketersWriter() {
        WebElement a = driver.findElement(By.xpath("//ul[@class='result']"));
        String s = a.getText();

        try {
            File file = new File("output.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(s);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}