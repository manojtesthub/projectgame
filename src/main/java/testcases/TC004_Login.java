package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import linked.LoginPage1;
import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC004_Login extends OpentapsWrappers {
	
	@BeforeClass
	public void setData(){
		browserName="chrome";
		dataSheetName="tc0014";
		testCaseName="Login";
		testDescription="Login to Opentaps(Positive)";
	}
	
	
	@Test(dataProvider="fetchData")
	public void login(String username,String password,String keyword, String comp){
		
		new LoginPage1()
		
		.enterUsername(username)
		.enterPassword(password)
		
		.clickSignIn()
		.clickAdvanced()
		.enterKeyword(keyword)
		.enterCompany(comp)
		.clickSeach();
	}
	
	
	
	
	
	
	
	
	
	
}
