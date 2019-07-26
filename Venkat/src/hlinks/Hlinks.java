package hlinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Hlinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("onlineQA");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.bing.com");
		WebElement header=driver.findElement(By.id("sc_hdu"));
		List<WebElement>links=header.findElements(By.tagName("a"));
		System.out.println("no.of links from header part"+" "+links.size());


	}

}
