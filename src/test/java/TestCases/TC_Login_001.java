package TestCases;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import PageObject.PO_Login;

public class TC_Login_001 extends BaseClass {
	
	//PO_Login login = PageFactory.initElements(driver,PO_Login.class);
	
	@Test
	public void logintest(){
		PO_Login login = PageFactory.initElements(driver,PO_Login.class);
		
		driver.get(baseURL);
		login.setusername(username);
		login.setpassword(password);
	    login.clicKOnLoginButton();	
		
		
		
	}
   
}
