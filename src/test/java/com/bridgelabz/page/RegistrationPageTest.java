package com.bridgelabz.page;

import com.bridgelabz.base.BaseClass;
import com.bridgelabz.util.Utility;
import org.apache.hc.core5.util.Asserts;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegistrationPageTest extends BaseClass {
    RegistrationPage registrationPage;
    HomePage homePage;

    @BeforeMethod
    public void setup() {
        launchBrowser();
        registrationPage = new RegistrationPage();
    }

    @Test    public void verifyRegistrationPageTitleTest() {
        String registrationPageTitle = registrationPage.verifyRegistrationPageTitle();
        Assert.assertEquals(registrationPageTitle, "Sign up - Spotify");
    }

    @DataProvider
    public Object[][] getRegistrationTestData() {
        return Utility.getTestData("registration");
    }

    @Test(dataProvider = "getRegistrationTestData")
    public void registrationTest(String username, String confirmmail, String password, String displayName, String month, String day, String year) {
        homePage = registrationPage.registrtion(username, confirmmail, password, displayName, month, day, year);

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
