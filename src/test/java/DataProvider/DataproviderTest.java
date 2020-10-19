package DataProvider;

import org.testng.annotations.Test;

public class DataproviderTest {
	
	@Test(dataProvider="LoginDataProvider",dataProviderClass=CustomDataProvider.class)
	public void logintest(String email , String password){
		System.out.println(email+ "   "+password);
	}
	
	
	
	
	
}
