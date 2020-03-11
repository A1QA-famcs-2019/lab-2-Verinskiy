package pages;

import driver.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginForm {
    private WebElement loginTextField = Browser.getDriver().findElement(By.xpath("//div[contains(@class,'auth-form__line')]//input[@type=\"text\"]"));
    private WebElement passwordTextField = Browser.getDriver().findElement(By.xpath("//div[contains(@class,'auth-form__line')]//input[@type=\"password\"]"));
    private WebElement loginButton = Browser.getDriver().findElement(By.xpath("//div[contains(@class, 'auth-form__control')]//button[@type='submit']"));

    public void login() {
        loginTextField.sendKeys("verinskij438@gmail.com");
        passwordTextField.sendKeys("8535007741");
        loginButton.click();
        final WebElement ikonka = Browser.getDriver().findElement(By.xpath("//div[contains(@class, 'b-top-profile__image js-header-user-avatar')]"));
    }

}
