import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class TestClass {

    @Test
    public void appiumTest() throws MalformedURLException {
        //Starting Appium Server
        AppiumDriverLocalService service = new AppiumServiceBuilder()
                .withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"))
                .withIPAddress("http://127.0.0.1").usingPort(4723).build();
        service.start();

        //Configuring app in uiAutomator
        UiAutomator2Options uiAutomator2Options = new UiAutomator2Options();
        uiAutomator2Options.setDeviceName("VivekPixel");
        uiAutomator2Options.setApp("/Users/VivekVitthalShetty/IdeaProjects/untitled/src/test/java/resources/ApiDemos-debug.apk");

        AndroidDriver androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723"),uiAutomator2Options);
        service.stop();
    }

}
