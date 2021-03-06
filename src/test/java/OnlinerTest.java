import driver.Browser;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginForm;
import pages.Logout;
import pages.MainActions;
import pages.OnlinerMainPage;

import java.util.concurrent.TimeUnit;

public class OnlinerTest {

    @BeforeMethod
    public void setUp() {
        Browser.getDriver().manage().window().maximize();
        Browser.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Browser.getDriver().get("http://onliner.by/");
    }

    @Test
    public void onlinerTest() {

        OnlinerMainPage onlinerMainPage = new OnlinerMainPage();
        onlinerMainPage.clickLogIn();

        LoginForm loginForm = new LoginForm();
        loginForm.login("verinskij438@gmail.com","8535007741");

        MainActions task3 = new MainActions();
        task3.actions();

        Logout logout1 = new Logout();
        logout1.logout();
    }
}
