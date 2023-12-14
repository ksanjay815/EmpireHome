package com.empire.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.empire.qa.base.BaseTest;
import com.empire.qa.pages.AddInventoryPage;
import com.empire.qa.pages.AllInventorypage;
import com.empire.qa.pages.HomePage;
import com.empire.qa.pages.LoginPage;
import com.empire.qa.utils.UtilTest;





public class AddInventoryTest extends BaseTest {

	LoginPage loginpage;
	HomePage homepage;
	AddInventoryPage addInvpg;
	AllInventorypage allinvpg;
	static String shname = "Sheet1";

	public AddInventoryTest() throws Throwable {
		super();

	}

	@BeforeMethod
	public void setup() throws Throwable {
		initialization(); // using this method to load url & not creating object bcoz it is static method
							// in basetest
		loginpage = new LoginPage();
		homepage = new HomePage();
		addInvpg = new AddInventoryPage(); // bcoz we are using return addinventory in homepage
		allinvpg= new AllInventorypage();
		homepage = loginpage.VerifyLoginPage(); // using hp bcoz after login landing on homepage(hp)
		addInvpg = homepage.verifyEhomepage(); // using addInvpg bcoz after homepage landing on addInvpg
		Thread.sleep(1200);
		}

	@DataProvider
	public Object[][] Exceldata() {
		Object[][] data = UtilTest.getExcelData(shname);
		return data;

	}

	@Test(priority = 1)
	public void VerifyAddInventoryPageTitleTest() {

		String title = addInvpg.verifyaddInventoryTitle();
		Assert.assertEquals(title, "Empire Home Admin Panel");
	}

	@Test(dataProvider = "Exceldata")
	public void VerifyAddInventoryPageTest(String modelno, String itemTitle, String itemDescription, String brand,
			String Height, String Width, String Breadth, String colorname, String actualPrice, String HSNcode,
			String Rackname, String supplierDetails, String Invoiceno, String qty) throws Throwable {
		allinvpg = addInvpg.verifyaddInventorypage(modelno, itemTitle, itemDescription, brand, Height, Width, Breadth,
				colorname, actualPrice, HSNcode, Rackname, supplierDetails, Invoiceno, qty);
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
