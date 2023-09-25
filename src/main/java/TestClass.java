import basePackage.BaseClass;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class TestClass extends BaseClass {

    @Test
    public void appiumTest() throws MalformedURLException {
        //Starting Appium Server
        /*AppiumDriverLocalService service = new AppiumServiceBuilder()
                .withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"))
                .withIPAddress("http://127.0.0.1").usingPort(4723)
                .usingDriverExecutable(new File("/usr/local/bin/node")).build();
        service.start();*/
        //service.stop();
        androidDriver.findElement(AppiumBy.accessibilityId("App")).click();
        androidDriver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
        //androidDriver.findElement(AppiumBy.accessibilityId("Preference")).click();

    }

}
