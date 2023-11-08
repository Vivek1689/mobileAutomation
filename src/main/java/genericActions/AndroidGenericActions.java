package genericActions;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AndroidGenericActions {

    public static void enterText(AndroidDriver driver, By element, String message){
        driver.findElement(element).sendKeys(message);
    }

    public static void enterTextHideKeyboard(AndroidDriver driver,By element,String message){
        driver.findElement(element).sendKeys(message);
        driver.hideKeyboard();
    }

    public static void clickElement(AndroidDriver driver, WebElement element){
        element.click();
    }

    public static void scrollToText(AndroidDriver driver,String text){
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"\"+text+\""));
    }
}
