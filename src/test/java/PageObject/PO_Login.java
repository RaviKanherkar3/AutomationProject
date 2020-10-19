package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class PO_Login {
	public  WebDriver driver;
	
	public PO_Login(WebDriver driver){
     this.driver=driver;
     
	}
	@FindBy(how=How.XPATH,using="//input[@name='username']")
    private	WebElement txt_username;
	@FindBy(how=How.NAME,using="password")
    private  WebElement txt_password;
	@FindBy(how=How.XPATH,using="//input[@type='submit']")
	private WebElement click_button;
	public void setusername(String arg){
		txt_username.sendKeys(arg);
	}
	public void setpassword(String arg){	
		txt_password.sendKeys(arg);
	}
	public void clicKOnLoginButton(){
		click_button.click();
	}
	
}