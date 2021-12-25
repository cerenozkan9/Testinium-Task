package Main;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.Random;



public class BasePage {
    WebDriver driver;

    @Deprecated

    public BasePage(WebDriver driver){

        this.driver = driver;

    }
    public WebElement findTo(By locator){

        return driver.findElement(locator);
    }

    public void clickTo(By locator){

        findTo(locator).click();
    }


    public void sendKeys(By locator , String text){

        findTo(locator).sendKeys(text);
    }

    public void scrollDown(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
    }
    public void scrollDownOne(){

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)");
    }
    public List<WebElement> findToAll(By locator){

        return driver.findElements(locator);
    }

    public void randomSelect(By locator){

        Random rand = new Random();
        findToAll(locator).get(rand.nextInt(findToAll(locator).size())).click();
    }
    public void assertCont(String url){

        Assert.assertEquals(url, driver.getCurrentUrl());
    }

    public String priceOne(By locator){

        return driver.findElement(locator).getText();
    }

    public String priceTwo(By locator){

        return driver.findElement(locator).getText();
    }

    public String textOne(By locator){

        return driver.findElement(locator).getText();
    }

    public String textTwo(By locator){

        return driver.findElement(locator).getText();
    }

    public String textThree(By locator){

        return driver.findElement(locator).getText();
    }

    public String textFour(By locator){

        return driver.findElement(locator).getText();
    }

    public void assertPrice(String text, String text2){

        Assert.assertEquals(text, text2);
    }

    public void assertComp(String text, String text2){

        Assert.assertEquals(text, text2);
    }

}