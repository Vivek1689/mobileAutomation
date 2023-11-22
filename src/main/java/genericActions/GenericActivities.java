package genericActions;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class GenericActivities {
    public void iosSwipe(IOSDriver iosDriver, AppiumBy element, String direction){

        WebElement ele = iosDriver.findElement(element);
        Map<String, Object> params = new HashMap<>();
        params.put("direction", direction);
        params.put("element", ((RemoteWebElement) ele).getId());
        iosDriver.executeScript("mobile: swipe", params);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void iosClick(IOSDriver iosDriver, AppiumBy element){
        iosDriver.findElement(element).click();
    }

    public void delay(int milliseconds){
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void enterText(IOSDriver iosDriver, AppiumBy element,String message){
        iosDriver.findElement(element).sendKeys(message);
    }

    public void webWait(WebDriver driver, By element, int numberOfSeconds){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(numberOfSeconds));
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }
}
