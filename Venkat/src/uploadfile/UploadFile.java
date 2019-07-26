package uploadfile;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeTest;

public class UploadFile {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	
@BeforeTest
public void open(){
	 pr=new ProfilesIni();
	  fp=pr.getProfile("onlineQA");
	 driver=new FirefoxDriver();
	  driver.get("http://www.hdnicewallpapers.com/Wallpaper-Download/Butterfly/Orange-Butterfly-on-Purple-Flower");

}
}	
	
	
