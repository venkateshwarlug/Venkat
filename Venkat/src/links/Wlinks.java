package links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Wlinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("onlineQA");
		 FirefoxDriver driver = new FirefoxDriver(fp);
		 driver.get("http://www.bing.com");
		 List<WebElement>links=driver.findElements(By.tagName("a"));
		 System.out.println("no.of links are"+" "+links.size());

	}




	}


