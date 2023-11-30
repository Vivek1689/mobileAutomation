package Screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class websiteLandingPage {
    WebDriver driver;

    public websiteLandingPage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(linkText="Confirm you are in India")
    WebElement confirmLocation;
    @FindBy(xpath="//a[@aria-controls='navPages-24']")
    WebElement photobookLink;
    @FindBy(xpath="//a[@aria-label='Hardcover']")
    WebElement HCBbookLink;


}
