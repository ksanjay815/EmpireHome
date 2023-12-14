package com.empire.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.empire.qa.base.BaseTest;
import com.empire.qa.pages.HomePage;
import com.empire.qa.pages.LoginPage;

public class LoginPageTest extends BaseTest{

	LoginPage loginpage;
	HomePage homepage;
	public LoginPageTest() throws Throwable {
		super();}
		@BeforeMethod
		public void setup() throws Throwable {
			initialization(); // using this method to load url & not creating object bcoz it is static method
								// in basetest
			loginpage = new LoginPage();
			homepage = new HomePage();
			Thread.sleep(1200);
		}

		@Test(priority =1)
		public void VerifyEhomeTitleTest() {

			String title = loginpage.VerifyEhomeTitle();
			Assert.assertEquals(title, "Empire Home Admin Panel");
		}

		@Test(priority =2)
		public void VerifyEhomeImageTest() {

			boolean img = loginpage.VerifyEhomeImage();
			Assert.assertTrue(img);
		}

		@Test(priority =3)
		public void VerifyLoginPageTest() throws Throwable {
			homepage = loginpage.VerifyLoginPage(); // hp(homepage) is used bcoz after login it will redirect to homepage

		}

		@AfterMethod
		public void teardown() {
			driver.quit();
		}

	}
