package TestPackage;

import Pages.BaseTest;
import org.testng.annotations.Test;

public class Test_LogintoNaukriScenario extends BaseTest {

    @Test
    public void launchAndLogintoApp() {
        launchApplication();
        getLoginPageObject().loginToApp("abcd@gmail.com","xyz@password!!");
        }
    }
