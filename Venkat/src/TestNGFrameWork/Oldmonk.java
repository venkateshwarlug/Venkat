package TestNGFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeTest;

public class Oldmonk {

	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver  driver;
	@BeforeTest
	public void open()
	{
		pr=new ProfilesIni();
		fp=pr.getProfile("onlineQA");
		driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("ivImagesTabHeading")).click();
		driver.findElement(By.id("a-popover-lgtbox")).click();

		}
	

}
