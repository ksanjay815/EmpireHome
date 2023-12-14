package com.empire.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.empire.qa.base.BaseTest;
import com.empire.qa.pages.HomePage;
import com.empire.qa.pages.LoginPage;
import com.empire.qa.pages.MrpFactorsPage;

public class MrpFactorsPageTest extends BaseTest {
	LoginPage loginpage;
	HomePage homepage;

	MrpFactorsPage mrpfactorspage;

	public MrpFactorsPageTest() throws Throwable {
		super();

	}

	@BeforeMethod
	public void setup() throws Throwable {
		initialization(); // using this method to load url & not creating object bcoz it is static method
							// in basetest
		loginpage = new LoginPage();
		homepage = new HomePage();
		mrpfactorspage = new MrpFactorsPage();

		homepage = loginpage.VerifyLoginPage();
		mrpfactorspage = homepage.verifyMrpFactorPage();
		Thread.sleep(1200);
	}

	@Test
	public void VerifymrpfactorspageTitleTest() {

		String title = mrpfactorspage.VerifyUserTypePageTitle();
		Assert.assertEquals(title, "Empire Home Admin Panel");
	}

	@Test
	public void VerifyBackBtnTest() throws InterruptedException {
		mrpfactorspage.VerifyBackBtn();
	}

	@Test
	public void VerifybackBtnAddMrpFactorsPgTest() throws InterruptedException {
		mrpfactorspage.VerifybackBtnAddMrpFactorsPg();
	}

	@Test(priority = 1)
	public void VerifyaddNewMrpFactorwithValidDataTest() throws Throwable {
		mrpfactorspage.VerifyaddNewMrpFactorwithValidData();
	}

	@Test
	public void VerifyaddNewMrpFactorwithoutDataTest() throws Throwable {
		mrpfactorspage.VerifyaddNewMrpFactorwithoutData();
	}

	@Test
	public void VerifyaddNewMrpFactorwithInvalidFactorValueTest() throws Throwable {
		mrpfactorspage.VerifyaddNewMrpFactorwithInvalidFactorValue();
	}

	@Test
	public void VerifyToTopArrowBtnTest() throws Throwable {
		mrpfactorspage.VerifyToTopArrowBtn();
	}

	@Test
	public void VerifyNextPageBtnTest() throws Throwable {
		mrpfactorspage.VerifyNextPageBtn();
	}

	@Test
	public void VerifyPreviousPageBtnTest() throws Throwable {
		mrpfactorspage.VerifyPreviousPageBtn();
	}

	@Test
	public void VerifyPage2BtnTest() throws Throwable {
		mrpfactorspage.VerifyPage2Btn();
	}

	@Test
	public void VerifySnoSortingTest() throws Throwable {
		mrpfactorspage.VerifySnoSorting();
	}

	@Test
	public void VerifyFactorNameSortingTest() throws Throwable {
		mrpfactorspage.VerifyFactorNameSorting();
	}

	@Test
	public void VerifyFactorValueSortingTest() throws Throwable {
		mrpfactorspage.VerifyFactorValueSorting();
	}

	@Test
	public void VerifyShowEntriesDropdownTest() {
		mrpfactorspage.VerifyShowEntriesDropdown();
	}

	@Test(priority = 2)
	public void VerifyEditButtonBySearchFactorNameTest() throws Throwable {
		mrpfactorspage.VerifyEditButtonBySearchFactorName();
	}

	@Test(priority = 3)
	public void VerifyDeleteButtonBySearchFactorNameTest() throws InterruptedException {
		mrpfactorspage.VerifyDeleteButtonBySearchFactorName();
	}

	@Test(priority = 4)
	public void VerifyDeleteButtonByClickingYesTest() throws Throwable {
		mrpfactorspage.VerifyDeleteButtonByClickingYes();
	}

	@Test
	public void VerifySearchTextFieldTest() {
		mrpfactorspage.VerifySearchTextField();
	}

	@Test
	public void VerifySearchTextFieldWithInvalidDataTest() {
		mrpfactorspage.VerifySearchTextFieldWithInvalidData();

	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}