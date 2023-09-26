package genericActions;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import java.util.HashMap;
import java.util.Map;

public class GenericActivities {
    public void iosSwipe(IOSDriver iosDriver, AppiumBy element, String direction){

        WebElement ele = iosDriver.findElement(element);
        Map<String, Object> params = new HashMap<>();
        params.put("direction", direction);
        params.put("element", ((RemoteWebElement) ele).getId());
        iosDriver.executeScript("mobile: swipe", params);
    }
}
