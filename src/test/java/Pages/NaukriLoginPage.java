package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NaukriLoginPage {

    WebDriver driver;

    public NaukriLoginPage(WebDriver driver){
       // super(driver);
        this.driver = driver;
    }
    private final String btn_Login = "//a[contains(text(),'Login')]";
    private final String txt_email = "//input[@placeholder='Enter your active Email ID / Username']";

    public void loginToApp(String userName,String password){
        driver.findElement(By.xpath(btn_Login)).click();
        driver.findElement(By.xpath(txt_email)).sendKeys(userName);
    }
}
