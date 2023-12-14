package com.empire.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.empire.qa.base.BaseTest;
import com.empire.qa.pages.HomePage;
import com.empire.qa.pages.InventoryStatusPage;
import com.empire.qa.pages.LoginPage;

public class InventoryStatusPageTest extends BaseTest {
	LoginPage loginpage;
	HomePage homepage;
	InventoryStatusPage inventorystatuspage;

	public InventoryStatusPageTest() throws Throwable {
		super();

	}

	@BeforeMethod
	public void setup() throws Throwable {
		initialization(); // using this method to load url & not creating object bcoz it is static method
							// in basetest
		loginpage = new LoginPage();
		homepage = new HomePage();
		inventorystatuspage = new InventoryStatusPage();

		homepage = loginpage.VerifyLoginPage();
		inventorystatuspage = homepage.verifyInventoryStatusPage();
		Thread.sleep(1200);
	}

	@Test
	public void VerifyinventorystatuspageTitleTest() {

		String title = inventorystatuspage.VerifyInventoryPageTitle();
		Assert.assertEquals(title, "Empire Home Admin Panel");
	}

	@Test
	public void VerifyBackBtnTest() throws InterruptedException {
		inventorystatuspage.VerifyBackBtn();
	}

	@Test
	public void VerifybackBtnAddStatusPg() throws InterruptedException {
		inventorystatuspage.VerifybackBtnAddStatusPg();
	}

	@Test(priority = 1)
	public void VerifyaddStatusTypewithValidDataTest() throws Throwable {
		inventorystatuspage.VerifyaddStatusTypewithValidData();
	}

	@Test
	public void VerifyaddStatusTypewithoutDataTest() throws Throwable {
		inventorystatuspage.VerifyaddStatusTypewithoutData();
	}

	@Test
	public void VerifyaddNewStatusTypewithInvalidLocationNameTest() throws Throwable {
		inventorystatuspage.VerifyaddNewStatusTypewithInvalidLocationName();
	}

	@Test
	public void VerifyToTopArrowBtnTest() throws Throwable {
		inventorystatuspage.VerifyToTopArrowBtn();
	}

	@Test
	public void VerifyNextPageBtnTest() throws Throwable {
		inventorystatuspage.VerifyNextPageBtn();
	}

	@Test
	public void VerifyPreviousPageBtnTest() throws Throwable {
		inventorystatuspage.VerifyPreviousPageBtn();
	}

	@Test
	public void VerifyPage3BtnTest() throws Throwable {
		inventorystatuspage.VerifyPage3Btn();
	}

	@Test
	public void VerifySnoSortingTest() throws Throwable {
		inventorystatuspage.VerifySnoSorting();
	}

	@Test
	public void VerifyStatusNameSortingTest() throws Throwable {
		inventorystatuspage.VerifyStatusNameSorting();
	}

	@Test
	public void VerifyShowEntriesDropdownTest() {
		inventorystatuspage.VerifyShowEntriesDropdown();
	}

	@Test(priority = 2)
	public void VerifyEditButtonBySearchStatusNameTest() throws Throwable {
		inventorystatuspage.VerifyEditButtonBySearchStatusName();
	}

	@Test(priority = 3)
	public void VerifyDeleteButtonBySearchStatusNameTest() throws InterruptedException {
		inventorystatuspage.VerifyDeleteButtonBySearchStatusName();
	}

	@Test(priority = 4)
	public void VerifyDeleteButtonByClickingYesTest() throws Throwable {
		inventorystatuspage.VerifyDeleteButtonByClickingYes();
	}

	@Test
	public void VerifySearchTextFieldTest() throws InterruptedException {
		inventorystatuspage.VerifySearchTextField();
	}

	@Test
	public void VerifySearchTextFieldWithInvalidDataTest() throws InterruptedException {
		inventorystatuspage.VerifySearchTextFieldWithInvalidData();

	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
