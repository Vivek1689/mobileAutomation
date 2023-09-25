package basePackage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import static java.time.Duration.*;

public class iOSBaseClass {
    public IOSDriver iosDriver;
    public void iosConfigurations() throws MalformedURLException {
        XCUITestOptions iosOptions = new XCUITestOptions();
        iosOptions.setDeviceName("iPhone 14 Pro Max");
        iosOptions.setApp("/Users/VivekVitthalShetty/Documents/Motif.app");
        iosOptions.setPlatformVersion("16.2");
        iosOptions.setWdaLaunchTimeout(ofSeconds(20));
        iosDriver = new IOSDriver(new URL("http://127.0.0.1:4723"),iosOptions);

    }

    public void tearDown(){
        iosDriver.quit();
    }
}
