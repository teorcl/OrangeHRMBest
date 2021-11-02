package co.com.sofka.stepdefinitions.setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebUI {

    private static final String WEBDRIVER_CHROME_DRIVER = "webdriver.chrome.driver";
    private static final String WEBDRIVER_CHROME_DRIVER_PATH = "src/test/resources/driver/windows/chrome/chromedriver.exe";
    private static final String ORANGE_HRM_URL = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";

    protected WebDriver driver;

    protected void setUpWebDriver(){
        System.setProperty(WEBDRIVER_CHROME_DRIVER,WEBDRIVER_CHROME_DRIVER_PATH);
    }

    protected void setUpWebDriverUrl(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(ORANGE_HRM_URL);
    }

    protected void generalSetUp(){
        setUpWebDriver();
        setUpWebDriverUrl();
    }

    protected void quitDriver(){
        driver.quit();
    }

}
