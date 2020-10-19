package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import utilities.ReadConfig;


public class BaseClass {
	ReadConfig readconfig = new ReadConfig();
	
	public String baseURL = readconfig.getapplicationURL();
	public String username = readconfig.getusername();
	public String password = readconfig.getpassword();
	public static WebDriver driver ;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{	
		if (br.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",readconfig.getchromepath());
			driver = new ChromeDriver();			
		}
		driver.get(baseURL);
	
		
	}
	@AfterClass
	public void teardown(){
		driver.quit();
	}

}
