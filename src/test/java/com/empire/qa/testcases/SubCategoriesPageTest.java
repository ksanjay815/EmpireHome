package com.empire.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.empire.qa.base.BaseTest;
import com.empire.qa.pages.HomePage;
import com.empire.qa.pages.LoginPage;
import com.empire.qa.pages.SubCategoriesPage;

public class SubCategoriesPageTest extends BaseTest {
	LoginPage loginpage;
	HomePage homepage;
	SubCategoriesPage subcategoriespage;

	public SubCategoriesPageTest() throws Throwable {
		super();
	}

	@BeforeMethod
	public void setup() throws Throwable {
		initialization(); // using this method to load url & not creating object bcoz it is static method
							// in basetest
		loginpage = new LoginPage();
		homepage = new HomePage();
		subcategoriespage = new SubCategoriesPage();

		homepage = loginpage.VerifyLoginPage();
		subcategoriespage = homepage.verifySubCategoriesPage();
		Thread.sleep(2000);
	}

	@Test
	public void VerifySubCategoriesPageTitleTest() {

		String title = subcategoriespage.VerifySubCategoriesPageTitle();
		Assert.assertEquals(title, "Empire Home Admin Panel");
	}

	@Test
	public void VerifySubCategoriesTitleTextTest() {
		subcategoriespage.VerifySubCategoriesTitleText();
	}

	@Test
	public void VerifyBackBtnTest() throws InterruptedException {
		subcategoriespage.VerifyBackBtn();
	}

	@Test
	public void VerifybackBtnAddSubCategoryTypePg() throws InterruptedException {
		subcategoriespage.VerifybackBtnAddSubCategoryTypePg();
	}

	@Test(priority = 1)
	public void VerifyaddSubCategoryPagewithValidDataTest() throws Throwable {
		subcategoriespage.VerifyaddSubCategoryPagewithValidData();
	}

	@Test
	public void VerifyaddSubCategoryPagewithoutDataTest() throws Throwable {
		subcategoriespage.VerifyaddSubCategoryPagewithoutData();
	}

	@Test
	public void VerifyaddSubCategoryPagewithInvalidSubCategoryNameTest() throws Throwable {
		subcategoriespage.VerifyaddSubCategoryPagewithInvalidSubCategoryName();
	}

//	@Test
//	public void VerifyToTopArrowBtnTest() throws Throwable {
//		subcategoriespage.VerifyToTopArrowBtn();
//	}

//	@Test
//	public void VerifyNextPageBtnTest() throws Throwable {
//		subcategoriespage.VerifyNextPageBtn();
//	}
//
//	@Test
//	public void VerifyPreviousPageBtnTest() throws Throwable {
//		subcategoriespage.VerifyPreviousPageBtn();
//	}

	@Test
	public void VerifySnoSortingTest() throws Throwable {
		subcategoriespage.VerifySnoSorting();
	}

	@Test
	public void VerifySubCategoryNameSortingTest() throws Throwable {
		subcategoriespage.VerifySubCategoryNameSorting();
	}

	@Test
	public void VerifyShowEntriesDropdownTest() {
		subcategoriespage.VerifyShowEntriesDropdown();
	}

	@Test(priority = 2)
	public void VerifyEditButtonBySearchSubCategoryNameTest() throws Throwable {
		subcategoriespage.VerifyEditButtonBySearchSubCategoryName();
	}

	@Test(priority = 3)
	public void VerifyDeleteButtonBySearchSubCategoryNameTest() throws InterruptedException {
		subcategoriespage.VerifyDeleteButtonBySearchSubCategoryName();
	}

	@Test(priority = 4)
	public void VerifyDeleteButtonByClickingYesTest() throws Throwable {
		subcategoriespage.VerifyDeleteButtonByClickingYes();
	}

	@Test
	public void VerifySearchTextFieldTest() throws InterruptedException {
		subcategoriespage.VerifySearchTextField();
	}

	@Test
	public void VerifySearchTextFieldWithInvalidDataTest() throws InterruptedException {
		subcategoriespage.VerifySearchTextFieldWithInvalidData();

	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}