package GeneralStore;

import Screens.GeneralStoreLandingPage;
import basePackage.BaseClass;
import org.testng.annotations.Test;

public class GeneralTest extends BaseClass {

    @Test
    public void generalAppTest() throws InterruptedException {
        GeneralStoreLandingPage landingPage = new GeneralStoreLandingPage(androidDriver);
        landingPage.clickTest();
    }
}
