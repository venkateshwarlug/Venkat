package robot;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import org.sikuli.script.SikuliException;
import org.testng.annotations.BeforeTest;

public class Sikuli {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver  driver;
	@BeforeTest
	public void open(){
		pr=new ProfilesIni();
		fp=pr.getProfile("onlineQA");
		driver=new FirefoxDriver();
		driver.get("https://docs.seleniumhq.org/download/");
		driver.findElement(By.linkText("3.141.59")).click();
	}
          @Test
          public void data() throws SikuliException
          {
        	  
        	  Screen sc=new Screen();
        	 Pattern pt=new Pattern("C:\\New folder\\a.png");
        	 sc.click(pt);
          }
}