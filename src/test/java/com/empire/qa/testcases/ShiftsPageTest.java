package com.empire.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.empire.qa.base.BaseTest;
import com.empire.qa.pages.HomePage;
import com.empire.qa.pages.LoginPage;
import com.empire.qa.pages.ShiftsPage;

public class ShiftsPageTest extends BaseTest {
	LoginPage loginpage;
	HomePage homepage;
	ShiftsPage shiftspage;

	public ShiftsPageTest() throws Throwable {
		super();

	}

	@BeforeMethod
	public void setup() throws Throwable {
		initialization(); // using this method to load url & not creating object bcoz it is static method
							// in basetest
		loginpage = new LoginPage();
		homepage = new HomePage();
		shiftspage = new ShiftsPage();

		homepage = loginpage.VerifyLoginPage();
		shiftspage = homepage.verifyShiftsPage();
		Thread.sleep(1600);
	}

	@Test
	public void VerifyshiftspageTitleTest() {

		String title = shiftspage.VerifyConditionPageTitle();
		Assert.assertEquals(title, "Empire Home Admin Panel");
	}

	@Test
	public void VerifyBackBtnTest() throws InterruptedException {
		shiftspage.VerifyBackBtn();
	}

	@Test
	public void VerifybackBtnAddShiftsPgTest() throws InterruptedException {
		shiftspage.VerifybackBtnAddShiftsPg();
	}

	@Test(priority = 1)
	public void VerifyaddNewShiftwithValidDataTest() throws Throwable {
		shiftspage.VerifyaddNewShiftwithValidData();
	}

	@Test
	public void VerifyaddNewShiftwithoutDataTest() throws Throwable {
		shiftspage.VerifyaddNewShiftwithoutData();
	}

	@Test
	public void VerifyaddNewShiftwithInvalidShiftNameTest() throws Throwable {
		shiftspage.VerifyaddNewShiftwithInvalidShiftName();
	}

	@Test
	public void VerifyToTopArrowBtnTest() throws Throwable {
		shiftspage.VerifyToTopArrowBtn();
	}

	@Test
	public void VerifyNextPageBtnTest() throws Throwable {
		shiftspage.VerifyNextPageBtn();
	}

	@Test
	public void VerifyPreviousPageBtnTest() throws Throwable {
		shiftspage.VerifyPreviousPageBtn();
	}

	@Test
	public void VerifyPage3BtnTest() throws Throwable {
		shiftspage.VerifyPage2Btn();
	}

	@Test
	public void VerifySnoSortingTest() throws Throwable {
		shiftspage.VerifySnoSorting();
	}

	@Test
	public void VerifyShiftNameSortingTest() throws Throwable {
		shiftspage.VerifyShiftNameSorting();
	}

	@Test
	public void VerifyShowEntriesDropdownTest() {
		shiftspage.VerifyShowEntriesDropdown();
	}

	@Test(priority = 2)
	public void VerifyEditButtonBySearchShiftNameTest() throws Throwable {
		shiftspage.VerifyEditButtonBySearchShiftName();
	}

	@Test(priority = 3)
	public void VerifyDeleteButtonBySearchShiftNameTest() throws InterruptedException {
		shiftspage.VerifyDeleteButtonBySearchShiftName();
	}

	@Test(priority = 4)
	public void VerifyDeleteButtonByClickingYesTest() throws Throwable {
		shiftspage.VerifyDeleteButtonByClickingYes();
	}

	@Test
	public void VerifySearchTextFieldTest() throws InterruptedException {
		shiftspage.VerifySearchTextField();
	}

	@Test
	public void VerifySearchTextFieldWithInvalidDataTest() throws InterruptedException {
		shiftspage.VerifySearchTextFieldWithInvalidData();

	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
