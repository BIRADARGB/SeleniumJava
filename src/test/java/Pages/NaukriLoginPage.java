package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NaukriLoginPage extends BasePage {

    WebDriver driver;

    public NaukriLoginPage(WebDriver driver){
       // super(driver);
        this.driver = driver;
    }
    private final String btn_Login = "//a[contains(text(),'Login')]";
    //private final String txt_email = "//input[@placeholder='Enter your active Email ID / Username']";
    private final String txt_email = "//label[contains(text(),\"Email ID / Username\")]//following::input[1]";
    private final String txtx_password = "//label[contains(text(),\"Password\")]//following::input[1]";
    private final String LoginButton = "//button[text()='Login']";

    public void loginToApp(String userName,String password){
        driver.findElement(By.xpath(btn_Login)).click();
        waitForElementPresent(driver,txt_email);
        driver.findElement(By.xpath(txt_email)).sendKeys(userName);
        waitForElementPresent(driver,txtx_password);
        driver.findElement(By.xpath(txtx_password)).sendKeys(password);
        driver.findElement(By.xpath(LoginButton)).click();
    }
}
