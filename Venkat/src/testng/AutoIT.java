package testng;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeTest;

public class AutoIT 
{
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver  driver;
	@BeforeTest
	public void open()
	{
		pr=new ProfilesIni();
		fp=pr.getProfile("onlineQA");
		driver=new FirefoxDriver();
		driver.get("https://docs.seleniumhq.org/download/");
		driver.findElement(By.linkText("3.141.59")).click();
		}
        @Test
        public void data() throws InterruptedException, IOException
        {

      Thread.sleep(3000);
      java.lang.Runtime.getRuntime().exec("C:\\Users\\lenovo\\Desktop\\abc.exe");
      
      
        }

}



