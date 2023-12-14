package com.empire.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.empire.qa.base.BaseTest;
import com.empire.qa.pages.AddInventoryPage;
import com.empire.qa.pages.HomePage;
import com.empire.qa.pages.LoginPage;



public class HomePageTest extends BaseTest {

	LoginPage loginpage;
	HomePage homepage;
	AddInventoryPage addInvpg;

	public HomePageTest() throws Throwable {
		super();

	}

	@BeforeMethod
	public void setup() throws Throwable {
		initialization(); // using this method to load url & not creating object bcoz it is static method
							// in basetest
		loginpage = new LoginPage();
		homepage = new HomePage();
		addInvpg = new AddInventoryPage();  // bcoz we are using return addinventory in homepage
		homepage=loginpage.VerifyLoginPage();   // using hp bcoz after login landing on homepage(hp)
		Thread.sleep(1200);
		}

	@Test(priority = 1)
	public void verifyEhomepageTitleTest() {

		String title = homepage.verifyEhomepageTitle();
		Assert.assertEquals(title, "Empire Home Admin Panel");
	}

	@Test(priority = 2)
	public void verifyEhomepageTest() throws Throwable {
		addInvpg=homepage.verifyEhomepage();  //// using addInvpg bcoz after login landing on addInventorypage(addInvpg)
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
