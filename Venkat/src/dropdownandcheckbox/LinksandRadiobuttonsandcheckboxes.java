package dropdownandcheckbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class LinksandRadiobuttonsandcheckboxes {
	

		public static void main(String[] args) {
			ProfilesIni pr=new ProfilesIni();
			FirefoxProfile fp=pr.getProfile("online QA");
			FirefoxDriver driver=new FirefoxDriver(fp);
			driver.get("http://spicejet.com/");
			List<WebElement>elements=driver.findElements(By.tagName("a"));
			System.out.println("no.of links"+" "+elements.size());
			elements=driver.findElements(By.tagName("select"));
			System.out.println("no.of drop down are"+" "+elements.size());
			elements=driver.findElements(By.xpath("//input[@type='radio']"));
			System.out.println("no.of radios buttons"+" "+elements.size());
			elements=driver.findElements(By.xpath("//input[@type='checkbox']"));
			System.out.println("no.of check boxes"+" "+elements.size());

}
		
		
}
