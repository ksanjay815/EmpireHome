package com.empire.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.empire.qa.base.BaseTest;
import com.empire.qa.pages.ConditionTypesPage;
import com.empire.qa.pages.HolidaysPage;
import com.empire.qa.pages.HomePage;
import com.empire.qa.pages.LoginPage;

public class HolidaysPageTest extends BaseTest {
	LoginPage loginpage;
	HomePage homepage;
	HolidaysPage holidayspage;
	static String shname = "Holidays";
	static String shname2 = "HolidaysInvalidData";

	public HolidaysPageTest() throws Throwable {
		super();
	}

	@BeforeMethod
	public void setup() throws Throwable {
		initialization(); // using this method to load url & not creating object bcoz it is static method
							// in basetest
		loginpage = new LoginPage();
		homepage = new HomePage();
		holidayspage = new HolidaysPage();

		homepage = loginpage.VerifyLoginPage();
		holidayspage = homepage.verifyHolidaysPage();
		Thread.sleep(2000);
	}

	@Test
	public void VerifyholidayspageTitleTest() {

		String title = holidayspage.VerifyHolidaysPageTitle();
		Assert.assertEquals(title, "Empire Home Admin Panel");
	}

	@Test
	public void VerifyBackBtnTest() throws InterruptedException {
		holidayspage.VerifyBackBtn();
	}

	@Test
	public void VerifybackBtnAddHolidayTypeTypePg() throws InterruptedException {
		holidayspage.VerifybackBtnAddHolidayTypeTypePg();
	}

	@Test(priority = 1)
	public void VerifyaddNewolidayswithValidDataTest() throws Throwable {
		holidayspage.VerifyaddNewolidayswithValidData();
	}

	@Test
	public void VerifyaddNewolidayswithoutDataTest() throws Throwable {
		holidayspage.VerifyaddNewolidayswithoutData();
	}

	@Test()
	public void VerifyaddNewolidayswithInvalidDataTest() throws Throwable {
		holidayspage.VerifyaddNewolidayswithInvalidData();
	}

	@Test(priority = 2)
	public void VerifyEditButtonBySelectingHolidaysNameTest() throws Throwable {
		holidayspage.VerifyEditButtonBySelectingHolidaysName();
	}

	@Test(priority = 3)
	public void VerifyDeleteButtonBySelectingHolidaysNameTest() throws InterruptedException {
		holidayspage.VerifyDeleteButtonBySelectingHolidaysName();
	}

	@Test(priority = 4)
	public void VerifyDeleteButtonBySelectingHolidaysNameAndClickingYesTest() throws Throwable {
		holidayspage.VerifyDeleteButtonBySelectingHolidaysNameAndClickingYes();
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
