package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login {
    WebDriver driver;

    public login(WebDriver driver) {
        this.driver = driver;
    }

    By txtemail = By.id("email");
    By pass = By.id("pass");
    By btnlogin = By.id("loginbutton");

    public WebElement btnlogin(){
        return driver.findElement(btnlogin);
    }

    public WebElement txtemail(){
        return driver.findElement(txtemail);
    }

    public WebElement txtpass(){
        return driver.findElement(pass);
    }
}
