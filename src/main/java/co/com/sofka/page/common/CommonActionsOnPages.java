package co.com.sofka.page.common;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CommonActionsOnPages {
    //private final WebDriver driver;
   protected WebDriver driver;

    public CommonActionsOnPages(WebDriver driver) {
        this.driver = driver;
    }

    protected void clear(By selector){
        driver.findElement(selector).clear();
    }

    protected void clickOn(By selector){
        driver.findElement(selector).click();
    }

    protected void type(By selector, String value){
        driver.findElement(selector).sendKeys(value);
    }
    protected void type1(By selector, String value){
        driver.findElement(selector).sendKeys(value + Keys.ENTER);
    }

    protected void doSubmit(By selector){
        driver.findElement(selector).submit();
    }

    protected void getText(By selector){
        driver.findElement(selector).getText();
    }

    protected String getTexto(By selector){
        return (driver.findElement(selector).getText());
    }

    protected int getRows(By selector){
        List<WebElement> rows = driver.findElements(selector);
        return rows.size();
    }

    protected int getListJobTitle(By selector){
        List<WebElement> rows = driver.findElements(selector);
        return rows.size();
    }

}
