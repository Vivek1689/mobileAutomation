package basePackage;

import basePackage.BaseClass;
import basePackage.iOSBaseClass;
import genericActions.GenericActivities;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class TestClass extends iOSBaseClass {

    @Test
    public void appiumTest() throws MalformedURLException {
        //Starting Appium Server
        /*AppiumDriverLocalService service = new AppiumServiceBuilder()
                .withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"))
                .withIPAddress("http://127.0.0.1").usingPort(4723)
                .usingDriverExecutable(new File("/usr/local/bin/node")).build();
        service.start();*/
        //service.stop();
        //By app = AppiumBy.accessibilityId("App");
        //androidDriver.findElement(AppiumBy.accessibilityId("App")).click();
        //androidDriver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
        //androidDriver.findElement(AppiumBy.accessibilityId("Preference")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        AppiumBy subtitle_firstscreen = (AppiumBy) AppiumBy.accessibilityId("Subtitle_label");
        String swipe_direction = "right";
        GenericActivities activities = new GenericActivities();
        activities.iosSwipe(iosDriver, subtitle_firstscreen, swipe_direction);
    }

}
