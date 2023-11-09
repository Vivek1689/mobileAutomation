package Screens;

import genericActions.AndroidGenericActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import static genericActions.AndroidGenericActions.*;

import java.security.PrivateKey;

public class GeneralStoreLandingPage extends AndroidGenericActions {

    public GeneralStoreLandingPage(AndroidDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.androidsample.generalstore:id/nameField")
    private WebElement nameField;

    @AndroidFindBy(id = "android:id/text1")
    private WebElement countryDropdown;

    @AndroidFindBy(id = "com.androidsample.generalstore:id/radioFemale")
    private WebElement femaleRadioButton;

    @AndroidFindBy(id = "com.androidsample.generalstore:id/btnLetsShop")
    private WebElement letsShopButton;

    public void submit_complete_form(){

    }

    public void submit_incomplete_form(){

    }

    public void clickTest() throws InterruptedException {
        Thread.sleep(3000);
        countryDropdown.click();
    }


}
