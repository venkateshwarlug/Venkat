package explicitwait;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenFF {
	public static void main(String[] args)throws IOException 
	{
		// TODO Auto-generated method stub
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("OnlineQA");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		WebDriverWait wait=new WebDriverWait(driver,20);
		//wait.until(Excepted Conditions.presence of Element located(By.linkText("Gmail"));
		driver.findElement( By.linkText("Gmail")).click();
     // wait.until(Expected conditions.presence of Element located(locator));
	}

}
