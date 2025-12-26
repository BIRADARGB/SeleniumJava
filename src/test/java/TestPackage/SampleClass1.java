package TestPackage;

import Pages.BaseTest;
import org.testng.annotations.Test;

public class SampleClass1 extends BaseTest {

    @Test
    public void launchapplication() {
        launchApplication();
        getLoginPageObject().loginToApp("basanagoudabiradar2@gmail.com","2010@@bb");
        }
    }
