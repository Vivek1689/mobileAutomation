package genericActions;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AndroidGenericActions {
    public AndroidDriver driver;
    public AndroidGenericActions(AndroidDriver driver) {
        this.driver = driver;
    }

    public void enterText(AndroidDriver driver, By element, String message){
        driver.findElement(element).sendKeys(message);
    }

    public void enterTextHideKeyboard(AndroidDriver driver,By element,String message){
        driver.findElement(element).sendKeys(message);
        driver.hideKeyboard();
    }

    public void clickElement(WebElement element){
        element.click();
    }

    public void scrollToText(String text){
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));"));
    }
}
