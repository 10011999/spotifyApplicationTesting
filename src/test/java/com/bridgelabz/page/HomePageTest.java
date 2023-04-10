package com.bridgelabz.page;

import com.bridgelabz.base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {
    HomePage homePage;
    LoginPage loginPage;
      ProfilePage profilePage;

    @BeforeMethod
    public void setup() {
        launchBrowser();
        loginPage = new LoginPage();
        homePage = loginPage.login("motewaraditya77@gmail.com", "Aditya@4629");
    }

    @Test
    public void verifyHomePageTitleTest() {
        String homePageTitle = homePage.verifyHomePageTitle();
        Assert.assertEquals(homePageTitle, "Login - Spotify");
    }

    @Test
    public void gotoProfileTest() {
        profilePage = homePage.gotoProfile();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}
