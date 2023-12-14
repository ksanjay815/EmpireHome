package com.empire.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.empire.qa.base.BaseTest;
import com.empire.qa.pages.CategoryTypesPage;
import com.empire.qa.pages.HomePage;
import com.empire.qa.pages.LoginPage;

public class CategoryTypesPageTest extends BaseTest {
	LoginPage loginpage;
	HomePage homepage;
	CategoryTypesPage categorytypepage;

	public CategoryTypesPageTest() throws Throwable {
		super();

	}

	@BeforeMethod
	public void setup() throws Throwable {
		initialization(); // using this method to load url & not creating object bcoz it is static method
							// in basetest
		loginpage = new LoginPage();
		homepage = new HomePage();
		categorytypepage = new CategoryTypesPage();

		homepage = loginpage.VerifyLoginPage();
		categorytypepage = homepage.verifyCategoryTypePage();
		Thread.sleep(1200);
	}

	@Test
	public void VerifyCategoryTypesPageTitleTest() {

		String title = categorytypepage.VerifyCategoryTypesPageTitle();
		Assert.assertEquals(title, "Empire Home Admin Panel");
	}

	@Test
	public void VerifyBackBtnTest() throws InterruptedException {
		categorytypepage.VerifyBackBtn();
	}

	@Test
	public void VerifybackBtnAddCategoryTypePg() throws InterruptedException {
		categorytypepage.VerifybackBtnAddCategoryTypePg();
	}

	@Test(priority = 1)
	public void VerifyaddNewCategoryPagewithValidDataTest() throws InterruptedException {
		categorytypepage.VerifyaddNewCategoryPagewithValidData();
	}

	@Test
	public void VerifyaddNewCategoryPagewithoutDataTest() throws Throwable {
		categorytypepage.VerifyaddNewCategoryPagewithoutData();
	}

	@Test
	public void VerifyaddNewCategoryPagewithInvalidCategoryNameTest() throws Throwable {
		categorytypepage.VerifyaddNewCategoryPagewithInvalidCategoryName();
	}

	@Test
	public void VerifyToTopArrowBtnTest() throws Throwable {
		categorytypepage.VerifyToTopArrowBtn();
	}

	@Test
	public void VerifyNextPageBtnTest() throws Throwable {
		categorytypepage.VerifyNextPageBtn();
	}

	@Test
	public void VerifyPreviousPageBtnTest() throws Throwable {
		categorytypepage.VerifyPreviousPageBtn();
	}

//	@Test
//	public void VerifyPage2BtnTest() throws Throwable {
//		categorytypepage.VerifyPage2Btn();
//	}
//
//	@Test
//	public void VerifyPage3BtnTest() throws Throwable {
//		categorytypepage.VerifyPage3Btn();
//	}

	@Test
	public void VerifySnoSortingTest() throws Throwable {
		categorytypepage.VerifySnoSorting();
	}

	@Test
	public void VerifyCategoryNameSortingTest() throws Throwable {
		categorytypepage.VerifyCategoryNameSorting();
	}

	@Test
	public void VerifyShowEntriesDropdownTest() {
		categorytypepage.VerifyShowEntriesDropdown();
	}

	@Test
	public void VerifySearchTextFieldTest() {
		categorytypepage.VerifySearchTextField();
	}

	@Test
	public void VerifySearchTextFieldWithInvalidDataTest() {
		categorytypepage.VerifySearchTextFieldWithInvalidData();

	}

	@Test(priority = 2)
	public void VerifyEditButtonBySearch_CategoryNameTest() throws Throwable {
		categorytypepage.VerifyEditButtonBySearch_CategoryName();
	}

	@Test(priority = 3)
	public void VerifyDeleteButtonBySearch_TypeNameTest() throws InterruptedException {
		categorytypepage.VerifyDeleteButtonBySearch_TypeName();
	}

	@Test(priority = 4)
	public void VerifyDeleteButtonByClickingYesTest() throws Throwable {
		categorytypepage.VerifyDeleteButtonByClickingYes();
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}