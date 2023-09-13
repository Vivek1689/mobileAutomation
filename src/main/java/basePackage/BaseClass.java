package basePackage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass {

    public AndroidDriver androidDriver;
    @BeforeClass
    public void configureAppium() throws MalformedURLException {
        UiAutomator2Options uiAutomator2Options = new UiAutomator2Options();
        uiAutomator2Options.setDeviceName("VivekPixel");

        //Configuring app in uiAutomator
        uiAutomator2Options.setApp("/Users/VivekVitthalShetty/IdeaProjects/untitled/src/test/java/resources/ApiDemos-debug.apk");

        androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723"),uiAutomator2Options);
    }

    @AfterClass
    public void tearDown(){
        androidDriver.quit();
    }
}
