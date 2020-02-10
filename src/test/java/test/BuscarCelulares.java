package test;

import base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.login;

public class BuscarCelulares extends TestBase {
    private WebDriver driver;
    public login loginHome;

    @BeforeMethod
    public void setUp() {

        WebDriverManager.chromedriver().version("78.0").setup();
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
    }

    @AfterClass
    public void afterClass() {
       if (driver != null) {
    }  WebDriverManager.chromedriver().clearCache();
       driver.quit();

              }
    @Test
    public void loginFacebook() {
        loginHome = new login(driver);

        loginHome.txtemail().sendKeys("asd");
        loginHome.txtpass().sendKeys("ass");
        loginHome.btnlogin().click();
    }




}
