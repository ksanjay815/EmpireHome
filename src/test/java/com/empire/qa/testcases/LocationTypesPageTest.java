package com.empire.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.empire.qa.base.BaseTest;
import com.empire.qa.pages.HomePage;
import com.empire.qa.pages.LocationTypesPage;
import com.empire.qa.pages.LoginPage;

public class LocationTypesPageTest extends BaseTest {
	LoginPage loginpage;
	HomePage homepage;
	LocationTypesPage locationtypespage;

	public LocationTypesPageTest() throws Throwable {
		super();

	}

	@BeforeMethod
	public void setup() throws Throwable {
		initialization(); // using this method to load url & not creating object bcoz it is static method
							// in basetest
		loginpage = new LoginPage();
		homepage = new HomePage();
		locationtypespage = new LocationTypesPage();

		homepage = loginpage.VerifyLoginPage();
		locationtypespage = homepage.verifyLocationTypesPage();
		Thread.sleep(2000);
	}

	@Test
	public void VerifylocationtypespageTitleTest() {

		String title = locationtypespage.VerifyLocationPageTitle();
		Assert.assertEquals(title, "Empire Home Admin Panel");
	}

	@Test
	public void VerifyBackBtnTest() throws InterruptedException {
		locationtypespage.VerifyBackBtn();
	}

	@Test
	public void VerifybackBtnAddLocationTypePgTest() throws InterruptedException {
		locationtypespage.VerifybackBtnAddLocationTypePg();
	}

	@Test(priority = 1)
	public void VerifyaddNewLocationwithValidDataTest() throws Throwable {
		locationtypespage.VerifyaddNewLocationwithValidData();
	}

	@Test
	public void VerifyaddNewLocationwithoutDataTest() throws Throwable {
		locationtypespage.VerifyaddNewLocationwithoutData();
	}

	@Test
	public void VerifyaddNewLocationwithInvalidLocationNameTest() throws Throwable {
		locationtypespage.VerifyaddNewLocationwithInvalidLocationName();
	}

	@Test
	public void VerifyToTopArrowBtnTest() throws Throwable {
		locationtypespage.VerifyToTopArrowBtn();
	}

	@Test
	public void VerifyNextPageBtnTest() throws Throwable {
		locationtypespage.VerifyNextPageBtn();
	}

	@Test
	public void VerifyPreviousPageBtnTest() throws Throwable {
		locationtypespage.VerifyPreviousPageBtn();
	}

	@Test
	public void VerifyPage3BtnTest() throws Throwable {
		locationtypespage.VerifyPage3Btn();
	}

	@Test
	public void VerifySnoSortingTest() throws Throwable {
		locationtypespage.VerifySnoSorting();
	}

	@Test
	public void VerifyLocationNameSortingTest() throws Throwable {
		locationtypespage.VerifyLocationNameSorting();
	}

	@Test
	public void VerifyShowEntriesDropdownTest() {
		locationtypespage.VerifyShowEntriesDropdown();
	}

	@Test(priority = 2)
	public void VerifyEditButtonBySearchLocationNameTest() throws Throwable {
		locationtypespage.VerifyEditButtonBySearchLocationName();
	}

	@Test(priority = 3)
	public void VerifyDeleteButtonBySearchLocationNameTest() throws InterruptedException {
		locationtypespage.VerifyDeleteButtonBySearchLocationName();
	}

	@Test(priority = 4)
	public void VerifyDeleteButtonByClickingYesTest() throws Throwable {
		locationtypespage.VerifyDeleteButtonByClickingYes();
	}

	@Test
	public void VerifySearchTextFieldTest() throws InterruptedException {
		locationtypespage.VerifySearchTextField();
	}

	@Test
	public void VerifySearchTextFieldWithInvalidDataTest() throws InterruptedException {
		locationtypespage.VerifySearchTextFieldWithInvalidData();

	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
