package appachipoi;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class GmailLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ProfilesIni pr=new ProfilesIni();
	 FirefoxProfile fp=pr.getProfile("onlineQA");
	FirefoxDriver  driver=new FirefoxDriver();
	  driver.get("https://www.google.com/");
	  driver.findElement(By.className("gb_d")).click();
String actual=driver.getTitle();
String expected="Gmail";
	if(expected.contains(actual))
	{
		System.out.println("succ");
	}
	else
	{
	System.out.println("fail");
	}
	}
}