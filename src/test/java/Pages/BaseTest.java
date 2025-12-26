package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    private WebDriver driver;
    NaukriLoginPage loginpage;

    public void launchApplication(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.naukri.com");
    }

    public NaukriLoginPage getLoginPageObject(){
        if(loginpage==null){
            loginpage = new NaukriLoginPage(driver);
        }
        return  loginpage;
    }

}
