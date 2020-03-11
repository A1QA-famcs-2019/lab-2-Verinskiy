package pages;

import driver.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActions {

    private ArrayList <WebElement> popularTopics = new ArrayList<WebElement>(Browser.getDriver().findElements(By.xpath("//ul[contains(@class,'project-navigation__list project-navigation__list_secondary')]")));
    private  WebElement tv;
    private WebElement onlinerButton;

    public void actions(){
        popularTopics.get(0).click();
        tv =Browser.getDriver().findElement(By.xpath("//h1[contains(@class,'schema-header__title')]"));
        onlinerButton = Browser.getDriver().findElement(By.xpath("//div[contains(@class,'b-top-logo')]"));
        onlinerButton.click();
    }
}
