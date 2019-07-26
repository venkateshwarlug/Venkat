package bvr1;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class URL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProfilesIni pr=new ProfilesIni();
		 FirefoxProfile fp=pr.getProfile("onlineQA");
		FirefoxDriver  driver=new FirefoxDriver();
		  driver.get("https://www.bing.com/");
	}

}
