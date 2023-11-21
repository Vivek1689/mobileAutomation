package basePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
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
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
    }

    @AfterClass
    public void tearDown(){
      //driver.quit();
    }

    @Test
    public void HCB_creation() throws InterruptedException {
        driver.findElement(By.linkText("Confirm you are in India")).click();
        Thread.sleep(4000);
       WebElement photobookLink = driver.findElement(By.xpath("//a[@aria-controls='navPages-24']"));
       Actions action = new Actions(driver);
       action.moveToElement(photobookLink).build().perform();
       driver.findElement(By.xpath("//a[@aria-label='Hardcover']")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//*[text()='Accept All Cookies']")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//label[@for='attribute_rectangle__113_100']")).click();
       driver.findElement(By.xpath("//input[@id='form-action-addToCart']")).click();
       driver.findElement(By.xpath("//input[@id='attribute_text_name']")).sendKeys("AutomationProject");
       driver.findElement(By.xpath("//input[@value='Create']")).click();
        Thread.sleep(6000);
       driver.findElement(By.id("themeLabel1")).click();

    }



}
