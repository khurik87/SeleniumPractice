package test.VyTrack;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CalendarEventsPage;
import pages.CreateCalendarEventPage;
import pages.LogInPage;

import utils.TestBase;

public class NewCalendarEventsTests extends TestBase {


    @Test(description = "Verify that page subtitle is equals to 'All Calendar Events'")
    public void test1() {
        extentTest = extentReports.createTest("Verify that page subtitle is equals to 'All Calendar Events'");

        LogInPage loginPage = new LogInPage(); //login page object

        loginPage.login("storemanager85", "UserUser123");
        loginPage.navigateTo("Activities", "Calendar Events");

        String expectedSubtitle = "All Calendar Events";
        String actualSubTitle = loginPage.getPageSubTitle();
        Assert.assertEquals(actualSubTitle,expectedSubtitle);
        extentTest.pass("Verified that page subtitle 'All Calendar Events' is displayed");
    }



}