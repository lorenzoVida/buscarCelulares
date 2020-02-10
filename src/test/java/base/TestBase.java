package base;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.login;

import javax.sound.midi.Soundbank;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static Properties prope;


    public static void main(String[] args) throws IOException {
        try {
            prope = new Properties();
            System.out.println(System.getProperty("user.dir"));
            FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"/src" +
                    "/test/java/base/config.properties");
            System.out.println(ip);
            prope.load(ip);
            WebDriver driver = new ChromeDriver();
            driver.get(prope.getProperty("url"));

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
        }
    }
/*
         WebDriver driver = new ChromeDriver();
        String browserName = prope.getProperty("browser");
        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "D://chromeDriver//chromedriver.exe");
            driver = new ChromeDriver();
        } else if(browserName.equals("FF")){
            System.setProperty("webdriver.gecko.driver", "D://FF//geckodriver.exe");
            driver = new FirefoxDriver();
        }
        System.out.println(prope.getProperty("browser"));
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.get(prope.getProperty("url"));*/



  /*  public static void getProperties() throws IOException {
        try {
            prope = new Properties();
            FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com" +
                    "/crm/qa/config");
            prope.load(ip);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
        }
    }*/

/*    public static void initialization() {
        String browserName = prope.getProperty("browser");
        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "D://chromeDriver//chromedriver.exe");
            driver = new ChromeDriver();
        } else if(browserName.equals("FF")){
            System.setProperty("webdriver.gecko.driver", "D://FF//geckodriver.exe");
            driver = new FirefoxDriver();
        }
        System.out.println(prope.getProperty("browser"));
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.get(prope.getProperty("url"));

    }*/






}
