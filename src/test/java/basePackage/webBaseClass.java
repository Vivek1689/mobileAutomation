package basePackage;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class webBaseClass {
    public WebDriver driver;

    @BeforeClass
    public void driverInitialization(){
        //System.setProperty("webdriver.edge.driver","/Users/VivekVitthalShetty/Documents/msedgedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://dev.mimeophotos.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown(){
      //driver.quit();
    }

    @Test
    public void HCB_creation() throws InterruptedException {
        driver.findElement(By.linkText("Confirm you are in India")).click();
        Thread.sleep(3000);
       WebElement photobookLink = driver.findElement(By.xpath("//a[@aria-controls='navPages-24']"));
       Actions action = new Actions(driver);
       action.moveToElement(photobookLink).build().perform();
       driver.findElement(By.xpath("//a[@aria-label='Hardcover']")).click();
       driver.findElement(By.xpath("//*[text()='Accept All Cookies']")).click();
      Thread.sleep(3000);
       //driver.findElement(By.xpath("//label[@for='attribute_rectangle__113_100']")).click();
        driver.findElement(By.xpath("//label[@for='attribute_rectangle__113_98']")).click();
      Thread.sleep(2000);
       driver.findElement(By.xpath("//input[@id='form-action-addToCart']")).click();
      Thread.sleep(3000);
       driver.findElement(By.xpath("//input[@id='attribute_text_name']")).sendKeys("AutomationProject");
       driver.findElement(By.xpath("//input[@value='Create']")).click();
       Thread.sleep(15000);
       WebElement iframe = driver.findElement(By.id("designerFrame"));
       driver.switchTo().frame(iframe);
        Thread.sleep(3000);
       driver.findElement(By.id("themeLabel1")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("viewer-btn-addtocart")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.xpath("//button[@aria-label='Add to cart']")).click();
        Thread.sleep(7000);
        driver.switchTo().defaultContent();
        driver.findElement(By.name("fname")).sendKeys("Vivek");
        driver.findElement(By.name("lname")).sendKeys("Shetty");
        driver.findElement(By.name("ship-address")).sendKeys("Test");
        driver.findElement(By.xpath("//input[@formcontrolname='address2']")).sendKeys("Test");
        WebElement selectDropdown = driver.findElement(By.name("ship-country"));
        //selectDropdown.click();
        Select selectCountry = new Select(selectDropdown);
        selectCountry.selectByValue("CH");
        driver.findElement(By.name("ship-city")).sendKeys("Test");
        driver.findElement(By.name("ship-state")).sendKeys("Test");
        driver.findElement(By.name("ship-zip")).sendKeys("12345");
        driver.findElement(By.name("phone")).sendKeys("0987654321");
        driver.findElement(By.xpath("//*[text()='Proceed to Payment ']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//*[text()='Select Address']")).click();
        Thread.sleep(8000);
        driver.findElement(By.xpath("//input[@name='ccname']")).sendKeys("Vivek");
        WebElement iframeStripe = driver.findElement(By.xpath("//iframe[@title='Secure card payment input frame']"));
        driver.switchTo().frame(iframeStripe);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@autocomplete='cc-number']")).sendKeys("4111111111111111");
        driver.findElement(By.xpath("//input[@name='exp-date']")).sendKeys("1124");
        driver.findElement(By.xpath("//input[@placeholder='CVC']")).sendKeys("123");
        driver.findElement(By.xpath("//input[@placeholder='ZIP']")).sendKeys("12345");
        driver.switchTo().defaultContent();
        driver.findElement(By.name("email")).sendKeys("vshetty@mimeo.com");
        driver.findElement(By.xpath("//input[@formcontrolname='confirmContactEmail']")).sendKeys("vshetty@mimeo.com");
        driver.findElement(By.name("phone")).sendKeys("0987654321");
        //This Element is inside single shadow DOM.
        SearchContext shadow = driver.findElement(By.cssSelector(".ng-untouched.ng-pristine.ng-invalid.ion-untouched.ion-pristine.ion-invalid.ion-color.ion-color-dark.md.interactive.hydrated")).getShadowRoot();
        Thread.sleep(2000);
        WebElement checkbox = shadow.findElement(By.cssSelector("label[for='ion-cb-0']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);",checkbox);
        Thread.sleep(4000);
      checkbox.click();
      driver.findElement(By.xpath("//*[text()=' Place Order']")).click();
      Thread.sleep(5000);
        System.out.println(driver.findElement(By.xpath("//app-order-detail/ion-grid/ion-row[2]/ion-col")).getText());
    }



}
