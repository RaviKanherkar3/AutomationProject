package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties prop;
	public ReadConfig(){
		try{
			FileInputStream src = new FileInputStream("./configurations/config.properties");
		    prop = new Properties();
			prop.load(src);
			
		}catch(Exception e){
			System.out.println("Exception is ::"+e.getMessage());
		}
	}
	
 public String getapplicationURL(){
		String url =prop.getProperty("baseURL");
		return url;
	}
 public String getusername(){
	 String username=prop.getProperty("username");
	 return username;
 }
 public String getpassword(){
	 String password=prop.getProperty("password");
	 return password;
 }
 public String getchromepath(){
	String chromepath = prop.getProperty("chromepath");
	return chromepath;
 }
 
}
