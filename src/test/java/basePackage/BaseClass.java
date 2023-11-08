package basePackage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass {

    public static AndroidDriver androidDriver;

    @BeforeClass
    public void configureAppium() throws MalformedURLException {
        UiAutomator2Options uiAutomator2Options = new UiAutomator2Options();
        //uiAutomator2Options.setDeviceName("VivekPixel");
        uiAutomator2Options.setDeviceName("Pixel 7 Pro API 28");
       // uiAutomator2Options.setAppPackage("com.google.android.youtube");

        //Configuring app in uiAutomator
        //uiAutomator2Options.setApp("/Users/VivekVitthalShetty/IdeaProjects/untitled/src/test/java/resources/ApiDemos-debug.apk");

        uiAutomator2Options.setApp("/Users/VivekVitthalShetty/IdeaProjects/untitled/src/test/java/resources/General-Store.apk");
        androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723"),uiAutomator2Options);
        //uiAutomator2Options.setApp("/Users/VivekVitthalShetty/IdeaProjects/untitled/src/test/java/resources/General-Store.apk");
        androidDriver.manage().timeouts().implicitlyWait()

    }

    @AfterClass
    public void tearDown(){
        androidDriver.quit();
    }
}
