package pages;

import driver.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Logout {

    private WebElement arrowExitButton = Browser.getDriver().findElement(By.xpath("//a[contains(@class, 'b-top-profile__preview') and contains(@class,  'js-toggle-bar')]"));
    private WebElement exitButton;
    public void logout(){
        arrowExitButton.click();
        exitButton =Browser.getDriver().findElement(By.xpath("//div[contains(@class, 'b-top-profile__logout')]/a[contains(@class, 'b-top-profile__link') and contains(@class,  'b-top-profile__link_secondary')]" ));
        exitButton.click();
    }
}
