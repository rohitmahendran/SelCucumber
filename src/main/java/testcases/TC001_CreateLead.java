package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC001_CreateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		
		testCaseName="TC003_CreateLead";
		testDescription="login and createLead in LeafTaps Application";
		testNodes="Leads";
		category="Smoke";
		authors="Rohit";
		browserName="chrome";
		dataSheetName="TC003";
	}
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String FName, String LName, String CName) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLead()
		.clickCreateLead()
		.enterFirstName(FName)
		.enterLasttName(LName)
		.enterCompanyName(CName);
		
		
		
		
		
}

}
