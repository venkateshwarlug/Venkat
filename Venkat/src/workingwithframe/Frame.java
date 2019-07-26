package workingwithframe;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Frame {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	@BeforeTest 
	public void open()
	{
	pr=new ProfilesIni();
	fp=pr.getProfile("onlineQA");
	driver=new FirefoxDriver();
	driver.get("http://www.angelfire.com/super/bedwebs/");
	}
	@Test
	public void data() {
	List<WebElement>frames=driver.findElements(By.tagName("frame"));
	System.out.println("no.of frames are"+frames.size());
	}
}



