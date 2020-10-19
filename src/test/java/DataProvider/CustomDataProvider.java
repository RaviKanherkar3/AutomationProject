package DataProvider;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {
	
	@DataProvider(name="LoginDataProvider")
	public Object[][] gedata(){
		Object[][]  data ={ {"abc@gmail.com","abc"},{"xyz@gmail.com","xyz"}};
		return data;
	}

}
