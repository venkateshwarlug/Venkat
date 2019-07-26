package testng;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeTest;

public class Tc1 {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver  driver;
	@BeforeTest
	public void open(){
		pr=new ProfilesIni();
		fp=pr.getProfile("onlineQA");
		driver=new FirefoxDriver();
		driver.get("https://www.hdnicewallpapers.com");
		
		
	}
	
	
	
	

}
