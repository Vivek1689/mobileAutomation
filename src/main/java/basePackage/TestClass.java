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
        GenericActivities activities = new GenericActivities();
        activities.delay(5000);
        AppiumBy subtitle_firstscreen = (AppiumBy) AppiumBy.accessibilityId("Subtitle_label");
        AppiumBy subtitle_secondscreen = (AppiumBy) AppiumBy.accessibilityId("Subtitle_label");
        AppiumBy subtitle_thirdscreen = (AppiumBy) AppiumBy.accessibilityId("Subtitle_label");
        AppiumBy skipForNowButton = (AppiumBy) AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == 'Skip for Now'`]");
        //AppiumBy skipForNowButtonWhatNew = (AppiumBy) AppiumBy.accessibilityId("Skip for Now");
        //AppiumBy upgradeButton = (AppiumBy) AppiumBy.accessibilityId("Upgrade");
        //AppiumBy layFlatPhotobook = (AppiumBy) AppiumBy.iOSClassChain("**/XCUIElementTypeCell[`name == 'Product_listing_cell'`][1]");
        AppiumBy hardcoverPhotobook = (AppiumBy) AppiumBy.iOSClassChain("**/XCUIElementTypeCell[`name == 'Product_listing_cell'`][2]");
        AppiumBy photobook13x10 = (AppiumBy) AppiumBy.iOSClassChain("**/XCUIElementTypeCell[`name == 'Product_format_cell'`][1]");
        AppiumBy allowPhotosAccessButton = (AppiumBy) AppiumBy.accessibilityId("Allow Access to All Photos");
        AppiumBy albumsButton = (AppiumBy) AppiumBy.accessibilityId("Albums");
        AppiumBy test_Album = (AppiumBy) AppiumBy.iOSClassChain("**/XCUIElementTypeImage[`name == 'Album_image_view'`][2]");
        AppiumBy createBookButton = (AppiumBy) AppiumBy.accessibilityId("Create Book");
        AppiumBy portfolioWhiteTheme = (AppiumBy) AppiumBy.iOSClassChain("**/XCUIElementTypeImage[`name == 'tableSurface'`][1]");
        AppiumBy checkoutButton = (AppiumBy) AppiumBy.iOSClassChain("**/XCUIElementTypeNavigationBar/XCUIElementTypeButton[2]");
        AppiumBy preflightCheckoutButton = (AppiumBy) AppiumBy.accessibilityId("Checkout_button");
        AppiumBy emailIDfield = (AppiumBy) AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[`value == 'email@example.com'`]");
        String swipe_direction = "left";
        String emailID = "motifmimeovivek@gmail.com";
        String password = "Vivekdev@0987";
        activities.iosSwipe(iosDriver, subtitle_firstscreen, swipe_direction);
        activities.iosSwipe(iosDriver, subtitle_secondscreen, swipe_direction);
        activities.iosSwipe(iosDriver, subtitle_thirdscreen, swipe_direction);
        activities.iosClick(iosDriver,skipForNowButton);
        activities.delay(3000);
        //activities.iosClick(iosDriver,skipForNowButtonWhatNew);
        //activities.iosClick(iosDriver,upgradeButton);
        //activities.iosClick(iosDriver,layFlatPhotobook);
        activities.iosClick(iosDriver,hardcoverPhotobook);
        activities.iosClick(iosDriver,photobook13x10);
        activities.delay(6000);
        activities.iosClick(iosDriver,allowPhotosAccessButton);
        activities.iosClick(iosDriver,albumsButton);
        activities.iosClick(iosDriver,test_Album);
        activities.delay(40000);
        activities.iosClick(iosDriver,createBookButton);
        activities.delay(5000);
        activities.iosClick(iosDriver,portfolioWhiteTheme);
        activities.delay(5000);
        activities.iosClick(iosDriver,checkoutButton);
        activities.delay(3000);
        activities.iosClick(iosDriver,preflightCheckoutButton);
        activities.enterText(iosDriver,emailIDfield,emailID);

    }

}
