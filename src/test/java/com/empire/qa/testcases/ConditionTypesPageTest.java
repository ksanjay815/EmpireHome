package com.empire.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.empire.qa.base.BaseTest;
import com.empire.qa.pages.ConditionTypesPage;
import com.empire.qa.pages.HomePage;
import com.empire.qa.pages.LoginPage;

public class ConditionTypesPageTest extends BaseTest {
	LoginPage loginpage;
	HomePage homepage;
	ConditionTypesPage conditiontypespage;

	public ConditionTypesPageTest() throws Throwable {
		super();

	}

	@BeforeMethod
	public void setup() throws Throwable {
		initialization(); // using this method to load url & not creating object bcoz it is static method
							// in basetest
		loginpage = new LoginPage();
		homepage = new HomePage();
		conditiontypespage = new ConditionTypesPage();

		homepage = loginpage.VerifyLoginPage();
		conditiontypespage = homepage.verifyConditionTypesPage();
		Thread.sleep(1200);
	}

	@Test
	public void VerifyConditionTypesPageTitleTest() {

		String title = conditiontypespage.VerifyConditionPageTitle();
		Assert.assertEquals(title, "Empire Home Admin Panel");
	}

	@Test
	public void VerifyBackBtnTest() throws InterruptedException {
		conditiontypespage.VerifyBackBtn();
	}

	@Test
	public void VerifybackBtnAddConditionTypePgTest() throws InterruptedException {
		conditiontypespage.VerifybackBtnAddConditionTypePg();
	}

	@Test(priority = 1)
	public void VerifyaddNewConditionwithValidDataTest() throws Throwable {
		conditiontypespage.VerifyaddNewConditionwithValidData();
	}

	@Test
	public void VerifyaddNewConditionwithoutDataTest() throws Throwable {
		conditiontypespage.VerifyaddNewConditionwithoutData();
	}

	@Test
	public void VerifyaddNewConditionwithInvalidLocationNameTest() throws Throwable {
		conditiontypespage.VerifyaddNewConditionwithInvalidLocationName();
	}

	@Test
	public void VerifyToTopArrowBtnTest() throws Throwable {
		conditiontypespage.VerifyToTopArrowBtn();
	}

	@Test
	public void VerifyNextPageBtnTest() throws Throwable {
		conditiontypespage.VerifyNextPageBtn();
	}

	@Test
	public void VerifyPreviousPageBtnTest() throws Throwable {
		conditiontypespage.VerifyPreviousPageBtn();
	}

	@Test
	public void VerifyPage3BtnTest() throws Throwable {
		conditiontypespage.VerifyPage3Btn();
	}

	@Test
	public void VerifySnoSortingTest() throws Throwable {
		conditiontypespage.VerifySnoSorting();
	}

	@Test
	public void VerifyConditionNameSortingTest() throws Throwable {
		conditiontypespage.VerifyConditionNameSorting();
	}

	@Test
	public void VerifyShowEntriesDropdownTest() {
		conditiontypespage.VerifyShowEntriesDropdown();
	}

	@Test(priority = 2)
	public void VerifyEditButtonBySearchConditionNameTest() throws Throwable {
		conditiontypespage.VerifyEditButtonBySearchConditionName();
	}

	@Test(priority = 3)
	public void VerifyDeleteButtonBySearchConditionNameTest() throws InterruptedException {
		conditiontypespage.VerifyDeleteButtonBySearchConditionName();
	}

	@Test(priority = 4)
	public void VerifyDeleteButtonByClickingYesTest() throws Throwable {
		conditiontypespage.VerifyDeleteButtonByClickingYes();
	}

	@Test
	public void VerifySearchTextFieldTest() throws InterruptedException {
		conditiontypespage.VerifySearchTextField();
	}

	@Test
	public void VerifySearchTextFieldWithInvalidDataTest() throws InterruptedException {
		conditiontypespage.VerifySearchTextFieldWithInvalidData();

	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
