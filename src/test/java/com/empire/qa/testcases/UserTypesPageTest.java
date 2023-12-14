package com.empire.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.empire.qa.base.BaseTest;
import com.empire.qa.pages.HomePage;
import com.empire.qa.pages.LoginPage;
import com.empire.qa.pages.UserTypesPage;

public class UserTypesPageTest extends BaseTest {
	LoginPage loginpage;
	HomePage homepage;

	UserTypesPage usertypepage;

	public UserTypesPageTest() throws Throwable {
		super();

	}

	@BeforeMethod
	public void setup() throws Throwable {
		initialization(); // using this method to load url & not creating object bcoz it is static method
							// in basetest
		loginpage = new LoginPage();
		homepage = new HomePage();
		usertypepage = new UserTypesPage();

		homepage = loginpage.VerifyLoginPage();
		usertypepage = homepage.verifyUserTypePage();
		Thread.sleep(2000);
	}

	@Test
	public void VerifyUserTypePageTitleTest() {

		String title = usertypepage.VerifyUserTypePageTitle();
		Assert.assertEquals(title, "Empire Home Admin Panel");
	}

	@Test
	public void VerifyBackBtnTest() throws InterruptedException {
		usertypepage.VerifyBackBtn();
	}

	@Test
	public void VerifybackBtnAddUserTypePgTest() throws InterruptedException {
		usertypepage.VerifybackBtnAddUserTypePg();
	}

	@Test(priority = 1)
	public void VerifyaddNewUserTypePagewithValidDataTest() throws Throwable {
		usertypepage.VerifyaddNewUserTypePagewithValidData();
	}

	@Test
	public void VerifyaddNewUserTypePagewithoutData() throws Throwable {
		usertypepage.VerifyaddNewUserTypePagewithoutData();
	}

	@Test
	public void VerifyaddNewUserTypePagewithInvalidTypeNameTest() throws Throwable {
		usertypepage.VerifyaddNewUserTypePagewithInvalidTypeName();
	}

	@Test
	public void VerifyaddNewUserTypePagewithInvalidTypeCodeTest() throws Throwable {
		usertypepage.VerifyaddNewUserTypePagewithInvalidTypeCode();
	}

	@Test
	public void VerifyToTopArrowBtnTest() throws Throwable {
		usertypepage.VerifyToTopArrowBtn();
	}

	@Test
	public void VerifyNextPageBtnTest() throws Throwable {
		usertypepage.VerifyNextPageBtn();
	}

	@Test
	public void VerifyPreviousPageBtnTest() throws Throwable {
		usertypepage.VerifyPreviousPageBtn();
	}

	@Test
	public void VerifyPage2BtnTest() throws Throwable {
		usertypepage.VerifyPage2Btn();
	}

	@Test
	public void VerifyPage3BtnTest() throws Throwable {
		usertypepage.VerifyPage3Btn();
	}

	@Test
	public void VerifySnoSortingTest() throws Throwable {
		usertypepage.VerifySnoSorting();
	}

	@Test
	public void VerifyTypeNameSortingTest() throws Throwable {
		usertypepage.VerifyTypeNameSorting();
	}

	@Test
	public void VerifyTypeCodeSortingTest() throws Throwable {
		usertypepage.VerifyTypeCodeSorting();
	}

	@Test
	public void VerifyShowEntriesDropdownTest() {
		usertypepage.VerifyShowEntriesDropdown();
	}

	@Test
	public void VerifySearchTextFieldTest() {
		usertypepage.VerifySearchTextField();
	}

	@Test
	public void VerifySearchTextFieldWithInvalidDataTest() {
		usertypepage.VerifySearchTextFieldWithInvalidData();

	}

	@Test(priority = 2)
	public void VerifyEditButtonBySearch_TypeNameTest() throws Throwable {
		usertypepage.VerifyEditButtonBySearch_TypeName();
	}

	@Test(priority = 3)
	public void VerifyDeleteButtonBySearch_TypeNameTest() throws InterruptedException {
		usertypepage.VerifyDeleteButtonBySearch_TypeName();
	}

	@Test(priority = 4)
	public void VerifyDeleteButtonByClickingYesTest() throws Throwable {
		usertypepage.VerifyDeleteButtonByClickingYes();
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}