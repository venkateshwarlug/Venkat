


	

package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("onlineQA");
		FirefoxDriver driver= new FirefoxDriver(fp);
		driver.get("http://www.newtours.demoaut.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("venki");;
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("QA123");
		driver.findElement(By.xpath("//input[@value='login']")).click();

	}

}

